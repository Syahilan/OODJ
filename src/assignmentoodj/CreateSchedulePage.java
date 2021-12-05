///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package assignmentoodj;
//
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JComboBox;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JSpinner;
//import javax.swing.JTextField;
//import javax.swing.SpinnerDateModel;
//import javax.swing.event.ChangeEvent;
//import javax.swing.event.ChangeListener;
//
///**
// *
// * @author Darshini
// */
//public class CreateSchedulePage extends JFrame implements ActionListener, ChangeListener {
//
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == iconButton) {
//            date.setText(new DatePicker(this, DatePicker.FUTURE_DATES).setPickedDate()); //From source code
//
//        } else if (e.getSource() == btnSave) {
//            // Check mandatory fields
//            String cntr = centre.getSelectedItem().toString();
//            String vacName = vac.getSelectedItem().toString();
//            try {
//                if (qnt.getText().isEmpty() || date.getText().isEmpty() || (qnt.getText().isEmpty() && date.getText().isEmpty())) {
//                    JOptionPane.showMessageDialog(btnSave, "Data Missing");
//
//                } else if (!checkDuplicateSchedule(cntr, vacName, date.getText())
//                        && !checkInvalidDate((Date) startTime.getValue(),
//                                (Date) endTime.getValue())) {
//                    vacIndexToUpdate = VaccineSupply.searchVaccineRecord(cntr, vacName);
//
//                    if (vacIndexToUpdate == -1) {
//                        JOptionPane.showMessageDialog(btnSave, "Vaccine " + vacName
//                                + " not available at " + cntr);
//                    } else {
//                        int quantity = Integer.parseInt(qnt.getText());
//                        VaccineSupply vs = VaccineInventoryIO.allVacSupplies.get(vacIndexToUpdate);
//                        int invQty = vs.getQuantity();
//                        if (quantity > invQty) {
//                            JOptionPane.showMessageDialog(btnSave,
//                                    "Only " + String.valueOf(invQty) + " "
//                                    + vacName + " Vaccine available at "
//                                    + cntr + "!");
//                        } else {
//                            vs.setQuantity(invQty - quantity);
//                            saveRecords(vs);
//                        }
//                    }
//                }
//            } catch (Exception ex) {
//                if (!qnt.getText().isEmpty()) {
//                    JOptionPane.showMessageDialog(btnSave, "Wrong input!");
//                }
//            }
//        } else if (e.getSource() == btnClear) {
//            date.setText(null);
//            qnt.setText(null);
//        }
//    }
//
//    public void stateChanged(ChangeEvent e) {
//        checkInvalidDate((Date) startTime.getValue(),
//                (Date) endTime.getValue());
//    }
//
//    public boolean checkInvalidDate(Date start, Date end) {
//        if (end.before(start)) {
//            JOptionPane.showMessageDialog(this,
//                    "End Date/Time can't be prior to Start Date/Time !");
//            return true;
//        }
//        return false;
//    }
//
//    private boolean checkDuplicateSchedule(String centre, String vacName, String date) {
//        for (int i = 0; i < ScheduleIO.allSchedules.size(); i++) {
//            Schedule sch = ScheduleIO.allSchedules.get(i);
//            if (centre.equals(sch.getCentre())
//                    && vacName.equals(sch.getVacName())
//                    && date.equals(sch.getDate())) {
//                JOptionPane.showMessageDialog(btnSave,
//                        "Schedule already available");
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private void saveRecords(VaccineSupply vs) {
//        int reply = JOptionPane.showConfirmDialog(null,
//                "Confirm Save records to File ?", "WARNING",
//                JOptionPane.YES_NO_OPTION);
//        if (reply == JOptionPane.YES_OPTION) {
//
//            int size = ScheduleIO.allSchedules.size();
//            int id = 20001;
//            if (size > 0) {
//                id = ScheduleIO.allSchedules.get(size - 1).getsId() + 1;
//            }
//            String sTime = new SimpleDateFormat("HH:mm").format(startTime.getValue());
//            String eTime = new SimpleDateFormat("HH:mm").format(endTime.getValue());
//            int quantity = Integer.parseInt(qnt.getText());
//
//            CentreSchedule s = new CentreSchedule(id, centre.getSelectedItem().toString(),
//                    date.getText(), sTime, eTime, vac.getSelectedItem()
//                    .toString(), quantity);
//            ScheduleIO.allSchedules.add(s);
//
//            // Update array of buffered file records
//            VaccineSupply.updateVaccineRecord(vs);
//
//            if (VaccineInventoryIO.write() == 0 && ScheduleIO.write() == 0) {
//                JOptionPane.showMessageDialog(this,
//                        "Records Saved Successfully !");
//            } else {
//                JOptionPane.showMessageDialog(this,
//                        "ERROR: No Records Saved !");
//            }
//        } else {
//            JOptionPane.showMessageDialog(this,
//                    "Operation Cancelled: No Records Saved !");
//        }
//        // Execute action of btnClear
//        btnClear.doClick();
//
//    }
//
//    // Label position
//    private final int lPosX = 60;
//    private final int lPosY = 90;
//    // Field position
//    private final int fPosX = 200;
//    private final int fPosY = 88;
//    // Button position
//    private final int bPosX = 60;
//    private final int bPosY = 350;
//
//    private JButton iconButton, btnSave, btnClear;
//    private JLabel lblCentre, lblDate, lblTime, lblT, lblVac, lblQty, lblTitle;
//    private JComboBox centre, vac;
//    private JTextField date, qnt;
//    private JSpinner startTime = new JSpinner(new SpinnerDateModel());
//    private JSpinner endTime = new JSpinner(new SpinnerDateModel());
//    private JSpinner.DateEditor startTimeEditor = new JSpinner.DateEditor(
//            startTime, "HH:mm");
//    private JSpinner.DateEditor endTimeEditor = new JSpinner.DateEditor(
//            endTime, "HH:mm");
//
//    private int vacIndexToUpdate;
//
//    public CreateSchedulePage() {
//        setTitle("Create Schedule");
//        setLocationByPlatform(true);
//        setLocationRelativeTo(null);
//        setResizable(false);
//        setSize(450, 450);
//        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        JPanel p = new JPanel();
//        p.setLayout(null);
//
//        lblTitle = new JLabel("Create Schedule");
//        lblTitle.setBounds(lPosX + 80, lPosY - 70, 300, 30);
//        lblTitle.setForeground(Color.BLUE);
//        lblTitle.setFont(new Font("", Font.BOLD, 20));
//
//        lblCentre = new JLabel("Centre");
//        lblCentre.setBounds(lPosX, lPosY, 60, 14);
//
//        centre = new JComboBox(Centre.values());
//        centre.setBounds(fPosX, fPosY, 200, 20);
//
//        lblDate = new JLabel("Date");
//        lblDate.setBounds(lPosX, lPosY + 50, 200, 14);
//
//        date = new JTextField();
//        date.setBounds(fPosX, fPosY + 50, 120, 20);
//        date.setEditable(false);
//        date.setFont(new Font("", Font.BOLD, date.getFont().getSize()));
//
//        // Calendar button icon
//        /**
//         * Following source code obtained from (tutorialspoint, 2021)
//         */
//        ImageIcon calIcon = null;
//        String iconFile = "cal.jpg";
//        java.net.URL imgURL = ScheduleManagementPage.class
//                .getResource(iconFile);
//        if (imgURL != null) {
//            calIcon = new ImageIcon(imgURL);
//        } else {
//            JOptionPane.showMessageDialog(this, "Icon image " + iconFile
//                    + " not found !");
//        }
//
//        // Create Calendar icon button
//        iconButton = new JButton(calIcon);
//        iconButton.setToolTipText("Calendar");
//        iconButton.setBounds(fPosX + 120, fPosY + 50, 20, 20);
//        iconButton.addActionListener(this);
//
//        // Time entry fields (start - end)
//        lblTime = new JLabel("Time [Start - End]");
//        lblTime.setBounds(lPosX, lPosY + 100, 200, 14);
//        lblT = new JLabel(" - ");
//        lblT.setBounds(lPosX + 210, lPosY + 100, 200, 14);
//
//        startTime.setBounds(fPosX, fPosY + 100, 60, 20);
//        startTime.setToolTipText("Start time");
//        startTime.setEditor(startTimeEditor);
//        // Set default start time to 9:00 (GMT+4 + 5)
//        startTime.setValue(new Date(5 * 60 * 60 * 1000));
//
//        endTime.setBounds(fPosX + 90, fPosY + 100, 60, 20);
//        endTime.setToolTipText("End time");
//        endTime.setEditor(endTimeEditor);
//        // Set default end time to 15:00 (GMT+4 + 11)
//        endTime.setValue(new Date(11 * 60 * 60 * 1000));
//
//        // Add listeners
//        startTime.addChangeListener(this);
//        endTime.addChangeListener(this);
//
//        lblVac = new JLabel("Vaccine Name");
//        lblVac.setBounds(lPosX, lPosY + 150, 200, 14);
//
//        vac = new JComboBox(VaccineName.values());
//        vac.setBounds(fPosX, fPosY + 150, 200, 20);
//
//        lblQty = new JLabel("Quantity");
//        lblQty.setBounds(lPosX, lPosY + 200, 200, 14);
//
//        qnt = new JTextField();
//        qnt.setBounds(fPosX, fPosY + 200, 200, 20);
//
//        btnSave = new JButton("Save");
//        btnSave.setBounds(bPosX, bPosY, 90, 25);
//
//        btnClear = new JButton("Clear");
//        btnClear.setBounds(bPosX + 250, bPosY, 90, 25);
//
//        btnSave.addActionListener(this);
//        btnClear.addActionListener(this);
//
//        // Add label, fields/combo-boxes, buttons to panel
//        p.add(lblCentre);
//        p.add(centre);
//        p.add(lblDate);
//        p.add(date);
//        p.add(iconButton);
//        p.add(lblTime);
//        p.add(lblT);
//        p.add(startTime);
//        p.add(endTime);
//        p.add(lblVac);
//        p.add(vac);
//        p.add(lblQty);
//        p.add(qnt);
//        p.add(btnSave);
//        p.add(btnClear);
//        p.add(lblTitle);
//        // Add panel to frame
//        add(p);
//    }
//}
