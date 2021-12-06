/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ScheduleIO {

    public static ArrayList<CentreSchedule> allSchedules
            = new ArrayList<CentreSchedule>();

    public static void read() {
        try {
            Scanner readSchFile = new Scanner(new File("Schedule.txt"));
            while (readSchFile.hasNext()) {
                int sId = Integer.parseInt(readSchFile.nextLine());
                String centre = readSchFile.nextLine();
                String date = readSchFile.nextLine();
                String sTime = readSchFile.nextLine();
                String eTime = readSchFile.nextLine();
                String name = readSchFile.nextLine();
                int quantity = Integer.parseInt(readSchFile.nextLine());
                readSchFile.nextLine();
                CentreSchedule s = new CentreSchedule(sId, centre, date, sTime, eTime, name, quantity);
                allSchedules.add(s);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found !");
            try {
                PrintWriter writeSchFile = new PrintWriter("Schedule.txt");
            } catch (Exception ex) {
                System.out.println("Error in write!");
            }

        } catch (Exception e) {
            System.out.println("Error in read!");
        }

    }

    public static int write() {
        try {
            PrintWriter writeSchFile = new PrintWriter("Schedule.txt");
            for (int i = 0; i < allSchedules.size(); i++) {
                writeSchFile.println(allSchedules.get(i).getsId());
                writeSchFile.println(allSchedules.get(i).getCentre());
                writeSchFile.println(allSchedules.get(i).getDate());
                writeSchFile.println(allSchedules.get(i).getStartTime());
                writeSchFile.println(allSchedules.get(i).getEndTime());
                writeSchFile.println(allSchedules.get(i).getVacName());
                writeSchFile.println(allSchedules.get(i).getQuantity());
                writeSchFile.println();
            }
            writeSchFile.close();
        } catch (Exception e) {
            System.out.println("Error in write!");
            return -1;
        }
        return 0;
    }
}
