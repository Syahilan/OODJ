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

public class AppointmentIO {

    public static ArrayList<Appointment> allAppointments
            = new ArrayList<Appointment>();

    public static void read() {
        try {
            Scanner readAppFile = new Scanner(new File("Appointment.txt"));
            while (readAppFile.hasNext()) {
                int aId = Integer.parseInt(readAppFile.nextLine());
                String IC = readAppFile.nextLine();
                String lname = readAppFile.nextLine();
                String fname = readAppFile.nextLine();
                String centre = readAppFile.nextLine();
                String date = readAppFile.nextLine();
                String sTime = readAppFile.nextLine();
                String eTime = readAppFile.nextLine();
                String name = readAppFile.nextLine();
                String status = readAppFile.nextLine();
                readAppFile.nextLine();
                Appointment a = new Appointment(aId, IC, lname, fname, centre, date, sTime, eTime, name, status);
                allAppointments.add(a);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found !");
            try {
                PrintWriter writeAppFile = new PrintWriter("Appointment.txt");
            } catch (Exception ex) {
                System.out.println("Error in write!");
            }
        } catch (Exception e) {
            System.out.println("Error in read!");
        }
    }

    public static int write() {
        try {
            PrintWriter writeAppFile = new PrintWriter("Appointment.txt");
            for (int i = 0; i < allAppointments.size(); i++) {
                writeAppFile.println(allAppointments.get(i).getaId());
                writeAppFile.println(allAppointments.get(i).getNIC());
                writeAppFile.println(allAppointments.get(i).getLname());
                writeAppFile.println(allAppointments.get(i).getFname());
                writeAppFile.println(allAppointments.get(i).getCentre());
                writeAppFile.println(allAppointments.get(i).getDate());
                writeAppFile.println(allAppointments.get(i).getStartTime());
                writeAppFile.println(allAppointments.get(i).getEndTime());
                writeAppFile.println(allAppointments.get(i).getVacName());
                writeAppFile.println(allAppointments.get(i).getStatus());
                writeAppFile.println();
            }
            writeAppFile.close();
        } catch (Exception e) {
            System.out.println("Error in write!");
            return -1;
        }
        return 0;
    }
}
