/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class PeopleLoginPage extends JFrame {

    // Variables declaration - do not modify                     
    private JButton BackBut;
    private JButton ClearBut;
    private JButton EnterBut;
    private JLabel LabelPass;
    private JLabel PasswordLable;
    private JPasswordField PasswordTxt;
    private JLabel UsernameLable;
    private JTextField UsernameTxt;
    private JCheckBox jCheckBox1;
    private JLabel jLabel1;
    private JLabel jLabel3;

    public PeopleLoginPage() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        UsernameLable = new javax.swing.JLabel();
        PasswordLable = new javax.swing.JLabel();
        UsernameTxt = new javax.swing.JTextField();
        EnterBut = new javax.swing.JButton();
        ClearBut = new javax.swing.JButton();
        BackBut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        LabelPass = new javax.swing.JLabel();
        PasswordTxt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("COVID-19 VACCINE REGISTRATION SYSTEM");
        setLocationByPlatform(true);
        setResizable(false);
        setName("PeopleLoginPage"); // NOI18N

        UsernameLable.setFont(new java.awt.Font("Sans Serif", 1, 18)); // NOI18N
        UsernameLable.setText("Username:");

        PasswordLable.setFont(new java.awt.Font("Sans Serif", 1, 18)); // NOI18N
        PasswordLable.setText("Password:");

        UsernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTxtActionPerformed(evt);
            }
        });

        EnterBut.setBackground(new java.awt.Color(0, 255, 0));
        EnterBut.setFont(new java.awt.Font("Sans Serif", 1, 15)); // NOI18N
        EnterBut.setText("ENTER");
        EnterBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterButActionPerformed(evt);
            }
        });

        ClearBut.setBackground(new java.awt.Color(0, 153, 153));
        ClearBut.setFont(new java.awt.Font("Sans Serif", 2, 15)); // NOI18N
        ClearBut.setText("CLEAR");
        ClearBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButActionPerformed(evt);
            }
        });

        BackBut.setBackground(new java.awt.Color(255, 0, 0));
        BackBut.setFont(new java.awt.Font("Sans Serif", 3, 15)); // NOI18N
        BackBut.setText("<<BACK");
        BackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sans Serif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Welcome, People");

        jLabel3.setFont(new java.awt.Font("Sans Serif", 1, 20)); // NOI18N
        jLabel3.setText("Please login to access to the system");

        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        LabelPass.setFont(new java.awt.Font("Sans Serif", 2, 9)); // NOI18N

        PasswordTxt.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        PasswordTxt.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                PasswordTxtComponentShown(evt);
            }
        });
        PasswordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addComponent(jLabel3)))
                                .addContainerGap(26, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(BackBut)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(EnterBut)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ClearBut))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jCheckBox1))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(95, 95, 95)
                                                                                .addComponent(PasswordLable))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                .addComponent(UsernameLable)))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(29, 29, 29)
                                                                                .addComponent(LabelPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGap(26, 26, 26))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(UsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                                .addGap(60, 60, 60)))
                                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(UsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(UsernameLable))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(PasswordLable)
                                        .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(EnterBut)
                                        .addComponent(ClearBut)
                                        .addComponent(BackBut))
                                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);

    }// </editor-fold>                        

    private void ClearButActionPerformed(java.awt.event.ActionEvent evt) {
        UsernameTxt.setText("");
        PasswordTxt.setText("");
        LabelPass.setVisible(false);
    }

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);

        StartMenu startMenu = new StartMenu();
        startMenu.setVisible(true);

    }

    private void EnterButActionPerformed(java.awt.event.ActionEvent evt) {

        //INPUTS
        String uname;
        String pword = new String(PasswordTxt.getPassword());
        String n2 = "", n3 = "", n4 = "";
        uname = UsernameTxt.getText();
        People found = DataIO.checkPeople(uname, n2, n3, n4);

        //Verifications
        if (found != null) {

            if (pword.equals(found.getPassword())) {
                this.setVisible(false);
                Main.loginPeo = found;      //set static person object with this persons credentials
                PeopleMainPage pmp1 = new PeopleMainPage();
                pmp1.setVisible(true);

            } else {
                LabelPass.setText("INVALID password... Please, try again!");

            }

        } else {
            LabelPass.setText("INVALID Username... Please, try again!");
        }

    }

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jCheckBox1.isSelected()) {
            PasswordTxt.setEchoChar((char) 0);
        } else {
            PasswordTxt.setEchoChar('*');
        }
    }

    private void UsernameTxtActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void PasswordTxtComponentShown(java.awt.event.ComponentEvent evt) {
        // TODO add your handling code here:
    }

    private void PasswordTxtActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

}
