package assignmentoodj;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Darshini Dakshyani Beerachee TP060519
 */
public class VacInventoryManagementPage extends JFrame implements
        ActionListener {

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == iconButton) {
            // to get rid of opened table
            if (tableFrame != null && tableFrame.isShowing()) {
                tableFrame.dispose();
            }
            String centreStr = (centre.getSelectedIndex() == -1) ? "" : centre.getSelectedItem().toString();
            String vacStr = (vName.getSelectedIndex() == -1) ? "" : vName.getSelectedItem().toString();
            displayTable(centreStr, vacStr);

        } else if (e.getSource() == btnAddVac) {
            if (tableFrame != null && tableFrame.isShowing()) {
                tableFrame.dispose();
            }
            CreateVacInventoryPage vacAdd = new CreateVacInventoryPage();
            vacAdd.frame.setVisible(true);

        } else if (e.getSource() == btnDelete) {
            // i = the index of the selected row
            int i = table.getSelectedRow();
            if (i >= 0) {
                // remove a row from jtable
                model.removeRow(i);
                // Delete row from array of buffered file records
                VaccineInventoryIO.allVacSupplies.remove((int) rowIndexes
                        .get(i));
            } else {
                JOptionPane.showMessageDialog(tableFrame,
                        "Please Select row to be Deleted !");
            }
        } else if (e.getSource() == btnUpdate) {
            int i = table.getSelectedRow();

            if (i >= 0) {
                updateRecord(updData);
            } else {
                JOptionPane.showMessageDialog(tableFrame,
                        "Please Select row to be Updated !");
            }

        } else if (e.getSource() == btnUpdAdd) {  //in update record frame
            try {
                if (q.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(btnUpdAdd, "Data Missing");
                } else if (Integer.parseInt(q.getText()) < 0) {
                    JOptionPane.showMessageDialog(btnUpdAdd,
                            "Quantity cannot be negative !");
                } else if (Integer.parseInt(q.getText()) >= 0) {
                    updateVaccineSupply(Integer.parseInt(q.getText()));
                }

            } catch (Exception ex) {
                if (!q.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(btnUpdAdd, "Wrong input!");
                }
            }

        } else if (e.getSource() == btnUpdRem) {  //in update record frame
            try {
                if (q.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(btnUpdRem, "Data Missing");
                } else if (Integer.parseInt(q.getText()) < 0) {
                    JOptionPane.showMessageDialog(btnUpdRem,
                            "Quantity cannot be negative !");
                } else if (Integer.parseInt(q.getText()) >= 0) {
                    updateVaccineSupply(-Integer.parseInt(q.getText()));
                }
            } catch (Exception ex) {
                if (!q.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(btnUpdRem, "Wrong input!");
                }
            }

        } else if (e.getSource() == btnSave) {

            int reply = JOptionPane.showConfirmDialog(null,
                    "Confirm Save records to File ?", "WARNING",
                    JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                if (VaccineInventoryIO.write() == 0) {
                    JOptionPane.showMessageDialog(tableFrame,
                            "Records Saved Successfully !");
                } else {
                    JOptionPane.showMessageDialog(tableFrame,
                            "ERROR: No Records Saved !");
                }
            } else {
                JOptionPane.showMessageDialog(tableFrame,
                        "Operation Cancelled: No Records Saved !");
            }
        } else if (e.getSource() == btnBack) {
            queryFrame.setVisible(false);
            PersonnelMainPage pmp = new PersonnelMainPage();
            pmp.setVisible(true);

        }

    }

    // No of columns in table data to be displayed
    private static final int NB_COL = 4;

    public JFrame queryFrame;

    private JFrame tableFrame, updFrame;
    private JButton btnAddVac, iconButton, btnDelete, btnUpdate, btnSave,
            btnUpdAdd, btnUpdRem, btnBack;
    private JComboBox centre, vName;
    private JLabel lblCentre, lblVac, lblQnt, lblTitle, lblSCrit;
    private JTable table;
    private JTextField c, v, q;

    private DefaultTableModel model;

    // Indexes of rows of loaded data from file
    // which are retrieved after query and displayed
    private ArrayList<Integer> rowIndexes;

    // Pane / Frame width
    private int pWidth = 780;

    // Label position
    private int lPosX = 60;
    private int lPosY = 80;

    // Field position
    private int fPosX = 130;
    private int fPosY = 78;

    // Button position
    private int bPosX = 600;
    private int bPosY = 130;

    private String[] updData = new String[NB_COL + 1];

    public VacInventoryManagementPage() {
        searchCriteria();

    }

    private void searchCriteria() {
        /**
         * Initialize the contents of the query criteria frame.
         */
        queryFrame = new JFrame("Vaccine Management");
        queryFrame.setBounds(600, 250, pWidth, 300);
        queryFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel p = new JPanel();
        p.setLayout(null);

        btnBack = new JButton("<< Back");
        btnBack.setBounds(lPosX - 5, lPosY - 60, 100, 25);
        btnBack.addActionListener(this);
        p.add(btnBack);

        lblTitle = new JLabel("Manage Vaccine Stock");
        lblTitle.setBounds(lPosX + 215, lPosY - 50, 300, 30);
        lblTitle.setForeground(Color.BLUE);
        lblTitle.setFont(new Font("", Font.BOLD, 20));

        lblSCrit = new JLabel("Search Criteria:");
        lblSCrit.setBounds(lPosX, lPosY - 10, 300, 30);
        lblSCrit.setFont(new Font("", Font.BOLD, 15));

        btnAddVac = new JButton("Allocate vaccine");
        btnAddVac.setBounds(bPosX - 100, bPosY + 10, 200, 25);
        btnAddVac.addActionListener(this);

        // Add query criteria (list of values - ComboBox)
        lblCentre = new JLabel("Centre");
        lblCentre.setBounds(lPosX, lPosY + 40, 60, 14);

        centre = new JComboBox(Centre.values());
        // Option to have a "null" item displayed first by default
        centre.insertItemAt("", 0);
        centre.setSelectedIndex(-1);

        centre.setBounds(fPosX, fPosY + 40, 200, 20);

        lblVac = new JLabel("Vaccine");
        lblVac.setBounds(lPosX, lPosY + 80, 60, 14);

        vName = new JComboBox(VaccineName.values());
        // Option to have a "null" item displayed first by default
        vName.insertItemAt("", 0);
        vName.setSelectedIndex(-1);
        vName.setBounds(fPosX, fPosY + 80, 200, 20);

        /**
         * Following source code obtained from (tutorialspoint, 2021)
         */
        // Search button icon
        ImageIcon srchIcon = null;
        String iconFile = "search.jpg";
        java.net.URL imgURL = VacInventoryManagementPage.class
                .getResource(iconFile);
        if (imgURL != null) {
            srchIcon = new ImageIcon(imgURL);
        } else {
            JOptionPane.showMessageDialog(queryFrame, "Icon image file"
                    + iconFile + " not found !");
        }

        /**
         *
         */
        // Create icon button
        iconButton = new JButton(srchIcon);
        iconButton.setToolTipText("Search");
        iconButton.setBounds(bPosX - 250, bPosY + 10, 30, 30);
        iconButton.addActionListener(this);

        // Add label, fields/combo-boxes, buttons to panel
        p.add(btnAddVac);
        p.add(lblCentre);
        p.add(centre);
        p.add(lblVac);
        p.add(vName);
        p.add(iconButton);
        p.add(lblTitle);
        p.add(lblSCrit);
        // Add panel to frame
        queryFrame.add(p);
        queryFrame.setVisible(false);

    }

    private void displayTable(String cent, String vac) {
        // create JFrame and JTable
        tableFrame = new JFrame("LIST OF VACCINE IN STOCK");
        tableFrame.setLayout(null);
        tableFrame.setBounds(600, 500, pWidth, 300);
        tableFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        table = new JTable();
        Object[] columns = {"ID", "CENTRE", "VACCINE", "QUANTITY"};
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        // set the model to the table
        table.setModel(model);

        // Change A JTable Background Color, Font Size, Font Color, Row Height
        table.setForeground(Color.black);
        table.setRowHeight(25);
        // // Set Table Header font to Bold
        JTableHeader th = table.getTableHeader();
        Font font = new Font("", Font.BOLD, 13);
        th.setFont(font);
        th.setBackground(Color.LIGHT_GRAY);

        // Makes it Read only (not editable)
        table.setDefaultEditor(Object.class, null);

        // create JButtons
        btnDelete = new JButton("Delete");
        btnUpdate = new JButton("Update");
        btnSave = new JButton("Save");

        btnUpdate.setBounds(bPosX, bPosY + 10, 100, 25);
        btnDelete.setBounds(bPosX, bPosY + 45, 100, 25);
        btnSave.setBounds(bPosX, bPosY + 80, 100, 25);

        // adding it to JScrollPane //
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(0, 0, pWidth - 15, 120);

        // Add table to frame
        tableFrame.add(sp);

        ArrayList<VaccineSupply> supplies = new ArrayList<VaccineSupply>();
        supplies = VaccineInventoryIO.allVacSupplies;

        // create an array of objects to set the row data
        final Object[] data = new Object[NB_COL];

        rowIndexes = new ArrayList<Integer>();

        for (int i = 0; i < supplies.size(); i++) {
            if (cent == "" && supplies.get(i).getVacName().equals(vac)
                    || supplies.get(i).getCentre().equals(cent) && vac == ""
                    || supplies.get(i).getVacName().equals(vac)
                    && supplies.get(i).getCentre().equals(cent)
                    || cent == "" && vac == "") {

                data[0] = supplies.get(i).getId();
                data[1] = supplies.get(i).getCentre();
                data[2] = supplies.get(i).getVacName();
                data[3] = supplies.get(i).getQuantity();
                model.addRow(data);
                // Set rowIndexes with the index of the records found
                rowIndexes.add(i);
            }
        }

        // add JButtons to the jframe
        tableFrame.add(btnDelete);
        tableFrame.add(btnUpdate);
        tableFrame.add(btnSave);

        btnDelete.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnSave.addActionListener(this);

        tableFrame.setVisible(true);

// get selected row data From table to display
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    // i = the index of the selected row
                    int i = table.getSelectedRow();
                    for (int j = 0; j < NB_COL; j++) {
                        updData[j] = table.getValueAt(i, j).toString();
                    }
                    updData[NB_COL] = String.valueOf(i);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(tableFrame,
                            "ERROR: Please try again !");
                }
            }
        });
    }

    private void updateRecord(String[] data) {
        // Initialize the update record frame
        updFrame = new JFrame("Update Record");
        updFrame.setBounds(600, 650, 600, 200);
        updFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        updFrame.setLayout(null);

        lblCentre = new JLabel("Centre");
        lblCentre.setBounds(lPosX, lPosY - 50, 100, 14);

        c = new JTextField();
        c.setBounds(fPosX, fPosY - 50, 200, 20);
        c.setText(data[1]);
        c.setEditable(false);

        lblVac = new JLabel("Vaccine");
        lblVac.setBounds(lPosX, lPosY - 10, 60, 14);

        v = new JTextField();
        v.setBounds(fPosX, fPosY - 10, 90, 20);
        v.setText(data[2]);
        v.setEditable(false);

        lblQnt = new JLabel("Quantity");
        lblQnt.setBounds(lPosX, lPosY + 40, 60, 14);

        q = new JTextField();
        q.setBounds(fPosX, fPosY + 40, 90, 20);
//        q.setColumns(10);

        btnUpdAdd = new JButton("Add");
        btnUpdRem = new JButton("Remove");

        btnUpdAdd.setBounds(lPosX + 300, lPosY + 40, 90, 20);
        btnUpdRem.setBounds(lPosX + 400, lPosY + 40, 90, 20);

        btnUpdAdd.addActionListener(this);
        btnUpdRem.addActionListener(this);

        updFrame.add(lblCentre);
        updFrame.add(c);
        updFrame.add(lblVac);
        updFrame.add(v);
        updFrame.add(lblQnt);
        updFrame.add(q);
        updFrame.add(btnUpdAdd);
        updFrame.add(btnUpdRem);

        updFrame.setVisible(true);
    }

    private void updateVaccineSupply(int quantity) {
        // i = the index of the selected row
        int i = Integer.parseInt(updData[NB_COL]);
        if (i >= 0) {
            // Retrieve original supply from buffered records
            VaccineSupply supply = VaccineInventoryIO.allVacSupplies
                    .get((int) rowIndexes.get(i));

            int newSup = supply.getQuantity() + quantity;
            if (newSup < 0) {
                JOptionPane.showMessageDialog(
                        btnUpdRem,
                        "ERROR: Incorrect quantity [In Stock: "
                        + supply.getQuantity() + "]!");
            } else if (newSup >= 0) {
                model.setValueAt(newSup, i, 3);
                // Update quantity
                supply.setQuantity(newSup);

                // Update array of buffered file records
                VaccineInventoryIO.allVacSupplies.set((int) rowIndexes.get(i),
                        supply);
                updFrame.dispose();
                // To refresh state of table
                model.fireTableDataChanged();
            } else {
                JOptionPane.showMessageDialog(updFrame,
                        "Error during update and refresh of displayed table !");
            }
        }

    }
}
