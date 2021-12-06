/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

public class Main {

    public static StartMenu startMenu = new StartMenu();    //Call the Start Menu When program is launched

    //Static Integers
    public static int userType = 0;

    // Object containers
    public static Personnel loginPer;                       //Personnel login instance object container

    public static People loginPeo;                          //Personnel login instance object container

    public static Personnel perToUpdate;                    //Used to Update the Personnel Variables.

    public static People peoToUpdate;                       //Used to Update the People Variables.

    public static User userToDelete;                        //Used to Delete both people and personnel variable and can be used to delete new future user types as well.

    public static User userToSearch;                        //Used to Search both people and personnel variable and can be used to delete new future user types as well.

    public static String functionL1;
    public static String functionL2;
    public static String access;

    public static void main(String[] args) {
        DataIO.readPersonnel();

        DataIO.readPeople();

        VaccineInventoryIO.read();
        ScheduleIO.read();
        AppointmentIO.read();

    }
}
