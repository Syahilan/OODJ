/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class UpdateSchedulePage extends JFrame implements ActionListener, ChangeListener {

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnConfirm) {
            try {
                if (qty.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Data Missing");
                } else if (Integer.parseInt(qty.getText()) <= 0) {
                    JOptionPane.showMessageDialog(this,
                            "ERROR: Quantity should be > 0 !");
                } else if (Integer.parseInt(qty.getText()) > 0) {
                    updateSchedule(Integer.parseInt(qty.getText()), new SimpleDateFormat(
                            "HH:mm").format(startTime.getValue()),
                            new SimpleDateFormat("HH:mm").format(endTime.getValue()));
                }
            } catch (Exception ex) {
                if (!qty.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Wrong input!");
                }
            }
        }
    }

    public void stateChanged(ChangeEvent e) {
        Date start = (Date) startTime.getValue();
        Date end = (Date) endTime.getValue();
        if (end.before(start)) {
            JOptionPane.showMessageDialog(this,
                    "End Time can't be prior to Start Time !");
        }
    }

    public void setScheduleData(String[] data) {

        centre.setText(data[1]);
        centre.setEditable(false);

        date.setText(data[2]);
        date.setEditable(false);

        // Set start & end time from text (format: "HH:mm" - "HH:mm")
        // Set times from text (format: "HH:mm" - "HH:mm")
        String[] s = data[3].split("-");
        startTime.setValue(Util.str2Date(s[0].trim(), "HH:mm"));
        endTime.setValue(Util.str2Date(s[1].trim(), "HH:mm"));

        vac.setText(data[4]);
        vac.setEditable(false);

        qty.setText(data[5]);
        qty.setColumns(10);

        // Set / save scheduleId and original qty
        schId = Integer.parseInt(data[0]);
        origQuantity = Integer.parseInt(data[5]);
    }

    private void updateSchedule(int quantity, String sTime, String eTime) {
        // Update vaccine inventory
        // Check vaccine availability + get index of vaccine record
        String cntr = centre.getText();
        String vacName = vac.getText();
        int vacIndex = VaccineSupply.searchVaccineRecord(cntr, vacName);
        if (vacIndex != -1) {
            VaccineSupply vs = VaccineInventoryIO.allVacSupplies.get(vacIndex);
            int invQty = vs.getQuantity();
            if (quantity > invQty) {
                JOptionPane.showMessageDialog(this,
                        "Only " + String.valueOf(invQty) + " "
                        + vacName + " Vaccine available at "
                        + cntr + " !");
            } else {
                if(origQuantity > quantity){
                    vs.setQuantity(invQty + (origQuantity - quantity));
                }else
                    vs.setQuantity(invQty - (origQuantity - quantity));
                
                VaccineSupply.updateVaccineRecord(vs);
                // Update Centre Schedule
                // Create and Set schedule object
                CentreSchedule sch = new CentreSchedule(schId, sTime, eTime, quantity);
                // Update array of buffered file records
                CentreSchedule.updateScheduleRecord(sch);
                JOptionPane.showMessageDialog(this, "Record updated ! Click on 'Save' button to update file.");
                dispose();
            }
        }
    }

    public UpdateSchedulePage() {

        // Initialize the update record frame
        setTitle("Update Schedule");
        setLocationByPlatform(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(350, 450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        lblTitle = new JLabel("Update Schedule");
        lblTitle.setBounds(lPosX + 30, lPosY - 70, 300, 30);
        lblTitle.setForeground(Color.BLUE);
        lblTitle.setFont(new Font("", Font.BOLD, 20));

        lblCentre = new JLabel("Centre");
        lblCentre.setBounds(lPosX, lPosY, 100, 14);

        centre = new JTextField();
        centre.setBounds(fPosX, fPosY, 150, 20);
        centre.setEditable(false);

        lblDate = new JLabel("Date");
        lblDate.setBounds(lPosX, lPosY + 40, 60, 14);

        date = new JTextField();
        date.setBounds(fPosX, fPosY + 40, 150, 20);

        lblVac = new JLabel("Vaccine");
        lblVac.setBounds(lPosX, lPosY + 80, 60, 14);

        vac = new JTextField();
        vac.setBounds(fPosX, fPosY + 80, 150, 20);

        lblTime = new JLabel("Time");
        lblTime.setBounds(lPosX, lPosY + 120, 60, 14);

        startTime.setBounds(fPosX, fPosY + 120, 60, 20);
        startTime.setToolTipText("Start time");
        startTime.setEditor(startTimeEditor);
        endTime.setBounds(fPosX + 90, fPosY + 120, 60, 20);
        endTime.setToolTipText("End time");
        endTime.setEditor(endTimeEditor);

        // Add the listener to the time fields
        startTime.addChangeListener(this);
        endTime.addChangeListener(this);

        lblQnt = new JLabel("Quantity");
        lblQnt.setBounds(lPosX, lPosY + 160, 150, 14);

        qty = new JTextField();
        qty.setBounds(fPosX, fPosY + 160, 150, 20);

        btnConfirm = new JButton("Confirm");
        btnConfirm.setBounds(bPosX, bPosY, 90, 30);
        btnConfirm.addActionListener(this);

        add(lblCentre);
        add(centre);
        add(lblDate);
        add(date);
        add(lblTime);
        add(startTime);
        add(endTime);
        add(lblVac);
        add(vac);
        add(lblQnt);
        add(qty);
        add(btnConfirm);
        add(lblTitle);

        setVisible(true);
    }

    // Label position
    private final int lPosX = 60;
    private final int lPosY = 110;

    // Field position
    private final int fPosX = 130;
    private final int fPosY = 108;

    // Button position
    private final int bPosX = 130;
    private final int bPosY = 350;

    private JLabel lblTitle, lblCentre, lblDate, lblTime, lblVac, lblQnt, lblSCrit;
    private JTextField centre, date, vac, qty;

    private JSpinner startTime = new JSpinner(new SpinnerDateModel());
    private JSpinner endTime = new JSpinner(new SpinnerDateModel());
    private JSpinner.DateEditor startTimeEditor = new JSpinner.DateEditor(
            startTime, "HH:mm");
    private JSpinner.DateEditor endTimeEditor = new JSpinner.DateEditor(
            endTime, "HH:mm");
    private JButton btnConfirm;

    // Variable to store original quantity (before any update by page)
    private int origQuantity;

    // Value of id and index of schedule selected 
    private int schId;
    private int schIndex;
}
