/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentoodj;

import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Darshini
 */
public class ScheduleManagementPage extends JFrame{
        public ScheduleManagementPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        queryPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        lblCentre = new javax.swing.JLabel();
        lblVac = new javax.swing.JLabel();
        centre = new javax.swing.JComboBox<>();
        vName = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        btnAddSch = new javax.swing.JButton();
        subTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        displayPanel = new javax.swing.JPanel();
        schScrollPane = new javax.swing.JScrollPane();
        schTable = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnBook = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Schedule Management");
        setLocationByPlatform(true);
        setName("schFrame"); // NOI18N
        setResizable(false);

        queryPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        queryPanel.setPreferredSize(new java.awt.Dimension(750, 160));

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 51, 204));
        title.setText("Schedule Management");
        if (Main.functionL1 == "APPMT"){ 
            title.setText("Vaccination Program"); 
        }else { 
            title.setText("Schedule Management"); 
        }

        lblCentre.setText("Centre");
        lblCentre.setMinimumSize(new java.awt.Dimension(60, 14));

        lblVac.setText("Vaccine");
        lblVac.setMinimumSize(new java.awt.Dimension(60, 14));

        centre.setModel(new javax.swing.DefaultComboBoxModel(Centre.values()));
        centre.setMinimumSize(new java.awt.Dimension(150, 20));
        // Option to have a "null" item displayed first by default
        centre.insertItemAt("", 0);
        centre.setSelectedIndex(-1);

        vName.setModel(new javax.swing.DefaultComboBoxModel(VaccineName.values()));
        vName.setMinimumSize(new java.awt.Dimension(150, 20));
        vName.insertItemAt("", 0);
        vName.setSelectedIndex(-1);

        ImageIcon seaIcon = null;
        String iconFile = "search.jpg";
        java.net.URL imgURL = ScheduleManagementPage.class
                .getResource(iconFile);
        if (imgURL != null) {
            seaIcon = new ImageIcon(imgURL);
        } else {
            JOptionPane.showMessageDialog(this, "Icon image " + iconFile
                    + " not found !");
        }
        btnSearch.setIcon(seaIcon); // NOI18N
        btnSearch.setToolTipText("Search");
        btnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSearch.setMaximumSize(new java.awt.Dimension(30, 30));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAddSch.setBackground(new java.awt.Color(160, 236, 160));
        btnAddSch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddSch.setLabel("Create Schedule");
        btnAddSch.setMaximumSize(new java.awt.Dimension(200, 25));
        btnAddSch.setMinimumSize(new java.awt.Dimension(200, 25));
        btnAddSch.setPreferredSize(new java.awt.Dimension(200, 25));
        btnAddSch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSchActionPerformed(evt);
            }
        });

        subTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        subTitle.setText("Search Criteria:");

        btnBack.setBackground(new java.awt.Color(255, 204, 0));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        if(Main.functionL1 == "APPMT"){ 
            btnAddSch.setVisible(false); 
        } else  if (Main.functionL1 == "SCH"){ 
            btnAddSch.setVisible(true); 
        }

        javax.swing.GroupLayout queryPanelLayout = new javax.swing.GroupLayout(queryPanel);
        queryPanel.setLayout(queryPanelLayout);
        queryPanelLayout.setHorizontalGroup(
            queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(queryPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(queryPanelLayout.createSequentialGroup()
                        .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subTitle)
                            .addGroup(queryPanelLayout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(143, 143, 143)
                                .addComponent(title)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(queryPanelLayout.createSequentialGroup()
                        .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCentre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(centre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddSch, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        queryPanelLayout.setVerticalGroup(
            queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(queryPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(queryPanelLayout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(subTitle)
                        .addGap(30, 30, 30))
                    .addGroup(queryPanelLayout.createSequentialGroup()
                        .addComponent(title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, queryPanelLayout.createSequentialGroup()
                        .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCentre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(centre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, queryPanelLayout.createSequentialGroup()
                        .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAddSch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37))))
        );

        displayPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        displayPanel.setPreferredSize(new java.awt.Dimension(750, 260));

        schScrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Object[] columns = {"ID", "CENTRE", "DATE", "TIME", "VACCINE",
            "QUANTITY"};
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        // Add table Sorter
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(
            model);
        // Sort by date column (col 2)
        // Define a custom comparator:
        // => can't use displayed format for sorting, use yyyyMMdd instead
        sorter.setComparator(2, new Comparator<String>() {
            public int compare(String s1, String s2) {
                // Sort displayed date column re-formatted to yyyyMMdd
                String str1 = s1.substring(11) + s1.substring(8, 10)
                + s1.substring(5, 7);
                String str2 = s2.substring(11) + s2.substring(8, 10)
                + s2.substring(5, 7);
                return str1.compareTo(str2);
            }
        });
        schTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        schTable.setModel(model);
        schTable.setRowHeight(18);
        schTable.setRowSorter(sorter        );
        schTable.setDefaultEditor(Object.class, null);
        schTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                schTableMouseClicked(evt);
            }
        });
        schScrollPane.setViewportView(schTable);

        btnUpdate.setText("Update");
        btnUpdate.setMaximumSize(new java.awt.Dimension(100, 25));
        btnUpdate.setMinimumSize(new java.awt.Dimension(100, 25));
        btnUpdate.setPreferredSize(new java.awt.Dimension(100, 25));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setMaximumSize(new java.awt.Dimension(100, 25));
        btnDelete.setMinimumSize(new java.awt.Dimension(100, 25));
        btnDelete.setPreferredSize(new java.awt.Dimension(100, 25));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setMaximumSize(new java.awt.Dimension(100, 25));
        btnSave.setMinimumSize(new java.awt.Dimension(100, 25));
        btnSave.setPreferredSize(new java.awt.Dimension(100, 25));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        if(Main.functionL1 == "APPMT"){ 
            btnBook.setVisible(true); 
            btnUpdate.setVisible(false); 
            btnDelete.setVisible(false); 
            btnSave.setVisible(false); 
        } else  if (Main.functionL1 == "SCH"){ 
            btnBook.setVisible(false); 
            btnUpdate.setVisible(true); 
            btnDelete.setVisible(true); 
            btnSave.setVisible(true); 
        }
        btnBook.setText("Book Appointment(def)");
        btnBook.setMaximumSize(new java.awt.Dimension(200, 25));
        btnBook.setMinimumSize(new java.awt.Dimension(200, 25));
        btnBook.setPreferredSize(new java.awt.Dimension(200, 25));
        if(Main.functionL2 == "UPDATE"){
            btnBook.setText("Confirm Selection");
        }else if (Main.functionL2 == "BOOK"){
            btnBook.setText("Book Appointment");
        }
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(schScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addGroup(displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displayPanelLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(displayPanelLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayPanelLayout.createSequentialGroup()
                .addComponent(schScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(queryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(displayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(queryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(displayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String centreStr = (centre.getSelectedIndex() == -1) ? "" : centre
                .getSelectedItem().toString();
        String vacStr = (vName.getSelectedIndex() == -1) ? "" : vName
                .getSelectedItem().toString();
        ArrayList<CentreSchedule> schedules = new ArrayList<CentreSchedule>();
        schedules = ScheduleIO.allSchedules;

        // create an array of objects to set the row data
        final Object[] data = new Object[NB_COL];

        rowIndexes = new ArrayList<Integer>();
        model.setRowCount(0);
        for (int i = 0; i < schedules.size(); i++) {
            if ((centreStr == "" || schedules.get(i).getCentre().equals(centreStr))
                    && (vacStr == "" || schedules.get(i).getVacName().equals(vacStr))) {

                data[0] = schedules.get(i).getsId();
                data[1] = schedules.get(i).getCentre();
                data[2] = schedules.get(i).getDate();
                data[3] = schedules.get(i).getStartTime() + " - "
                        + schedules.get(i).getEndTime();
                data[4] = schedules.get(i).getVacName();
                data[5] = schedules.get(i).getQuantity();
                model.addRow(data);
                // Set rowIndexes with the index of the records found
                rowIndexes.add(i);
            }
        }
        if (schTable.getRowCount() > 0) {
            schTable.setVisible(true);
        } else {
            schTable.setVisible(false);
            JOptionPane.showMessageDialog(this,
                    "WARNING: No Records Retrieved for this criteria !");
        }

    }                                         

    private void btnAddSchActionPerformed(java.awt.event.ActionEvent evt) {                                          
        new CreateSchedulePage().setVisible(true);
    }                                         

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int i = schTable.getSelectedRow();
        if (i >= 0) {
            // Call update schedule page with array of selected data
            if (updSch != null && updSch.isShowing()) {
                updSch.dispose();
            }
            updSch = new UpdateSchedulePage();
            updSch.setScheduleData(schRowData);
            updSch.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Please Select row to be Updated !");
        }
    }                                         

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int reply = JOptionPane.showConfirmDialog(null,
                "Confirm Save records to File ?", "WARNING",
                JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            if (VaccineInventoryIO.write() == 0 && ScheduleIO.write() == 0) {
                JOptionPane.showMessageDialog(schTable, "Records Saved Successfully !");
                // To refresh list of schedules displayed after update to file
                btnSearch.doClick();
            } else {
                JOptionPane.showMessageDialog(schTable, "ERROR: No Records Saved !");
            }
        } else {
            JOptionPane.showMessageDialog(schTable, "Operation Cancelled: No Records Saved !");
        }
    }                                       

    private void schTableMouseClicked(java.awt.event.MouseEvent evt) {                                      
        try {
            // i = the index of the selected row
            int i = schTable.getSelectedRow();
            for (int j = 0; j < NB_COL; j++) {
                schRowData[j] = schTable.getValueAt(i, j).toString();
            }
            // Convert view coordinates to model coordinates
            schRowData[NB_COL] = String.valueOf(schTable.convertRowIndexToModel(i));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "ERROR: Please try again !");
        }
    }                                     

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // i = the index of the selected row
        if (updSch != null && updSch.isShowing()) {
            updSch.dispose();
        }
        int i = schTable.getSelectedRow();
        if (i >= 0) {
            int reply = JOptionPane.showConfirmDialog(null,
                    "Confirm Delete Records ?", "WARNING",
                    JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                // remove a row from jtable
                int row = Integer.valueOf(schRowData[6]);
                int quantity = (int) model.getValueAt(row, 5);
                model.removeRow(row);
                // Update vaccine inventory
                // Update array of buffered file records
                int vacIndex = VaccineSupply.searchVaccineRecord(schRowData[1], schRowData[4]);
                VaccineSupply vs = VaccineInventoryIO.allVacSupplies.get(vacIndex);
                vs.setQuantity(vs.getQuantity() - quantity);
                VaccineSupply.updateVaccineRecord(vs);
                // Delete row from array of buffered file records
                ScheduleIO.allSchedules.remove((int) rowIndexes.get(row));
                JOptionPane.showMessageDialog(this, "Record Deleted ! Click on 'Save' button to update file.");
            } else {
                JOptionPane.showMessageDialog(this,
                        "Operation Cancelled: No Records Deleted !");
            }
        } else {
            JOptionPane.showMessageDialog(schTable,
                    "Please Select row to be Deleted !");
        }

    }                                         

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // Button for Book and Confirm Selection
        int i = schTable.getSelectedRow();
        if (i >= 0) {
            int row = Integer.valueOf(schRowData[6]);

            // Retrieve original schedule from buffered records 
            CentreSchedule sch = ScheduleIO.allSchedules.get((int) rowIndexes
                    .get(row));
            ArrayList<Appointment> appmts = new ArrayList<Appointment>();
            appmts = AppointmentIO.allAppointments;
            int count = 0;
            for (int j = 0; j < appmts.size(); j++) {
                if (sch.getCentre().equals(appmts.get(j).getCentre())
                        && sch.getVacName().equals(appmts.get(j).getVacName())
                        && sch.getDate().equals(appmts.get(j).getDate())) {

                    count++;
                }
            }
            if (count >= sch.getQuantity()) {
                JOptionPane.showMessageDialog(btnBook,
                        "The Schedule is fully booked !");
            } else {
                // Confirm Selection action
                BookAppointmentPage bap = new BookAppointmentPage();
                String[] data = new String[9];
                data[0] = String.valueOf(appmtIdToUpdate);
                data[1] = IC;
                data[2] = lastName;
                data[3] = firstName;
                data[4] = schRowData[1];
                data[5] = schRowData[2];
                data[6] = schRowData[3];
                data[7] = schRowData[4];
                data[8] = schRowData[5];
                if (Main.functionL2 == "BOOK") {
                    bap.setScheduleData(schRowData);
                } else if (Main.functionL2 == "UPDATE") {
                    bap.setAppointmentData(data);
                    dispose();
                }
                bap.setVisible(true);
            }
        } else {

            JOptionPane.showMessageDialog(this, "Please Select row to be Updated !");
        }
    }                                       

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {                                        
        this.setVisible(false);
        // TODO back to appointment page & 
        //      back to main personnel page
    }                                       

    public void setPeopleData(int appmtIdToUpdate, String IC, String lastName, String firstName) {
        this.appmtIdToUpdate = appmtIdToUpdate;
        this.IC = IC;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAddSch;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> centre;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JLabel lblCentre;
    private javax.swing.JLabel lblVac;
    private javax.swing.JPanel queryPanel;
    private javax.swing.JScrollPane schScrollPane;
    private javax.swing.JTable schTable;
    private javax.swing.JLabel subTitle;
    private javax.swing.JLabel title;
    private javax.swing.JComboBox<String> vName;
    // End of variables declaration                   

    // No of columns in table data to be displayed
    private static final int NB_COL = 6;

    private DefaultTableModel model;

    // Indexes of rows of loaded data from file
    // which are retrieved after query and displayed
    private ArrayList<Integer> rowIndexes;

    // To store selected row from table and send to update page
    private String[] schRowData = new String[NB_COL + 1];

    private UpdateSchedulePage updSch;

    private int appmtIdToUpdate;
    private String IC;
    private String lastName;
    private String firstName;
}
