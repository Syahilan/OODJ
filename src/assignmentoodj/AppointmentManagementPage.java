/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentoodj;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Darshini
 */
public class AppointmentManagementPage extends JFrame {

    public AppointmentManagementPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        queryPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        subTitle = new javax.swing.JLabel();
        lblLastN = new javax.swing.JLabel();
        lblFirstN = new javax.swing.JLabel();
        lblIC = new javax.swing.JLabel();
        lName = new javax.swing.JTextField();
        ic = new javax.swing.JTextField();
        fName = new javax.swing.JTextField();
        lblCentre = new javax.swing.JLabel();
        lblVac = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        endDate = new javax.swing.JTextField();
        startDate = new javax.swing.JTextField();
        btnStartDate = new javax.swing.JButton();
        btnEndDate = new javax.swing.JButton();
        lblT = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        vName = new javax.swing.JComboBox<>();
        centre = new javax.swing.JComboBox<>();
        btnAddAppoint = new javax.swing.JButton();
        displayPanel = new javax.swing.JPanel();
        displayScrollPanel = new javax.swing.JScrollPane();
        appTable = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);

        queryPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 51, 204));
        title.setText("Appointment Management(def)");
        title.setPreferredSize(new java.awt.Dimension(270, 29));
        if (Main.access == "PERSONNEL") {
            title.setText("Appointment Managament");
        } else {
            title.setText("My Appointment");
        }

        subTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        subTitle.setText("Search criteria:");

        lblLastN.setText("Last Name");

        lblFirstN.setText("First Name");

        lblIC.setText("IC/Passport No.");

        lName.setMinimumSize(new java.awt.Dimension(127, 22));
        lName.setPreferredSize(new java.awt.Dimension(127, 22));

        ic.setMinimumSize(new java.awt.Dimension(127, 22));

        fName.setMinimumSize(new java.awt.Dimension(127, 22));
        fName.setPreferredSize(new java.awt.Dimension(127, 22));

        lblCentre.setText("Centre");

        lblVac.setText("Vaccine");

        lblDate.setText("Date");

        endDate.setEditable(false);
        endDate.setToolTipText("End Date");

        startDate.setEditable(false);
        startDate.setToolTipText("Start Date");
        
        if (Main.access == "PEOPLE") {
            ic.setText(Main.loginPeo.getIdentityTxt());
            lName.setText(Main.loginPeo.getLastname());
            fName.setText(Main.loginPeo.getFirstname());
        }


        
        ImageIcon calIcon = null;
        String iconFile = "cal.jpg";
        java.net.URL imgURL = AppointmentManagementPage.class
                .getResource(iconFile);
        if (imgURL != null) {
            calIcon = new ImageIcon(imgURL);
        } else {
            JOptionPane.showMessageDialog(this, "Icon image " + iconFile
                    + " not found !");
        }
        
        
        btnStartDate.setIcon(calIcon); // NOI18N
        btnStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartDateActionPerformed(evt);
            }
        });

        btnEndDate.setIcon(calIcon); // NOI18N
        btnEndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndDateActionPerformed(evt);
            }
        });

        lblT.setText(" -");

        btnBack.setBackground(new java.awt.Color(255, 204, 0));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        ImageIcon seaIcon = null;
        String iconFileA = "search.jpg";
        java.net.URL imgURLA = AppointmentManagementPage.class
                .getResource(iconFileA);
        if (imgURLA != null) {
            seaIcon = new ImageIcon(imgURLA);
        } else {
            JOptionPane.showMessageDialog(this, "Icon image " + iconFileA
                    + " not found !");
        }
        btnSearch.setIcon(seaIcon); // NOI18N
        btnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        vName.setModel(new javax.swing.DefaultComboBoxModel(VaccineName.values()));
        // Option to have a "null" item displayed first by default
        vName.insertItemAt("", 0);
        vName.setSelectedIndex(-1);

        centre.setModel(new javax.swing.DefaultComboBoxModel(Centre.values()));
        // Option to have a "null" item displayed first by default
        centre.insertItemAt("", 0);
        centre.setSelectedIndex(-1);

        btnAddAppoint.setBackground(new java.awt.Color(160, 236, 160));
        btnAddAppoint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddAppoint.setText("Book Appointment");
        btnAddAppoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAppointActionPerformed(evt);
            }
        });

        if (Main.access == "PEOPLE") {
            btnAddAppoint.setVisible(false);
        } else if (Main.access == "PERSONNEL") {
            btnAddAppoint.setVisible(true);
        }

        javax.swing.GroupLayout queryPanelLayout = new javax.swing.GroupLayout(queryPanel);
        queryPanel.setLayout(queryPanelLayout);
        queryPanelLayout.setHorizontalGroup(
                queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(queryPanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(queryPanelLayout.createSequentialGroup()
                                                .addComponent(subTitle)
                                                .addGap(0, 785, Short.MAX_VALUE))
                                        .addGroup(queryPanelLayout.createSequentialGroup()
                                                .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(queryPanelLayout.createSequentialGroup()
                                                                .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(lblLastN, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lblIC, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(ic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lName, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)))
                                                        .addGroup(queryPanelLayout.createSequentialGroup()
                                                                .addComponent(lblFirstN, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(fName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGap(30, 30, 30)
                                                .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(lblVac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                                        .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblCentre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(queryPanelLayout.createSequentialGroup()
                                                                .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(btnStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lblT, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(btnEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(vName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(centre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                                .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, queryPanelLayout.createSequentialGroup()
                                                                .addComponent(btnAddAppoint, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(23, 23, 23))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, queryPanelLayout.createSequentialGroup()
                                                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(83, 83, 83))))
                                        .addGroup(queryPanelLayout.createSequentialGroup()
                                                .addComponent(btnBack)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(214, 214, 214))))
        );
        queryPanelLayout.setVerticalGroup(
                queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, queryPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnBack)
                                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subTitle)
                                .addGap(25, 25, 25)
                                .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblFirstN)
                                                .addComponent(lblCentre)
                                                .addComponent(centre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnSearch))
                                .addGap(18, 18, 18)
                                .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblLastN)
                                        .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblVac)
                                        .addComponent(vName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(queryPanelLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(btnStartDate))
                                        .addGroup(queryPanelLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnEndDate)
                                                        .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(startDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(queryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(lblIC)
                                                                        .addComponent(ic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lblDate)
                                                                        .addComponent(lblT)
                                                                        .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(btnAddAppoint, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(15, 15, 15))
        );

        displayPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        displayScrollPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Object[] columns = {"ID", "IC/PASSPORT NO.", "LAST NAME",
            "FIRST NAME", "CENTRE", "DATE", "TIME", "VACCINE", "STATUS"};
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        // Change A JTable Background Color, Font Size, Font Color, Row Height
        appTable.setForeground(Color.black);
        // // Set Table Header font to Bold
        JTableHeader th = appTable.getTableHeader();
        Font font = new Font("", Font.BOLD, 12);
        th.setFont(font);
        th.setBackground(Color.LIGHT_GRAY);

        // Add table Sorter
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(
                model);
        // Sort by date column (col 5)
        // Define a custom comparator:
        // => can't use displayed format for sorting, use yyyyMMdd instead
        sorter.setComparator(5, new Comparator<String>() {
            public int compare(String s1, String s2) {
                // Sort displayed date column re-formatted to yyyyMMdd
                String str1 = s1.substring(11, 15) + s1.substring(8, 10)
                        + s1.substring(5, 7);
                String str2 = s2.substring(11, 15) + s2.substring(8, 10)
                        + s2.substring(5, 7);
                return str1.compareTo(str2);
            }
        });
        appTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        appTable.setModel(model);
        appTable.setRowHeight(18);
        appTable.setRowSorter(sorter);
        appTable.getTableHeader().setReorderingAllowed(false);
        appTable.setDefaultEditor(Object.class, null);
        appTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appTableMouseClicked(evt);
            }
        });
        displayScrollPanel.setViewportView(appTable);

        btnSave.setText("Save");
        btnSave.setPreferredSize(new java.awt.Dimension(100, 25));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete(def)");
        btnDelete.setPreferredSize(new java.awt.Dimension(100, 25));
        if (Main.access == "PERSONNEL") {
            btnDelete.setText("Delete");
        } else {
            btnDelete.setText("Cancel");
        }
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setPreferredSize(new java.awt.Dimension(100, 25));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        if (Main.access == "PEOPLE") {
            btnUpdate.setVisible(false);
        } else if (Main.access == "PERSONNEL") {
            btnUpdate.setVisible(true);
        }

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
                displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(224, 224, 224))
                        .addComponent(displayScrollPanel)
        );
        displayPanelLayout.setVerticalGroup(
                displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayPanelLayout.createSequentialGroup()
                                .addComponent(displayScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addGroup(displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(queryPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(displayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(queryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(displayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void appTableMouseClicked(java.awt.event.MouseEvent evt) {
        // i = the index of the selected row
        try {
            int i = appTable.getSelectedRow();
            for (int j = 0; j < NB_COL; j++) {
                appmtRowData[j] = appTable.getValueAt(i, j).toString();
            }
            // Convert view coordinates to model coordinates
            appmtRowData[NB_COL] = String.valueOf(appTable.convertRowIndexToModel(i));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "ERROR: Please try again !");
        }
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        int i = appTable.getSelectedRow();
        if (i >= 0) {
            Main.functionL2 = "UPDATE";
            bap = new BookAppointmentPage();
            bap.setVisible(true);
            bap.setAppointmentData(appmtRowData);
        } else {
            JOptionPane.showMessageDialog(this, "Please Select row to be Updated !");
        }
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        String message = "Confirm Delete Records ?";
        String message2 = "Record Deleted ! Click on 'Save' button to update file.";
String message3 = "Operation Cancelled: No Records Deleted !";
        if(Main.access == "PEOPLE"){
            message = "Confirm Cancellation ?";
            message2 = "Appointment Canceled ! Click on 'Save'.";
		message3 = "No Cancellation !";
        }
        
        // i = the index of the selected row
        if (bap != null && bap.isShowing()) {
            bap.dispose();
        }
        int i = appTable.getSelectedRow();
        if (i >= 0) {
            int reply = JOptionPane.showConfirmDialog(this,
                    message, "WARNING",
                    JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                // remove a row from jtable
                int row = Integer.valueOf(appmtRowData[NB_COL]);
                model.removeRow(row);
                // Delete row from array of buffered file records
                AppointmentIO.allAppointments.remove((int) rowIndexes.get(row));
                JOptionPane.showMessageDialog(this, message2);
            } else {
                JOptionPane.showMessageDialog(this, message3 );
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Select row to be Deleted !");
        }
    }

    private void btnAddAppointActionPerformed(java.awt.event.ActionEvent evt) {
        Main.access = "PERSONNEL";
        Main.functionL2 = "BOOK";
        ScheduleManagementPage sch = new ScheduleManagementPage();
        sch.setVisible(true);
    }

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {
        // Control query params (dates)

        boolean dateOk = true;
        String sDate = (startDate.getText().isEmpty()) ? "" : startDate
                .getText();
        String eDate = (endDate.getText().isEmpty()) ? "" : endDate
                .getText();
        if (sDate != "" && eDate != "") {
            Date ds = Util.str2Date(startDate.getText(), "E, dd/MM/yyyy");
            Date de = Util.str2Date(endDate.getText(), "E, dd/MM/yyyy");
            if (de.before(ds)) {
                JOptionPane.showMessageDialog(this,
                        "End Date can't be prior to Start Date !");
                dateOk = false;
            }
        }
        if (dateOk) {
            String centreStr = (centre.getSelectedIndex() == -1) ? ""
                    : centre.getSelectedItem().toString();
            String vacStr = (vName.getSelectedIndex() == -1) ? "" : vName
                    .getSelectedItem().toString();

            ArrayList<Appointment> appointments = new ArrayList<Appointment>();
            appointments = AppointmentIO.allAppointments;

            // create an array of objects to set the row data
            final Object[] data = new Object[NB_COL];

            rowIndexes = new ArrayList<Integer>();

            Date ds = (sDate == "") ? Util.str2Date("01/01/1970", "dd/MM/yyyy")
                    : Util.str2Date(sDate, "E, dd/MM/yyyy");
            Date de = (eDate == "") ? Util.str2Date("31/12/4000", "dd/MM/yyyy")
                    : Util.str2Date(eDate, "E, dd/MM/yyyy");

//            if (Main.access == "PEOPLE") {
//                String lastN = ;
//
//                String firstN = ;
//
//                String pIc = ;
//            
//                
//            } else {
            String lastN = lName.getText();

            String firstN = fName.getText();

            String pIc = ic.getText();
//            }

            model.setRowCount(0);

            for (int i = 0; i < appointments.size(); i++) {
                if (("".equals(lastN) || appointments.get(i).getLname().equals(lastN))
                        && ("".equals(firstN) || appointments.get(i).getFname().equals(firstN))
                        && ("".equals(pIc) || appointments.get(i).getNIC().equals(pIc))
                        && (!ds.after(appointments.get(i).getDateDate())
                        && !de.before(appointments.get(i).getDateDate()))
                        && (centreStr == "" || appointments.get(i).getCentre().equals(centreStr))
                        && (vacStr == "" || appointments.get(i).getVacName().equals(vacStr))) {

                    data[0] = appointments.get(i).getaId();
                    data[1] = appointments.get(i).getNIC();
                    data[2] = appointments.get(i).getLname();
                    data[3] = appointments.get(i).getFname();
                    data[4] = appointments.get(i).getCentre();
                    data[5] = appointments.get(i).getDate();
                    data[6] = appointments.get(i).getStartTime() + " - "
                            + appointments.get(i).getEndTime();
                    data[7] = appointments.get(i).getVacName();
                    data[8] = appointments.get(i).getStatus();
                    model.addRow(data);

                    // Set rowIndexes with the index of the records found
                    rowIndexes.add(i);
                }
            }

            if (appTable.getRowCount() > 0) {
                appTable.setVisible(true);
            } else {
                appTable.setVisible(false);
                JOptionPane.showMessageDialog(this,
                        "WARNING: No Records Retrieved for this criteria !");
            }
        }
    }

   private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        PeopleMainPage pmpB = new PeopleMainPage();
        if (Main.access == "PERSONNEL") {
            PersonnelMainPage pmpA = new PersonnelMainPage();
            pmpA.setVisible(true);
        }else if ((Main.access == "PEOPLE"))
            pmpB.setVisible(true);


    }

    private void btnEndDateActionPerformed(java.awt.event.ActionEvent evt) {
        endDate.setText(new DatePicker(this, DatePicker.ALL_DATES)
                .setPickedDate());
    }

    private void btnStartDateActionPerformed(java.awt.event.ActionEvent evt) {
        startDate.setText(new DatePicker(this, DatePicker.ALL_DATES)
                .setPickedDate());
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
        String message = "Confirm Save records to File ?";
        String message2 = "Records Saved Successfully !";
        String message3 = "ERROR: No Records Saved !";
        String message4 = "Operation Cancelled: No Records Saved !";
        if (Main.access == "PEOPLE") {
            message = "Confirm Save ?";
            message2 = "Appointment Canceled Successfully !";
            message3 = "ERROR: Save failed ! ";
            message4 = "Operation Cancelled !";
        }

        int reply = JOptionPane.showConfirmDialog(this,
                message, "WARNING",
                JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            // Save to file
            if (AppointmentIO.write() == 0) {
                JOptionPane.showMessageDialog(this, message2);
                btnSearch.doClick();
            } else {
                JOptionPane.showMessageDialog(this, message3);
            }
        } else {
            JOptionPane.showMessageDialog(this,  message4 );
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTable appTable;
    private javax.swing.JButton btnAddAppoint;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEndDate;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnStartDate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> centre;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JScrollPane displayScrollPanel;
    private javax.swing.JTextField endDate;
    private javax.swing.JTextField fName;
    private javax.swing.JTextField ic;
    private javax.swing.JTextField lName;
    private javax.swing.JLabel lblCentre;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblFirstN;
    private javax.swing.JLabel lblIC;
    private javax.swing.JLabel lblLastN;
    private javax.swing.JLabel lblT;
    private javax.swing.JLabel lblVac;
    private javax.swing.JPanel queryPanel;
    private javax.swing.JTextField startDate;
    private javax.swing.JLabel subTitle;
    private javax.swing.JLabel title;
    private javax.swing.JComboBox<String> vName;
    // End of variables declaration                   

    // No of columns in table data to be displayed
    private static final int NB_COL = 9;

    private DefaultTableModel model;

    // Indexes of rows of loaded data from file
    // which are retrieved after query and displayed
    private ArrayList<Integer> rowIndexes;

    private String[] appmtRowData = new String[NB_COL + 1];

    private BookAppointmentPage bap;
}
