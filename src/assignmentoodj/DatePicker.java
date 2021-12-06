/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DatePicker {

    public static final int ALL_DATES = 0;
    public static final int FUTURE_DATES = 1;

    Calendar today = Calendar.getInstance();
    int month = today.get(Calendar.MONTH);
    int year = today.get(Calendar.YEAR);
    JLabel l = new JLabel("", JLabel.CENTER);
    String day = "";
    JDialog d;
    JButton[] button = new JButton[49];

    public DatePicker(JFrame parent, int option) {
        d = new JDialog();
        d.setModal(true);
        String[] header = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        JPanel p1 = new JPanel(new GridLayout(7, 7));
        p1.setPreferredSize(new Dimension(430, 120));

        for (int x = 0; x < button.length; x++) {
            final int selection = x;
            button[x] = new JButton();
            button[x].setFocusPainted(false);
            button[x].setBackground(Color.white);
            if (x > 6) {
                button[x].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        day = button[selection].getActionCommand();
                        if (!day.equals("") && option == FUTURE_DATES) {
                            Calendar pickedDate = Calendar.getInstance();
                            // Clear date object and feed year, month, day only
                            // so that time portion is zeroed and not used in comparison
                            pickedDate.clear();
                            pickedDate.set(year, month, Integer.parseInt(day));
                            // Ensure picked scheduled date is after current
                            // date
                            if (!pickedDate.after(today)) {
                                JOptionPane
                                        .showMessageDialog(null,
                                                "Date selected must be > current date !");
                            } else {
                                d.dispose();
                            }
                        } else {
                            d.dispose();
                        }
                    }
                });
            }
            if (x < 7) {
                button[x].setText(header[x]);
                button[x].setForeground(Color.BLUE);
            }
            p1.add(button[x]);
        }
        JPanel p2 = new JPanel(new GridLayout(1, 3));
        JButton previous = new JButton("<< Previous");
        previous.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                month--;
                displayDate(option);
            }
        });
        p2.add(previous);
        p2.add(l);
        JButton next = new JButton("Next >>");
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                month++;
                displayDate(option);
            }
        });
        p2.add(next);
        d.add(p1, BorderLayout.CENTER);
        d.add(p2, BorderLayout.SOUTH);
        d.pack();
        d.setLocationRelativeTo(parent);
        displayDate(option);
        d.setVisible(true);
    }

    public void displayDate(int option) {
        for (int x = 7; x < button.length; x++) {
            button[x].setText("");
            button[x].setBackground(Color.white);
        }
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
                "MMMM yyyy");
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, 1);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int x = 6 + dayOfWeek, day = 1; day <= daysInMonth; x++, day++) {
            button[x].setText("" + day);
            button[x].setBackground(Color.white);
            if (option == FUTURE_DATES) {
                Calendar dd = Calendar.getInstance();
                // Clear date object and feed year, month, day only
                // so that time portion is zeroed and not used in comparison
                dd.clear();
                dd.set(year, month, day);
                // Set different background color for past dates
                if (!dd.after(today)) {
                    button[x].setBackground(Color.gray);
                } else {
                    button[x].setBackground(Color.white);
                }
            }
        }
        l.setText(sdf.format(cal.getTime()));
        d.setTitle("Date Picker");
    }

    public String setPickedDate() {
        if (day.equals("")) {
            return day;
        }
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
                "E, dd/MM/yyyy"); // adapted (add E, / to display day of week)
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, Integer.parseInt(day));
        return sdf.format(cal.getTime());
    }
}
