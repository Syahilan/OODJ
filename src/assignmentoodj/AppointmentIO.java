/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentoodj;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Darshini
 */
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
                readAppFile.nextLine();
                Appointment a = new Appointment(aId, IC, lname, fname, centre, date, sTime, eTime, name);
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
