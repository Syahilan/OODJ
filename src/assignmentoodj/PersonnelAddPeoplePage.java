/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

//Swing Import List
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PersonnelAddPeoplePage extends JFrame{
    
    // Variables declaration - In order same as the form
    private int systemNumber;
    private JTextField usernameTxt;     // Username
    private JTextField passwordTxt;
    private JTextField FNameTxt;
    private JTextField LNametxt;
    private JTextField AgeTxt;
    private String GenderTxt;           // Setboxed
    private JTextField PhoneTxt;
    private JTextField EmailTxt;
    private JTextField AddLineTxt1;
    private JTextField AddLineTxt2;
    private String CitizenTxt;          // Setboxed
    private JTextField identityTxt;     // Passport/IC
    
    private JButton BackBut;
    private JButton ClearBut;
    private JButton RegisterBut;
    
    private JComboBox<String> CitizenshipStatComboBox;
    private JComboBox<String> GenderComboBox;
    
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel jLabel11;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    // End of variables declaration
    
    public PersonnelAddPeoplePage() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        BackBut = new JButton();
        jLabel1 = new JLabel();
        jLabel3 = new JLabel();
        jLabel2 = new JLabel();
        usernameTxt = new JTextField();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel11 = new JLabel();
        RegisterBut = new JButton();
        ClearBut = new JButton();
        LNametxt = new JTextField();
        passwordTxt = new JTextField();
        PhoneTxt = new JTextField();
        AddLineTxt1 = new JTextField();
        CitizenshipStatComboBox = new JComboBox<>();
        GenderComboBox = new JComboBox<>();
        jLabel13 = new JLabel();
        FNameTxt = new JTextField();
        AgeTxt = new JTextField();
        jLabel14 = new JLabel();
        EmailTxt = new JTextField();
        jLabel15 = new JLabel();
        AddLineTxt2 = new JTextField();
        jLabel16 = new JLabel();
        identityTxt = new JTextField();

        //Fixed Null issue
        GenderTxt = "Male";
        CitizenTxt = "Citizen";
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Covid Vaccine Management System (CVMS)");
        setName("PersonnelAddPeoplePage");

        BackBut.setBackground(new java.awt.Color(255, 0, 0));
        BackBut.setFont(new java.awt.Font("Sans Serif", 3, 12)); // NOI18N
        BackBut.setText("<<BACK");
        BackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sans Serif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("People Registration");

        jLabel3.setFont(new java.awt.Font("Sans Serif", 1, 20)); // NOI18N
        jLabel3.setText("Please enter the details below:");

        jLabel2.setFont(new java.awt.Font("Sans Serif", 0, 16)); // NOI18N
        jLabel2.setText("Username:");

        //remove?
        usernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //IdTxtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Password:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setText("First Name:");
        
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Last Name:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Age:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Phone Number:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setText("Email:");
        
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Address Line 1:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setText("Address Line 2:");
        
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Gender:");
        
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Citizenship Status:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setText("Passport/IC No.:");
        
        
        RegisterBut.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        RegisterBut.setText("REGISTER");
        RegisterBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButActionPerformed(evt);
            }
        });

        ClearBut.setText("Clear");
        ClearBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButActionPerformed(evt);
            }
        });

        CitizenshipStatComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Citizen", "Non-Citizen" }));
        CitizenshipStatComboBox.setMinimumSize(new java.awt.Dimension(89, 25));
        CitizenshipStatComboBox.setPreferredSize(new java.awt.Dimension(89, 25));
        CitizenshipStatComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitizenStatComboBoxActionPerformed(evt);
            }
        });

        GenderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        GenderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BackBut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 25, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ClearBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegisterBut, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CitizenshipStatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(identityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(usernameTxt)
                                        .addComponent(passwordTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                        .addComponent(FNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AgeTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GenderComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PhoneTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddLineTxt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddLineTxt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackBut, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(AgeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(GenderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(AddLineTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(AddLineTxt2))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CitizenshipStatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegisterBut)
                    .addComponent(ClearBut))
                .addContainerGap())
        );
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>       
    
    
    
    private void ClearButActionPerformed(java.awt.event.ActionEvent evt) {                                         
        usernameTxt.setText("");
        passwordTxt.setText("");
        FNameTxt.setText("");
        LNametxt.setText("");
        AgeTxt.setText("");
        PhoneTxt.setText("");
        EmailTxt.setText("");
        AddLineTxt1.setText("");
        AddLineTxt2.setText("");
        identityTxt.setText("");
        CitizenTxt="";
        GenderTxt="";
    }                          
    
    private void CitizenStatComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                
        String selected = CitizenshipStatComboBox.getSelectedItem().toString();
        if(selected == "Citizen"){
            CitizenTxt="Citizen";
            //System.out.println("YAY, MALAYSIA BOLEH!");
        }
        else if (selected != null && selected.equals("Non-Citizen")){
            CitizenTxt="Non-Citizen";
            //System.out.println("UH OH, MALAYSIA NO BOLEH!");
        }
    }                                               

    private void RegisterButActionPerformed(java.awt.event.ActionEvent evt) {                                            
        //File file = new File("People.txt");
        int sys1 = 40001+DataIO.allPeople.size();
        String x1 = usernameTxt.getText().trim();
        String x2 = passwordTxt.getText().trim();
        String x3 = FNameTxt.getText().trim();
        String x4 = LNametxt.getText().trim();
        int x5 = Integer.parseInt(AgeTxt.getText().trim());
        String x6 = GenderTxt;
        String x7 = PhoneTxt.getText().trim();
        String x8 = EmailTxt.getText().trim();
        String x9 = AddLineTxt1.getText().trim();
        String x10 = AddLineTxt2.getText().trim();
        String x11 = CitizenTxt;
        String x12 = identityTxt.getText().trim();
        People z = new People(sys1, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12);
        DataIO.allPeople.add(z);
        DataIO.writePeople();
        
        // After a successful addition.
        JOptionPane.showMessageDialog(null, "You are done the registration of new user successfully");
        this.setVisible(false);
        PersonnelUserManagementPage pumpA = new PersonnelUserManagementPage();
        pumpA.setVisible(true);
        dispose();
        
//        if (id.length()>0 && name.length()>0 && lname.length()>0 && date.length()>0 && phone.length()>0 && address.trim().length()>0 && center.length()>0 && centerid.length()>0 && sname.length()>0 && scode.length()>0){           
//            try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("Coach.txt",true)))){
//                
//                JOptionPane.showMessageDialog(null, "You are done the registration of new coach successfully");
//                this.setVisible(false);
//                PersonnelUserManagementPage pumpA = new PersonnelUserManagementPage();
//                pumpA.setVisible(true);
//                dispose();
//            }
//            catch (Exception e) {
//                System.err.println(e);
//            }
//        }
//        else{
//            JOptionPane.showMessageDialog(this, "ERROR, Please fill unfilled textfields", "Error Message", JOptionPane.ERROR_MESSAGE);
//        }
        
    }
    
    private void GenderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                              
        String selected = GenderComboBox.getSelectedItem().toString();
        if(selected != null && selected.equals("Male")){
            GenderTxt="Male";
        }
        else if (selected != null && selected.equals("Female")){
            GenderTxt="Female";
        }
        
    }
    
    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {                                        
        this.setVisible(false);
        PersonnelUserManagementPage pump = new PersonnelUserManagementPage();
        pump.setVisible(true);
    }
    
    
    
}
