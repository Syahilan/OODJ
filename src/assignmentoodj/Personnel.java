/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

//IMPORT LIST;
import java.util.ArrayList;

public class Personnel {
    
    // Private Personnel Attributes
    private String name;
    private String password;
    
    
    //Auto-increment array
    private ArrayList<Personnel> myPersonnel = new ArrayList<Personnel>();
    
    
    public Personnel(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Personnel> getMyBooking() {
        return myPersonnel;
    }

    public void setMyBooking(ArrayList<Personnel> myPersonnel) {
        this.myPersonnel = myPersonnel;
    }
    
    
}
