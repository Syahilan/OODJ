/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

//IMPORT LIST;
import java.util.ArrayList;

public class People {
    
    // Private People Attributes
    private String name;
    private String password;
    
    //Auto-increment array
    private ArrayList<People> myPeople = new ArrayList<People>();
    
    
    public People(String name, String password) {
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

    public ArrayList<People> getMyBooking() {
        return myPeople;
    }

    public void setMyBooking(ArrayList<People> myPeople) {
        this.myPeople = myPeople;
    }
    
}