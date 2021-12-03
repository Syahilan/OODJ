/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

//IMPORT LIST
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class DataIO {

    // Array lists for Personnel & People
    public static ArrayList<Personnel> allPersonnel
            = new ArrayList<Personnel>();
    
    public static ArrayList<People> allPeople
            = new ArrayList<People>();
    
    
    
    //READ personnel text file
    public static void readPersonnel() {
        try {
            Scanner s1 = new Scanner(new File("Personnel.txt"));
            while (s1.hasNext()) {
                int sysID = Integer.parseInt(s1.nextLine());
                String a1 = s1.nextLine();
                String a2 = s1.nextLine();
                String a3 = s1.nextLine();
                String a4 = s1.nextLine();
                int a5 = Integer.parseInt(s1.nextLine());
                String a6 = s1.nextLine();
                //Same as Darshini's Date format
                String a7 = s1.nextLine(); 
                java.text.SimpleDateFormat myDateFormat = new java.text.SimpleDateFormat("E, dd/MM/yyyy");
                Date a7Date = myDateFormat.parse(a7);
                String a8 = s1.nextLine();
                String a9 = s1.nextLine();
                s1.nextLine();
                Personnel c = new Personnel(sysID, a1, a2, a3, a4, a5, a6, a7Date, a8, a9);
                allPersonnel.add(c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found !");
            try {
                PrintWriter writePERFile = new PrintWriter("Personnel.txt");
            } catch (Exception ex) {
                System.out.println("Error in write! Creating new Personnel File!");
            }
        } catch (Exception e) {
            System.out.println("Error in READ!");
        }

    }
    
    
    //READ people text file
    public static void readPeople() {
        try {
            Scanner s2 = new Scanner(new File("People.txt"));
            while (s2.hasNext()) {
                int sysID = Integer.parseInt(s2.nextLine());
                String u1 = s2.nextLine();
                String u2 = s2.nextLine();
                String u3 = s2.nextLine();
                String u4 = s2.nextLine();
                int u5 = Integer.parseInt(s2.nextLine());
                String u6 = s2.nextLine();
                String u7 = s2.nextLine();
                String u8 = s2.nextLine();
                String u9 = s2.nextLine();
                String u10 = s2.nextLine();
                String u11 = s2.nextLine();
                String u12 = s2.nextLine();
                s2.nextLine();
                People d = new People(sysID, u1, u2, u3, u4, u5, u6, u7, u8, u9, u10, u11, u12);
                allPeople.add(d);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found !");
            try {
                PrintWriter writePEOFile = new PrintWriter("People.txt");
            } catch (Exception ax) {
                System.out.println("Error in write! Creating new People File!");
            }
        } catch (Exception a) {
            System.out.println("Error in READ!");
        }

    }
    
    
    //WRITE personnel text file
    public static void writePersonnel() {
        try {
            PrintWriter personnelWriter = new PrintWriter("Personnel.txt");
            for (int i = 0; i < allPersonnel.size(); i++) {
                personnelWriter.println(allPersonnel.get(i).getSystemNo());     // WRITE System Number
                personnelWriter.println(allPersonnel.get(i).getUsername());     // WRITE Username
                personnelWriter.println(allPersonnel.get(i).getPassword());     // WRITE Password
                personnelWriter.println(allPersonnel.get(i).getFirstname());    // WRITE First Name
                personnelWriter.println(allPersonnel.get(i).getLastname());     // WRITE Last Name
                personnelWriter.println(allPersonnel.get(i).getAge());          // WRITE Age
                personnelWriter.println(allPersonnel.get(i).getGender());       // WRITE Gender
                //Change format to "E, dd/MM/yyyy", Same as Darshini's Date format.
                Date f1 = allPersonnel.get(i).getStartDate();
                java.text.SimpleDateFormat myDateFormat = new java.text.SimpleDateFormat("E, dd/MM/yyyy");
                String dateStr = myDateFormat.format(f1);
                personnelWriter.println(dateStr);    // WRITE StartDate
                personnelWriter.println(allPersonnel.get(i).getPhone());        // WRITE Phone
                personnelWriter.println(allPersonnel.get(i).getEmail());        // WRITE Email
                personnelWriter.println();
            }
            personnelWriter.close();

        } catch (Exception e) {
            System.out.println("Error in WRITE!");
        }

    }
    
    
    //WRITE people text file
    public static void writePeople(){
    try {
            PrintWriter peopleWriter = new PrintWriter("People.txt");
            for (int i = 0; i < allPeople.size(); i++) {
                peopleWriter.println(allPeople.get(i).getSystemNo());
                peopleWriter.println(allPeople.get(i).getUsername());
                peopleWriter.println(allPeople.get(i).getPassword());
                peopleWriter.println(allPeople.get(i).getFirstname());
                peopleWriter.println(allPeople.get(i).getLastname());
                peopleWriter.println(allPeople.get(i).getAge());
                peopleWriter.println(allPeople.get(i).getGender());
                peopleWriter.println(allPeople.get(i).getPhone());
                peopleWriter.println(allPeople.get(i).getEmail());
                peopleWriter.println(allPeople.get(i).getAddressln1());
                peopleWriter.println(allPeople.get(i).getAddressln2());
                peopleWriter.println(allPeople.get(i).getCitizenStat());
                peopleWriter.println(allPeople.get(i).getIdentityTxt());
                peopleWriter.println();
            }
            peopleWriter.close();

        } catch (Exception e) {
            System.out.println("Error in WRITE!");
        }
    
    }
    
    
    //Personnel Checking
    public static Personnel checkPersonnel(String a1) {
        for (int i = 0; i < allPersonnel.size(); i++) {
            if (a1.equals(allPersonnel.get(i).getUsername())) {
                return allPersonnel.get(i);
            }
        }
        return null;
    }
    
    
    //People Checking
    public static People checkPeople(String x1, String x2, String x3, String x4) {
        for (int i = 0; i < allPeople.size(); i++) {
            if ( x1.equals(allPeople.get(i).getUsername()) || x2.equals(allPeople.get(i).getPhone()) || x3.equals(allPeople.get(i).getEmail()) || x4.equals(allPeople.get(i).getIdentityTxt())) {
                return allPeople.get(i);
            }
        }
        return null;
    }
    
    //Register New People.
    

}
