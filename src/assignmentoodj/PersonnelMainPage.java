/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButtonMenuItem;

public class PersonnelMainPage extends JFrame{    
    
    
    
    // Variables declaration - do not modify                     
    private JButton manageVaccBut;
    private JRadioButtonMenuItem PersonnelMainMenuPage;
    private JButton manageUserBut;
    private JButton LogOutBut;
    private JButton manageScheduleBut;
    private JButton manageAppointBut;
    private JButton reportBut;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    // End of variables declaration           
    
    
    public PersonnelMainPage() {
        initComponents();
    } 
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        PersonnelMainMenuPage = new JRadioButtonMenuItem();
        jLabel1 = new JLabel();
        jLabel3 = new JLabel();
        LogOutBut = new JButton();
        jLabel4 = new JLabel();
        manageVaccBut = new JButton();
        jLabel5 = new JLabel();
        manageUserBut = new JButton();
        jLabel6 = new JLabel();
        manageScheduleBut = new JButton();
        manageAppointBut = new JButton();
        reportBut = new JButton();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();

        PersonnelMainMenuPage.setForeground(new java.awt.Color(255, 0, 0));
        PersonnelMainMenuPage.setSelected(true);
        PersonnelMainMenuPage.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Covid Vaccine Management System (CVMS)");
        setName("PersonnelMainPage"); // NOI18N
        
        jLabel1.setFont(new java.awt.Font("Sans Serif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Personnel Page");

        jLabel3.setFont(new java.awt.Font("Sans Serif", 1, 20)); // NOI18N
        jLabel3.setText("Please choose any of the functions:");

        LogOutBut.setBackground(new java.awt.Color(255, 64, 25));
        LogOutBut.setFont(new java.awt.Font("Sans Serif", 3, 16)); // NOI18N
        LogOutBut.setForeground(new java.awt.Color(255, 255, 255));
        LogOutBut.setText("Log Out");
        LogOutBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sans Serif", 2, 16)); // NOI18N
        jLabel4.setText("Vaccine Management");

        manageVaccBut.setFont(new java.awt.Font("Sans Serif", 0, 13)); // NOI18N
        manageVaccBut.setText("Manage Vaccines");
        manageVaccBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVaccineButActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sans Serif", 2, 16)); // NOI18N
        jLabel5.setText("User Account Management");

        manageUserBut.setFont(new java.awt.Font("Sans Serif", 0, 13)); // NOI18N
        manageUserBut.setText("Manage Users");
        manageUserBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserButActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sans Serif", 2, 16)); // NOI18N
        jLabel6.setText("Schedule Management");

        manageScheduleBut.setFont(new java.awt.Font("Sans Serif", 0, 13)); // NOI18N
        manageScheduleBut.setText("Manage Schedules");
        manageScheduleBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageScheduleButActionPerformed(evt);
            }
        });

        manageAppointBut.setFont(new java.awt.Font("Sans Serif", 0, 13)); // NOI18N
        manageAppointBut.setText("Manage Appointments");
        manageAppointBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAppointmentButActionPerformed(evt);
            }
        });

        reportBut.setFont(new java.awt.Font("Sans Serif", 0, 13)); // NOI18N
        reportBut.setText("Check Reports");
        reportBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Sans Serif", 2, 16)); // NOI18N
        jLabel7.setText("Reports");

        jLabel8.setFont(new java.awt.Font("Sans Serif", 2, 16)); // NOI18N
        jLabel8.setText("Appointment Management");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(LogOutBut, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageAppointBut, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageVaccBut)
                            .addComponent(manageScheduleBut)
                            .addComponent(manageUserBut)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(reportBut))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogOutBut, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageVaccBut)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addComponent(manageUserBut)
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageScheduleBut)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageAppointBut)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportBut)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold> 
                                     

    
    
    private void LogOutButActionPerformed(java.awt.event.ActionEvent evt) {                                          
        //Main.loginPer.ThisUser(Main.loginPer.getName(), Main.loginPer.getPassword());
        Main.loginPer = null;
        this.setVisible(false);
        StartMenu sm = new StartMenu();
        sm.setVisible(true);
    }                                                                             

    private void manageVaccineButActionPerformed(java.awt.event.ActionEvent evt) {                                            
        this.setVisible(false);
        VacInventoryManagementPage vacMaintain = new VacInventoryManagementPage();
        vacMaintain.queryFrame.setVisible(true);
        
        
        
    }                                           

    private void manageUserButActionPerformed(java.awt.event.ActionEvent evt) {                                            
        this.setVisible(false);
        // LINK TO The User Accounts Page HERE!
        PersonnelUserManagementPage pmpA = new PersonnelUserManagementPage();
        pmpA.setVisible(true);
        
    }                                           

    private void manageScheduleButActionPerformed(java.awt.event.ActionEvent evt) {                                               
        this.setVisible(false);
        // LINK TO The Manage Schedules Page HERE!
        
        
    }                                              
                                    
     private void manageAppointmentButActionPerformed(java.awt.event.ActionEvent evt){
         this.setVisible(false);
         // LINK TO The Manage Appointments Page HERE!
         
         
     }
    
    
    private void reportButActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        this.setVisible(false);
        // LINK TO The Reports Page HERE!
        
        
        
    }                                                

}
