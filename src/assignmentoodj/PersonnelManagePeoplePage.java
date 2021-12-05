/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PersonnelManagePeoplePage extends JFrame{
    
    private static final int PeoDatCol = 8;
    private static People pA;
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
    
    public PersonnelManagePeoplePage() {
        initComponents();
        addPeoRowtoJTable();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Covid Vaccine Management System (CVMS)");
        setName("PersonnelManagePeoplePage");

        jLabel1.setFont(new java.awt.Font("Sans Serif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Manage People Records");

        BackBut.setBackground(new java.awt.Color(255, 0, 0));
        BackBut.setFont(new java.awt.Font("Sans Serif", 3, 12)); // NOI18N
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
                //ClearButActionPerformed(evt);
            }
        });

        jLabel7.setText("Last Name:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sys ID", "First Name", "Last Name", "Age", "Gender", "Phone", "Email", "Citizenship Status", "Passport/IC"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        // get selected row data From table to display
        jTable1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // i = the index of the selected row
                int iRowPeo = jTable1.getSelectedRow();
                Object rowDataA[] = new Object[9];
                for (int j = 0; j < PeoDatCol; j++) {
                    rowDataA[j] = jTable1.getValueAt(iRowPeo, j).toString();
                }
                rowDataA[PeoDatCol] = iRowPeo;  //Row number
                ArrayList<People> thisPeople = DataIO.allPeople;
                
                int x1 = thisPeople.get(iRowPeo).getSystemNo();
                String x2 = thisPeople.get(iRowPeo).getUsername();
                String x3 = thisPeople.get(iRowPeo).getPassword();
                String x4 = thisPeople.get(iRowPeo).getFirstname();
                String x5 = thisPeople.get(iRowPeo).getLastname();
                int x6 = thisPeople.get(iRowPeo).getAge();
                String x7 = thisPeople.get(iRowPeo).getGender();
                String x8 = thisPeople.get(iRowPeo).getPhone();
                String x9 = thisPeople.get(iRowPeo).getEmail();
                String x10 = thisPeople.get(iRowPeo).getAddressln1();
                String x11 = thisPeople.get(iRowPeo).getAddressln2();
                String x12 = thisPeople.get(iRowPeo).getCitizenStat();
                String x13 = thisPeople.get(iRowPeo).getIdentityTxt();
                People pA = new People(x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13);
                Main.peoToUpdate = pA;
                // OUTPUT = People pA [People Object]
                
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BackBut)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(UpdateUserBut, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DeleteUserBut, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackBut)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel3)
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
    
    public void addPeoRowtoJTable(){
        DefaultTableModel peoModel = (DefaultTableModel) jTable1.getModel();
        //Read allPeople into myPeople
        ArrayList<People> myPeople = DataIO.allPeople;
        Object rowData[] = new Object[9];
        for(int i=0; i<myPeople.size();i++){
            rowData[0] = myPeople.get(i).getSystemNo();
            rowData[1] = myPeople.get(i).getFirstname();
            rowData[2] = myPeople.get(i).getLastname();
            rowData[3] = myPeople.get(i).getAge();
            rowData[4] = myPeople.get(i).getGender();
            rowData[5] = myPeople.get(i).getPhone();
            rowData[6] = myPeople.get(i).getEmail();
            rowData[7] = myPeople.get(i).getCitizenStat();
            rowData[8] = myPeople.get(i).getIdentityTxt();
            peoModel.addRow(rowData);
        }
    
    }
    
    
    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {                                        
        this.setVisible(false);
        PersonnelUserManagementPage pumpC = new PersonnelUserManagementPage();
        pumpC.setVisible(true);
    }            
    
    private void SearchButActionPerformed(java.awt.event.ActionEvent evt) {
    //Check if the any of the fields entered is null?
    
     
    }
    
    
    private void UpdateUserButActionPerformed(java.awt.event.ActionEvent evt) {
        if (Main.peoToUpdate != null){
            this.setVisible(false);
            PersonnelUpdateUserForm puuf = new PersonnelUpdateUserForm();
            puuf.setVisible(true);
        } 
    
    }
    
    
    private void DeleteUserButActionPerformed(java.awt.event.ActionEvent evt){
    if (Main.peoToUpdate != null){
            // DELETE THE USER
            Main.userToDelete = Main.peoToUpdate;    
            DataIO.deleteUser();
            JOptionPane.showMessageDialog(null, "User Deleted!");
            this.setVisible(false);
            PersonnelUserManagementPage pumpC = new PersonnelUserManagementPage();
            pumpC.setVisible(true);
        } 
    
    }
    
    
}
