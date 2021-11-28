/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

public class Main {
    
    public static StartMenu startMenu = new StartMenu();    //Call the Start Menu When program is launched
    
    public static VacInventoryManagementPage vacMaintain = new VacInventoryManagementPage();
    
    public static CreateVacInventoryPage vacAdd = new CreateVacInventoryPage();
    
    
    // Object containers
    public static Personnel loginPer;                       //Personnel login instance object container
    
    public static People loginPeo;                          //Personnel login instance object container
     
    public static void main(String[] args) {
        DataIO.readPersonnel();
        
        DataIO.readPeople();
        
        VaccineInventoryIO.read(); 
        
    }
}
