/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentoodj;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Darshini
 */
public class BookAppointmentPage extends JFrame {

    public BookAppointmentPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        subtitle2 = new javax.swing.JLabel();
        lblCentre = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblVac = new javax.swing.JLabel();
        centre = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        vac = new javax.swing.JTextField();
        startTime = new javax.swing.JTextField();
        endTime = new javax.swing.JTextField();
        dash = new javax.swing.JLabel();
        btnUpd = new javax.swing.JButton();
        PDetPanel = new javax.swing.JPanel();
        lblIc = new javax.swing.JLabel();
        IC = new javax.swing.JTextField();
        lblLName = new javax.swing.JLabel();
        lName = new javax.swing.JTextField();
        lblFName = new javax.swing.JLabel();
        subtitle1 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        vacStatus = new javax.swing.JComboBox<>();
        lblVacStat = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);

        title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(0, 51, 204));
        title.setText("Appointment Details");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        subtitle2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        subtitle2.setText("Schedule");

        lblCentre.setText("Centre");

        lblDate.setText("Date");

        lblTime.setText("Time");

        lblVac.setText("Vaccine");
        
        dash.setText("  -");
        
        lName.setEditable(false);
        
        fName.setEditable(false);

        btnUpd.setBackground(new java.awt.Color(153, 255, 153));
        btnUpd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnUpd.setText("Change Schedule(def)");
        if (Main.functionL2 == "BOOK") {
            btnUpd.setVisible(false);
        } else if (Main.functionL2 == "UPDATE") {
            btnUpd.setVisible(true);
            btnUpd.setText("Change Schedule");
        }
        btnUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCentre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(subtitle2)
                                                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblVac, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(centre, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                        .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                        .addComponent(vac, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(startTime, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(dash)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(endTime, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btnUpd, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(subtitle2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(centre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblVac, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(vac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(startTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(endTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dash))
                                .addGap(18, 18, 18)
                                .addComponent(btnUpd)
                                .addGap(13, 13, 13))
        );

        PDetPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblIc.setText("IC/Passport Number ");

        lblLName.setText("Last Name");

        lblFName.setText("First Name");

        subtitle1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        subtitle1.setText("Person Details");

        javax.swing.GroupLayout PDetPanelLayout = new javax.swing.GroupLayout(PDetPanel);
        PDetPanel.setLayout(PDetPanelLayout);
        PDetPanelLayout.setHorizontalGroup(
                PDetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PDetPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PDetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PDetPanelLayout.createSequentialGroup()
                                                .addComponent(subtitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(PDetPanelLayout.createSequentialGroup()
                                                .addGroup(PDetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(lblIc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblLName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblFName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                                                .addGroup(PDetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(IC, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
        );
        PDetPanelLayout.setVerticalGroup(
                PDetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PDetPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(subtitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(PDetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(IC)
                                        .addComponent(lblIc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(PDetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblLName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PDetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblFName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        vacStatus.setModel(new javax.swing.DefaultComboBoxModel(VaccinationStatus.values()));
        vacStatus.insertItemAt("", 0);
        vacStatus.setSelectedIndex(-1);
        vacStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacStatusActionPerformed(evt);
            }
        });

        lblVacStat.setText("Vaccination Status");
        if (Main.functionL2 == "UPDATE") {
            lblVacStat.setText("Vaccination Status");
        } else if (Main.access == "PEOPLE" || Main.functionL2 == "BOOK") {
            lblVacStat.setText("");
        }

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        if (Main.functionL2 == "UPDATE") {
            vacStatus.setVisible(true);
        } else if (Main.access == "PEOPLE" || Main.functionL2 == "BOOK") {
            vacStatus.setVisible(false);
        }

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(lblVacStat, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vacStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(PDetPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGap(100, 100, 100)
                                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btnConfirm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancel)
                                .addGap(50, 50, 50))
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PDetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblVacStat)
                                        .addComponent(vacStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnConfirm)
                                        .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnUpdActionPerformed(java.awt.event.ActionEvent evt) {
        // Change Schdedule button action
        ScheduleManagementPage sch = new ScheduleManagementPage();
        sch.setPeopleData(appmtId, IC.getText(), lName.getText(), fName.getText());
        sch.setVisible(true);
        dispose();
    }

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {

        String message1 = "Confirm Save records to File ?";
        String message2 = "Operation Cancelled: No Records Saved !";
        String message3 = "Records Saved Successfully !";
        String message4 = "ERROR: No Records Saved !";

        if (Main.access == "PEOPLE") {
            message1 = "Confirm Booking ?";
            message2 = "Operation Cancelled: No Booking Made !";
            message3 = "Booking Successfully !";
            message4 = "ERROR: No Booking Made !";
        }

        if (Main.functionL2 == "BOOK") {
            // Check registered person
            People personDetails = DataIO.checkPeople("", "", "", IC.getText());
            if (personDetails == null) {
                JOptionPane.showMessageDialog(btnConfirm, "Person not found!");
            } else {
                int reply = JOptionPane.showConfirmDialog(null,
                        message1, "WARNING",
                        JOptionPane.YES_NO_OPTION);

                if (reply == JOptionPane.YES_OPTION) {
                    int size = AppointmentIO.allAppointments.size();
                    int id = 50001;
                    if (size > 0) {
                        id = AppointmentIO.allAppointments.get(size - 1).getaId() + 1;
                    }
                    lName.setText(personDetails.getLastname());

                    fName.setText(personDetails.getFirstname());

                    Appointment a = new Appointment(id, IC.getText(),
                            lName.getText(), fName.getText(), centre.getText(),
                            date.getText(), startTime.getText(),
                            endTime.getText(), vac.getText(), "");
                    AppointmentIO.allAppointments.add(a);
                } else {
                    JOptionPane.showMessageDialog(this, message2);
                }

                // Save to file
                if (AppointmentIO.write() == 0) {
                    JOptionPane.showMessageDialog(this, message3);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, message4);
                }

            }
        }

        if (Main.functionL2 == "UPDATE") {
            int reply = JOptionPane.showConfirmDialog(null,
                    "Confirm Save records to File ?", "WARNING",
                    JOptionPane.YES_NO_OPTION);

            if (reply == JOptionPane.YES_OPTION) {
                String status = (vacStatus.getSelectedIndex() == -1) ? "" : vacStatus.getSelectedItem().toString();
                Appointment appmt = new Appointment();
                appmt.setaId(appmtId);
                appmt.setCentre(centre.getText());
                appmt.setDate(date.getText());
                appmt.setStartTime(startTime.getText());
                appmt.setEndTime(endTime.getText());
                appmt.setVacName(vac.getText());
                appmt.setStatus(status);
                System.out.println(status);
                Appointment.updateAppointmentRecord(appmt);
            } else {
                JOptionPane.showMessageDialog(this, "Operation Cancelled: No Records Saved !");

            }
            // Save to file
            if (AppointmentIO.write() == 0) {
                JOptionPane.showMessageDialog(this, "Records Saved Successfully !");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "ERROR: No Records Saved !");
            }
        }
    }

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {
        if (Main.functionL2 == "BOOK") {
            JOptionPane.showMessageDialog(btnCancel,
                    " Appointment Booking Cancelled !");
        } else {
            JOptionPane.showMessageDialog(btnCancel,
                    " Appointment Update Cancelled !");
        }
        dispose();
    }

    private void vacStatusActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public void setScheduleData(String[] data) {
//        if(Main.access == "PEOPLE"){
//            IC.setText(Main.loginPeo.);
//            IC.setEditable(false);
//            lName.setText(Main.loginPeo.);
//            lName.setEditable(false);
//            fName.setText(Main.loginPeo.);
//            fName.setEditable(false);
//            
//        }

        centre.setText(data[1]);
        centre.setEditable(false);

        date.setText(data[2]);
        date.setEditable(false);
        // Set start & end time from text (format: "HH:mm" - "HH:mm")
        String[] s = data[3].split("-");
        startTime.setText(s[0].trim());
        startTime.setEditable(false);

        endTime.setText(s[1].trim());
        endTime.setEditable(false);

        vac.setText(data[4]);
        vac.setEditable(false);
    }

    public void setAppointmentData(String[] data) {

        appmtId = Integer.valueOf(data[0]);
        IC.setText(data[1]);
        IC.setEditable(false);
        lName.setText(data[2]);
        lName.setEditable(false);
        fName.setText(data[3]);
        fName.setEditable(false);
        centre.setText(data[4]);
        centre.setEditable(false);
        date.setText(data[5]);
        date.setEditable(false);
        // Set start & end time from text (format: "HH:mm" - "HH:mm") 
        String[] s = data[6].split("-");
        startTime.setText(s[0].trim());
        startTime.setEditable(false);
        endTime.setText(s[1].trim());
        endTime.setEditable(false);
        vac.setText(data[7]);
        vac.setEditable(false);

    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField IC;
    private javax.swing.JPanel PDetPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnUpd;
    private javax.swing.JTextField centre;
    private javax.swing.JLabel dash;
    private javax.swing.JTextField date;
    private javax.swing.JTextField endTime;
    private javax.swing.JTextField fName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lName;
    private javax.swing.JLabel lblCentre;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblIc;
    private javax.swing.JLabel lblLName;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblVac;
    private javax.swing.JLabel lblVacStat;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField startTime;
    private javax.swing.JLabel subtitle1;
    private javax.swing.JLabel subtitle2;
    private javax.swing.JLabel title;
    private javax.swing.JTextField vac;
    private javax.swing.JComboBox<String> vacStatus;
    // End of variables declaration                   

    private int appmtId;
}
