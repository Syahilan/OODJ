/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
// SPECIAL NOTE: THIS USER CLASS is the SUPER CLASS FOR PEOPLE & PERSONNEL SUBCLASSES
// OO Principle Demonstration: Inheritence
// This user class will contain methods that are the same for the People and Personnel Sub-class
package assignmentoodj;

public class User {

    private int systemNo;           // System Identification number will auto-increment from 40001 for People
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private int age;
    private String gender;
    private String phone;
    private String email;
    private String addressln1;
    private String addressln2;
    private String citizenStat;
    private String identityTxt;

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

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddressln1() {
        return addressln1;
    }

    public String getAddressln2() {
        return addressln2;
    }

    public String getCitizenStat() {
        return citizenStat;
    }

    public String getIdentityTxt() {
        return identityTxt;
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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddressln1(String addressln1) {
        this.addressln1 = addressln1;
    }

    public void setAddressln2(String addressln2) {
        this.addressln2 = addressln2;
    }

    public void setCitizenStat(String citizenStat) {
        this.citizenStat = citizenStat;
    }

    public void setIdentityTxt(String identityTxt) {
        this.identityTxt = identityTxt;
    }
    // </editor-fold> 

}
