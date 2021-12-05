/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

public class Main {
    
    public static StartMenu startMenu = new StartMenu();    //Call the Start Menu When program is launched
      
    // Object containers
    public static Personnel loginPer;                       //Personnel login instance object container
    
    public static People loginPeo;                          //Personnel login instance object container
    
    public static People userToUpdate;                        //Used to Update the People Variables.

    public static String functionL1;
    public static String functionL2;
    public static String access;
    
    public static void main(String[] args) {
        DataIO.readPersonnel();
        
        DataIO.readPeople();
        
        VaccineInventoryIO.read(); 
        
    }
}
