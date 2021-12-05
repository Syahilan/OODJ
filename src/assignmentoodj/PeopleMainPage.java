/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButtonMenuItem;

public class PeopleMainPage extends JFrame {

    // Variables declaration                   
    private JButton bookAppointBut;
    private JRadioButtonMenuItem PeopleMainMenuPage;
    private JButton manageAppointBut;
    private JButton LogOutBut;
    private JButton editDetailBut;
    private JButton viewStatBut;
    private ButtonGroup buttonGroup1;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel8;
    // End of variables declaration     
    
    
    
    public PeopleMainPage() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        PeopleMainMenuPage = new javax.swing.JRadioButtonMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LogOutBut = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bookAppointBut = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        manageAppointBut = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        editDetailBut = new javax.swing.JButton();
        viewStatBut = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        PeopleMainMenuPage.setForeground(new java.awt.Color(255, 0, 0));
        PeopleMainMenuPage.setSelected(true);
        PeopleMainMenuPage.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("COVID-19 VACCINE REGISTRATION SYSTEM");
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Sans Serif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("People Page");

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
        jLabel4.setText("Book a Vaccination Appointment");

        bookAppointBut.setFont(new java.awt.Font("Sans Serif", 0, 13)); // NOI18N
        bookAppointBut.setText("Book Vaccination");
        bookAppointBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAppointmentButActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sans Serif", 2, 16)); // NOI18N
        jLabel5.setText("Manage my Appointments");

        manageAppointBut.setFont(new java.awt.Font("Sans Serif", 0, 13)); // NOI18N
        manageAppointBut.setText("Manage Appointment");
        manageAppointBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageAppointmentButActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sans Serif", 2, 16)); // NOI18N
        jLabel6.setText("Check my Records");

        editDetailBut.setFont(new java.awt.Font("Sans Serif", 0, 13)); // NOI18N
        editDetailBut.setText("Edit My Details");
        editDetailBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditDetailButActionPerformed(evt);
            }
        });

        viewStatBut.setFont(new java.awt.Font("Sans Serif", 0, 13)); // NOI18N
        viewStatBut.setText("Vaccine Status");
        viewStatBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewStatusButActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Sans Serif", 2, 16)); // NOI18N
        jLabel8.setText("View Vaccination Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogOutBut, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewStatBut, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookAppointBut)
                            .addComponent(editDetailBut)
                            .addComponent(manageAppointBut)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(0, 75, Short.MAX_VALUE)))
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
                .addComponent(bookAppointBut)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addComponent(manageAppointBut)
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editDetailBut)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewStatBut)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>
    
    private void LogOutButActionPerformed(java.awt.event.ActionEvent evt) {                                          
        Main.loginPeo = null;
        this.setVisible(false);
        StartMenu sm = new StartMenu();
        sm.setVisible(true);
    }                                                                             

    private void bookAppointmentButActionPerformed(java.awt.event.ActionEvent evt) {                                            
        this.setVisible(false);
        Main.functionL1 = "APPMT";
        Main.access = "PEOPLE";
        Main.functionL2 = "BOOK";
        ScheduleManagementPage sch = new ScheduleManagementPage();
        sch.setVisible(true);

        
        
        
    }                                           

    private void ManageAppointmentButActionPerformed(java.awt.event.ActionEvent evt) {                                            
        this.setVisible(false);
        Main.functionL1 = "APPMT";
        Main.access = "PEOPLE";
        AppointmentManagementPage appmt = new AppointmentManagementPage();
        appmt.setVisible(true);

        
    }                                           

    private void EditDetailButActionPerformed(java.awt.event.ActionEvent evt) {                                               
        this.setVisible(false);
        // LINK TO The Edit my details Page HERE!
        
        
    }                                              
                                    
     private void ViewStatusButActionPerformed(java.awt.event.ActionEvent evt){
         this.setVisible(false);
         // LINK TO The View Vaccine Status Page HERE!
         
         
     }

}
