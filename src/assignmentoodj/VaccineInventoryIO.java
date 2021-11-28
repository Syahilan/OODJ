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

public class VaccineInventoryIO {

    public static ArrayList<VaccineSupply> allVacSupplies
            = new ArrayList<VaccineSupply>();

    public static void read() {
        try {
            Scanner readVacFile = new Scanner(new File("VaccineInventory.txt"));
            while (readVacFile.hasNext()) {
                int suId = Integer.parseInt(readVacFile.nextLine());
                String centre = readVacFile.nextLine();
                String name = readVacFile.nextLine();
                int qty = Integer.parseInt(readVacFile.nextLine());
                readVacFile.nextLine();
                VaccineSupply v = new VaccineSupply(suId, centre, name, qty);
                allVacSupplies.add(v);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found !");
            try {
                PrintWriter writeVacFile = new PrintWriter("VaccineInventory.txt");
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
            PrintWriter writeVacFile = new PrintWriter("VaccineInventory.txt");
            for (int i = 0; i < allVacSupplies.size(); i++) {
                writeVacFile.println(allVacSupplies.get(i).getId());
                writeVacFile.println(allVacSupplies.get(i).getCentre());
                writeVacFile.println(allVacSupplies.get(i).getVacName());
                writeVacFile.println(allVacSupplies.get(i).getQuantity());
                writeVacFile.println();
            }

            writeVacFile.close();
        } catch (Exception e) {
            System.out.println("Error in write!");
            return -1;
        }
        return 0;
    }
}
