/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;


public class PersonnelUpdateAdminForm extends JFrame{
    
    // Variables declaration - In order same as the form
    private JTextField userNameTxt;
    private JTextField passWordTxt;
    private JTextField FNameTxt;
    private JTextField LNameTxt;
    private JTextField ageTxt;
    private String genderTxt;           //  Setboxed
    private Date joinDate;              //  Date
    private JTextField PhoneTxt;
    private JTextField EmailTxt;
    private JButton BackBut;
    private javax.swing.JButton ClearBut;
    private JButton RegisterBut;
    private JComboBox<String> PGenderComboBox;
    private JLabel jLabel1;
    private JLabel jLabel11;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    // End of variables declaration
    
    public PersonnelUpdateAdminForm() {
        initComponents();
        initFields();
    }
    
    private void initFields() {
        //Initialize the fields to the People to Update
        String c1 = Main.perToUpdate.getUsername();
        userNameTxt.setText(c1);

        String c2 = Main.perToUpdate.getPassword();
        passWordTxt.setText(c2);

        String c3 = Main.perToUpdate.getFirstname();
        FNameTxt.setText(c3);

        String c4 = Main.perToUpdate.getLastname();
        LNameTxt.setText(c4);
        
        int c5 = Main.perToUpdate.getAge();
        ageTxt.setText(String.valueOf(c5));
        
        String c6 = Main.perToUpdate.getGender();
        if (c6.equals("Male")) {
            PGenderComboBox.setSelectedIndex(0);
            genderTxt = "Male";
        } else {
            PGenderComboBox.setSelectedIndex(1);
            genderTxt = "Female";
        }
        
        String c7 = Main.perToUpdate.getPhone();
        PhoneTxt.setText(c7);

        String c8 = Main.perToUpdate.getEmail();
        EmailTxt.setText(c8);

    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        BackBut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        RegisterBut = new javax.swing.JButton();
        ClearBut = new javax.swing.JButton();
        FNameTxt = new javax.swing.JTextField();
        PhoneTxt = new javax.swing.JTextField();
        EmailTxt = new javax.swing.JTextField();
        PGenderComboBox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        LNameTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        passWordTxt = new javax.swing.JTextField();
        ageTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COVID-19 VACCINE REGISTRATION SYSTEM");
        setLocationByPlatform(true);
        setResizable(false);
        setName("PersonnelUpdatePersonnelPage");

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
        jLabel1.setText("Personnel Registration");

        jLabel3.setFont(new java.awt.Font("Sans Serif", 1, 20)); // NOI18N
        jLabel3.setText("Please Enter the Details:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Username:");

        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //IdTxtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("First Name:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Phone Number:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Email:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Age:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Gender:");

        RegisterBut.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        RegisterBut.setText("UPDATE");
        RegisterBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButActionPerformed(evt);
            }
        });

        ClearBut.setText("Reset");
        ClearBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButActionPerformed(evt);
            }
        });

        PGenderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        PGenderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PGenderComboBoxActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setText("Last Name:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setText("Password:");

        passWordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //passWordTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackBut, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ClearBut, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegisterBut, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(passWordTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(FNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(LNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(PGenderComboBox, 0, 201, Short.MAX_VALUE)
                            .addComponent(ageTxt))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BackBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(passWordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(LNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(PGenderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(PhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ClearBut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegisterBut, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>
    
    private void ResetButActionPerformed(java.awt.event.ActionEvent evt) {
        // <editor-fold defaultstate="collapsed" desc="Reset">
        String c1 = Main.perToUpdate.getUsername();
        userNameTxt.setText(c1);
        String c2 = Main.perToUpdate.getPassword();
        passWordTxt.setText(c2);
        String c3 = Main.perToUpdate.getFirstname();
        FNameTxt.setText(c3);
        String c4 = Main.perToUpdate.getLastname();
        LNameTxt.setText(c4);
        int c5 = Main.perToUpdate.getAge();
        ageTxt.setText(String.valueOf(c5));
        String c6 = Main.perToUpdate.getGender();
        if (c6.equals("Male")) {
            PGenderComboBox.setSelectedIndex(0);
            genderTxt = "Male";
        } else {
            PGenderComboBox.setSelectedIndex(1);
            genderTxt = "Female";
        }
        String c7 = Main.perToUpdate.getPhone();
        PhoneTxt.setText(c7);
        String c8 = Main.perToUpdate.getEmail();
        EmailTxt.setText(c8);
        // </editor-fold>
    }
    
    
    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {
        Main.perToUpdate = null;
        this.setVisible(false);
        PersonnelManagePersonnelPage pmppE = new PersonnelManagePersonnelPage();
        pmppE.setVisible(true);
    }
    
    private void PGenderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        String selected = PGenderComboBox.getSelectedItem().toString();
        if (selected != null && selected.equals("Male")) {
            genderTxt = "Male";
        } else if (selected != null && selected.equals("Female")) {
            genderTxt = "Female";
        }

    }
    
    private void UpdateButActionPerformed(java.awt.event.ActionEvent evt) {

        String x1 = userNameTxt.getText().trim();
        String x2 = passWordTxt.getText().trim();
        String x3 = FNameTxt.getText().trim();
        String x4 = LNameTxt.getText().trim();
        String x5 = ageTxt.getText().trim();
        int x5age = Integer.parseInt(ageTxt.getText().trim());
        String x6 = genderTxt;
        String x7 = PhoneTxt.getText().trim();
        String x8 = EmailTxt.getText().trim();

        //Check if important variables already exist.
        Personnel userExistedP = DataIO.checkPersonnelA(x1, x7, x8);

        try {
            if (userExistedP != null) {
                JOptionPane.showMessageDialog(this, "ERROR, That user already exists!", "Error Message", JOptionPane.ERROR_MESSAGE);
            } else {
                if (x1.length() > 0 && x2.length() > 0 && x3.length() > 0 && x4.length() > 0 && x5.length() > 0 && x6.trim().length() > 0 && x7.length() > 0 && x8.length() > 0) {
                    if (x5age >= 18) {
                        //Update Main.userToUpdate to new fields
                        Main.perToUpdate.setUsername(x1);
                        Main.perToUpdate.setPassword(x2);
                        Main.perToUpdate.setFirstname(x3);
                        Main.perToUpdate.setLastname(x4);
                        Main.perToUpdate.setAge(x5age);
                        Main.perToUpdate.setGender(x6);
                        Main.perToUpdate.setPhone(x7);
                        Main.perToUpdate.setEmail(x8);

                        DataIO.updatePersonnel();
                        // After a successful edit of Personnel.
                        JOptionPane.showMessageDialog(null, "You have done the update successfully");
                        this.setVisible(false);
                        PersonnelManagePersonnelPage pmppF = new PersonnelManagePersonnelPage();
                        pmppF.setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "ERROR, That's NOT A VALID AGE!", "Error Message", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "ERROR, Please fill unfilled textfields", "Error Message", JOptionPane.ERROR_MESSAGE);
                }

            }
        } catch (Exception Ex) {
            JOptionPane.showMessageDialog(this, "ERROR, Wrong input format for Age!", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }
}
