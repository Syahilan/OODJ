/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentoodj;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Darshini
 */
public class ReportPage extends JFrame {
    
    public ReportPage() {
        initComponents();
        displayGenderReport();
        displayAgeReport();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        reportTabbedPanel = new javax.swing.JTabbedPane();
        genderPanel = new javax.swing.JPanel();
        genderContentPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        scrollPanel = new javax.swing.JScrollPane();
        reportGenderTable = new javax.swing.JTable();
        agePanel = new javax.swing.JPanel();
        ageContentPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportAgeTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);

        reportTabbedPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 51, 204));
        title.setText("Gender Report");

        Object[] columns = {"GENDER", "STATUS", "USER COUNT"};
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        reportGenderTable.setModel(model);
        reportGenderTable.setRowSelectionAllowed(false);
        reportGenderTable.setSelectionBackground(new java.awt.Color(0, 0, 255));
        reportGenderTable.setDefaultEditor(Object.class, null);
        scrollPanel.setViewportView(reportGenderTable);

        javax.swing.GroupLayout genderContentPanelLayout = new javax.swing.GroupLayout(genderContentPanel);
        genderContentPanel.setLayout(genderContentPanelLayout);
        genderContentPanelLayout.setHorizontalGroup(
            genderContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genderContentPanelLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genderContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        genderContentPanelLayout.setVerticalGroup(
            genderContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genderContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout genderPanelLayout = new javax.swing.GroupLayout(genderPanel);
        genderPanel.setLayout(genderPanelLayout);
        genderPanelLayout.setHorizontalGroup(
            genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(genderContentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        genderPanelLayout.setVerticalGroup(
            genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(genderContentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        reportTabbedPanel.addTab("Gender", genderPanel);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Age Report");

        Object[] columnsAge = {"AGE GROUP", "STATUS", "COUNT"};
        model2 = new DefaultTableModel();
        model2.setColumnIdentifiers(columnsAge);
        reportAgeTable.setModel(model2);
        reportAgeTable.setDefaultEditor(Object.class, null);
        jScrollPane1.setViewportView(reportAgeTable);

        javax.swing.GroupLayout ageContentPanelLayout = new javax.swing.GroupLayout(ageContentPanel);
        ageContentPanel.setLayout(ageContentPanelLayout);
        ageContentPanelLayout.setHorizontalGroup(
            ageContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ageContentPanelLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );
        ageContentPanelLayout.setVerticalGroup(
            ageContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ageContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout agePanelLayout = new javax.swing.GroupLayout(agePanel);
        agePanel.setLayout(agePanelLayout);
        agePanelLayout.setHorizontalGroup(
            agePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ageContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        agePanelLayout.setVerticalGroup(
            agePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ageContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        reportTabbedPanel.addTab("Age", agePanel);

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reportTabbedPanel)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportTabbedPanel)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.setVisible(false);
        PersonnelMainPage pmp = new PersonnelMainPage();
        pmp.setVisible(true);
    }                                        

    public void displayGenderReport(){
        //Syahilan ADD YOUR CODE HERE
        GenderReport.processGenderReport();
        final Object[] dataG = new Object[NB_COL];
        
        ArrayList<GenderReport> genReport = new ArrayList<GenderReport>();
        genReport = GenderReport.allGenderReport;
        
        for (int j = 0; j < NB_ROW_GEN; j++) {
            dataG[0] = genReport.get(j).getGender();
            dataG[1] = genReport.get(j).getVacStatus();
            dataG[2] = genReport.get(j).getCount();
            model.addRow(dataG);
        }
        
    }

    public void displayAgeReport() {
        ReportAgeData.processAgeReportDate();
        // create an array of objects to set the row data
        final Object[] data = new Object[NB_COL];

        ArrayList<ReportAgeData> ageReport = new ArrayList<ReportAgeData>();
        ageReport = ReportAgeData.allAgeReport;

        for (int j = 0; j < NB_ROW_AGE; j++) {
            data[0] = ageReport.get(j).getAgeMax() == 9999 ? ">= " + ageReport.get(j).getAgeMin() : +ageReport.get(j).getAgeMin() + " - " + ageReport.get(j).getAgeMax();
            data[1] = ageReport.get(j).getVacStatus();
            data[2] = ageReport.get(j).getCount();
            model2.addRow(data);
        }
    }

    

    // Variables declaration - do not modify                     
    private javax.swing.JPanel ageContentPanel;
    private javax.swing.JPanel agePanel;
    private javax.swing.JPanel genderContentPanel;
    private javax.swing.JPanel genderPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable reportAgeTable;
    private javax.swing.JTable reportGenderTable;
    private javax.swing.JTabbedPane reportTabbedPanel;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JLabel title;
    // End of variables declaration                   
    private DefaultTableModel model;
    private DefaultTableModel model2;
    

    // No of columns in age table data to be displayed
    private static final int NB_COL = 3;
    
    // No of rows in age table data to be displayed
    private static final int NB_ROW_AGE = 16;
    private static final int NB_ROW_GEN = 4;

}
