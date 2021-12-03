/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentoodj;

/**
 *
 * @author Darshini
 */
public class Appointment extends Schedule {

    private int aId;
    private String NIC;
    private String lname;
    private String fname;

    public Appointment(int aId, String NIC, String lname, String fname, String centre, String date, String startTime, String endTime, String vacName) {
        super(centre, date, startTime, endTime, vacName);
        this.aId = aId;
        this.NIC = NIC;
        this.lname = lname;
        this.fname = fname;
    }

    public int getaId() {
        return aId;
    }

    public String getNIC() {
        return NIC;
    }

    public String getLname() {
        return lname;
    }

    public String getFname() {
        return fname;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
}
