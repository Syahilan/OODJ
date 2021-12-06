/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateVacInventoryPage extends JFrame implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSave) {

            int size = VaccineInventoryIO.allVacSupplies.size();
            boolean flag = true;
            String centreName = centre.getSelectedItem().toString();
            String vName = vac.getSelectedItem().toString();
            try {
                if (qnt.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(btnSave, "Data Missing");
                } else // Check duplicate
                {
                    for (int i = 0; i < size; i++) {
                        VaccineSupply vacSup = VaccineInventoryIO.allVacSupplies
                                .get(i);
                        if (centreName.equals(vacSup.getCentre().toString())
                                && vName.equals(vacSup.getVacName().toString())) {
                            flag = false;
                            break;

                        }
                    }
                }
                if (flag) {
                    int id = 10001 + VaccineInventoryIO.allVacSupplies.size();

                    VaccineSupply supplyRec = new VaccineSupply(id, centreName,
                            vName, Integer.parseInt(qnt.getText()));
                    VaccineInventoryIO.allVacSupplies.add(supplyRec);
                    VaccineInventoryIO.write();
                    JOptionPane.showMessageDialog(null, "Data Saved");
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(btnSave,
                            "Record already available");
                }

            } catch (Exception ex) {
                if (!qnt.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(btnSave, "Wrong input!");
                }
            }
        } else if (e.getSource() == btnClear) {
            qnt.setText(null);
        }
    }

    // Label position
    private int lPosX = 60;
    private int lPosY = 30;
    // Field position
    private int fPosX = 200;
    private int fPosY = 28;
    // Button position
    private int bPosX = 60;
    private int bPosY = 200;

    public JFrame frame;
    private JButton btnSave, btnClear;
    private JLabel lblCentre, lblVac, lblQnt;
    private JComboBox centre, vac;
    private JTextField qnt;

    public CreateVacInventoryPage() {

        frame = new JFrame("Allocate Vaccine Supply");
        frame.setBounds(900, 550, 500, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel p = new JPanel();
        p.setLayout(null);

        lblCentre = new JLabel("Centre");
        lblCentre.setBounds(lPosX, lPosY, 60, 14);

        centre = new JComboBox(Centre.values());
        centre.setBounds(fPosX, fPosY, 200, 20);

        lblVac = new JLabel("Vaccine Name");
        lblVac.setBounds(lPosX, lPosY + 40, 200, 14);

        vac = new JComboBox(VaccineName.values());
        vac.setBounds(fPosX, fPosY + 40, 200, 20);

        lblQnt = new JLabel("Quantity");
        lblQnt.setBounds(lPosX, lPosY + 80, 100, 14);

        qnt = new JTextField();
        qnt.setBounds(fPosX, fPosY + 80, 200, 20);
        qnt.setColumns(10);

        btnSave = new JButton("Save");
        btnSave.setBounds(bPosX, bPosY, 90, 25);

        btnClear = new JButton("Clear");
        btnClear.setBounds(bPosX + 250, bPosY, 90, 25);

        btnSave.addActionListener(this);
        btnClear.addActionListener(this);

        // Add label, fields/combo-boxes, buttons to panel
        p.add(lblCentre);
        p.add(centre);
        p.add(lblVac);
        p.add(vac);
        p.add(lblQnt);
        p.add(qnt);
        p.add(btnSave);
        p.add(btnClear);

        // Add panel to frame
        frame.add(p);

        frame.setVisible(false);
    }

}
