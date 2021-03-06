/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

//IMPORT LIST
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PersonnelManagePersonnelPage extends JFrame{
    
    private static final int PerDatCol = 7;
    Personnel pB;
    
    //Boolean to activate mouse listener A and B.
    boolean MouseBool = true;
    
    //Class Specific array for mouse clicked fix!
    public static ArrayList<User> allUserSearchUpdaterB
            = new ArrayList<User>();
    
    // Variables declaration               
    private JButton BackBut;
    private JButton ClearBut;
    private JTextField FirstNameTxt;
    private JTextField LastNameTxt;
    private JButton UpdateUserBut;
    private JButton DeleteUserBut;
    private JButton SearchBut;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel7;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    // End of variables declaration
    
    public PersonnelManagePersonnelPage() {
        initComponents();
        addPerRowtoJTable();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Swing Codes">                          
    private void initComponents() {

        jLabel1 = new JLabel();
        BackBut = new JButton();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        FirstNameTxt = new JTextField();
        SearchBut = new JButton();
        UpdateUserBut = new JButton();
        ClearBut = new JButton();
        jLabel7 = new JLabel();
        LastNameTxt = new JTextField();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        DeleteUserBut = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("COVID-19 VACCINE REGISTRATION SYSTEM");
        setLocationByPlatform(true);
        setResizable(false);
        setName("PersonnelManagePersonnelPage");

        jLabel1.setFont(new java.awt.Font("Sans Serif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Manage Personnel Records");

        BackBut.setBackground(new java.awt.Color(255, 0, 0));
        BackBut.setFont(new java.awt.Font("Sans Serif", 3, 18)); // NOI18N
        BackBut.setForeground(new java.awt.Color(255, 255, 255));
        BackBut.setText("<<BACK");
        BackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButActionPerformed(evt);
            }
        });

        jLabel2.setText("First Name:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        jLabel3.setText("Please enter First Name and Last Name (before clicking \"Search\" button)");

        SearchBut.setText("Search");
        SearchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButActionPerformed(evt);
            }
        });

        UpdateUserBut.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        UpdateUserBut.setText("UPDATE USER");
        UpdateUserBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateUserButActionPerformed(evt);
            }
        });

        ClearBut.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        ClearBut.setText("Clear");
        ClearBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButActionPerformed(evt);
            }
        });

        jLabel7.setText("Last Name:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Sys ID", "First Name", "Last Name", "Age", "Gender", "Phone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        // get selected row data From table to display
        jTable1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (MouseBool == true) {
                    // i = the index of the selected row
                    int iRowPer = jTable1.getSelectedRow();
                    Object rowDataA[] = new Object[8];
                    for (int j = 0; j < PerDatCol; j++) {
                        rowDataA[j] = jTable1.getValueAt(iRowPer, j).toString();
                    }
                    rowDataA[PerDatCol] = iRowPer;  //Row number
                    ArrayList<Personnel> thisPersonnel = DataIO.allPersonnel;

                    int x1 = thisPersonnel.get(iRowPer).getSystemNo();
                    String x2 = thisPersonnel.get(iRowPer).getUsername();
                    String x3 = thisPersonnel.get(iRowPer).getPassword();
                    String x4 = thisPersonnel.get(iRowPer).getFirstname();
                    String x5 = thisPersonnel.get(iRowPer).getLastname();
                    int x6 = thisPersonnel.get(iRowPer).getAge();
                    String x7 = thisPersonnel.get(iRowPer).getGender();
                    Date x8 = thisPersonnel.get(iRowPer).getStartDate();
                    String x9 = thisPersonnel.get(iRowPer).getPhone();
                    String x10 = thisPersonnel.get(iRowPer).getEmail();
                    Personnel pB = new Personnel(x1, x2, x3, x4, x5, x6, x7, x8, x9, x10);
                    Main.perToUpdate = pB;
                    // OUTPUT = Personnel pB [Personnel Object]
                } else if (MouseBool == false) {
                    for (int y = 0; y < allUserSearchUpdaterB.size(); y++) {
                        int x1S = allUserSearchUpdaterB.get(y).getSystemNo();
                        String x2S = allUserSearchUpdaterB.get(y).getUsername();
                        String x3S = allUserSearchUpdaterB.get(y).getPassword();
                        String x4S = allUserSearchUpdaterB.get(y).getFirstname();
                        String x5S = allUserSearchUpdaterB.get(y).getLastname();
                        int x6S = allUserSearchUpdaterB.get(y).getAge();
                        String x7S = allUserSearchUpdaterB.get(y).getGender();
                        Date x8S = allUserSearchUpdaterB.get(y).getStartDate();
                        String x9S = allUserSearchUpdaterB.get(y).getPhone();
                        String x10S = allUserSearchUpdaterB.get(y).getEmail();
                        Personnel pB = new Personnel(x1S, x2S, x3S, x4S, x5S, x6S, x7S, x8S, x9S, x10S);
                        Main.perToUpdate = pB;
                        // OUTPUT = Personnel pB [Personnel Object]
                    }

                }
                
            }
        });
        
        DeleteUserBut.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        DeleteUserBut.setText("DELETE USER");
        DeleteUserBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUserButActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(FirstNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(LastNameTxt))
                                .addGap(18, 18, 18)
                                .addComponent(SearchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(ClearBut)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(BackBut, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(UpdateUserBut, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DeleteUserBut, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(8, 8, 8)))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(FirstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(LastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ClearBut, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateUserBut)
                    .addComponent(DeleteUserBut))
                .addContainerGap())
        );
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>
    
    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        PersonnelUserManagementPage pumpC = new PersonnelUserManagementPage();
        pumpC.setVisible(true);
    }
    
    private void SearchButActionPerformed(java.awt.event.ActionEvent evt) {
        //Check if the any of the fields entered is null?
        String x1 = FirstNameTxt.getText().trim();      // Search Criteria 1
        String x2 = LastNameTxt.getText().trim();       // Search Criteria 2

        if (x1.length() > 0 && x2.length() > 0) {
            //Reset Main userToSearch to null every search.
            Main.userToSearch = null;
            //Parse the Strings to DATAIO Search Function.
            Main.userType = 2;          //Used to denote the type of user being searched (Current Index: 1 = People, 2 = Personnel).  
            DataIO.checkUser(x1, x2);
            //userToSearch is found and set!
            DefaultTableModel perModelA = (DefaultTableModel) jTable1.getModel();
            perModelA.setRowCount(0);
            Object rowData[] = new Object[7];
            for (int i = 0; i < DataIO.allUserSearch.size(); i++) {
                rowData[0] = DataIO.allUserSearch.get(i).getSystemNo();
                rowData[1] = DataIO.allUserSearch.get(i).getFirstname();
                rowData[2] = DataIO.allUserSearch.get(i).getLastname();
                rowData[3] = DataIO.allUserSearch.get(i).getAge();
                rowData[4] = DataIO.allUserSearch.get(i).getGender();
                rowData[5] = DataIO.allUserSearch.get(i).getPhone();
                rowData[6] = DataIO.allUserSearch.get(i).getEmail();
                perModelA.addRow(rowData);
            }
            
            allUserSearchUpdaterB = DataIO.allUserSearch;
            DataIO.allUserSearch = new ArrayList<User>();
            MouseBool = false;
        } else {
            JOptionPane.showMessageDialog(this, "ERROR, Please fill fields for First name AND Last Name!", "Error Message", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void ClearButActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel perModelA = (DefaultTableModel) jTable1.getModel();
        perModelA.setRowCount(0);
        FirstNameTxt.setText("");
        LastNameTxt.setText("");
        addPerRowtoJTable();
        MouseBool = true;
    }
    
    
    private void UpdateUserButActionPerformed(java.awt.event.ActionEvent evt) {
        if (Main.perToUpdate != null) {
            this.setVisible(false);
            PersonnelUpdateAdminForm puaf = new PersonnelUpdateAdminForm();
            puaf.setVisible(true);
        }

    }
    
    private void DeleteUserButActionPerformed(java.awt.event.ActionEvent evt){
    if (Main.perToUpdate != null) {
            // DELETE THE USER
            Main.userToDelete = Main.perToUpdate;
            DataIO.deleteUser();
            JOptionPane.showMessageDialog(null, "User Deleted!");
            this.setVisible(false);
            PersonnelUserManagementPage pumpCX = new PersonnelUserManagementPage();
            pumpCX.setVisible(true);
        }
    }
    
    public void addPerRowtoJTable() {
        DefaultTableModel perModel = (DefaultTableModel) jTable1.getModel();
        //Read allPersonnel into myPersonnel
        ArrayList<Personnel> myPersonnel = DataIO.allPersonnel;
        Object rowData[] = new Object[7];
        for (int i = 0; i < myPersonnel.size(); i++) {
            rowData[0] = myPersonnel.get(i).getSystemNo();
            rowData[1] = myPersonnel.get(i).getFirstname();
            rowData[2] = myPersonnel.get(i).getLastname();
            rowData[3] = myPersonnel.get(i).getAge();
            rowData[4] = myPersonnel.get(i).getGender();
            rowData[5] = myPersonnel.get(i).getPhone();
            rowData[6] = myPersonnel.get(i).getEmail();
            perModel.addRow(rowData);
        }
    }
    
}
