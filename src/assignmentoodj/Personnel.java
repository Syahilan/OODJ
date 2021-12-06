/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

//Personnel Class is a subclass of User
//IMPORT LIST;
import java.util.ArrayList;
import java.util.Date;

public class Personnel extends User {

    // Private Personnel Attributes
    private int systemNo;           // System Identification number will auto-increment from 30001 for People
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private int age;
    private String gender;
    private Date startDate;
    private String phone;
    private String email;

    //Auto-increment array
    private ArrayList<Personnel> myPersonnel = new ArrayList<Personnel>();

    //Constructor
    public Personnel(int systemNo, String username, String password, String firstname, String lastname, int age, String gender, Date startDate, String phone, String email) {
        this.systemNo = systemNo;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.startDate = startDate;
        this.phone = phone;
        this.email = email;
    }

    //Getters
    // <editor-fold defaultstate="collapsed" desc="Getters">
    public int getSystemNo() {
        return systemNo;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Date getStartDate() {
        return startDate;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Personnel> getMyPersonnel() {
        return myPersonnel;
    }
    // </editor-fold> 

    //Setters
    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setSystemNo(int systemNo) {
        this.systemNo = systemNo;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMyPersonnel(ArrayList<Personnel> myPersonnel) {
        this.myPersonnel = myPersonnel;
    }
    // </editor-fold> 

}
