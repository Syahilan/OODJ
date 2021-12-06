/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

public class Appointment extends Schedule {

    private int aId;
    private String NIC;
    private String lname;
    private String fname;
    private String status;

    public Appointment(int aId, String NIC, String lname, String fname,
            String centre, String date, String startTime, String endTime,
            String vacName, String status) {
        super(centre, date, startTime, endTime, vacName);
        this.aId = aId;
        this.NIC = NIC;
        this.lname = lname;
        this.fname = fname;
        this.status = status;
    }

    public Appointment() {
        super();
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private static int searchAppointmentRecord(int appmtId) {
        for (int i = 0; i < AppointmentIO.allAppointments.size(); i++) {
            Appointment appmt = AppointmentIO.allAppointments.get(i);
            if (appmt.getaId() == appmtId) {
                return i;
            }
        }
        return -1;
    }

    public static void updateAppointmentRecord(Appointment appmt) {
        int appmtInd = searchAppointmentRecord(appmt.getaId());
        Appointment a = AppointmentIO.allAppointments.get(appmtInd);
        // Update appointment
        a.setCentre(appmt.getCentre());
        a.setVacName(appmt.getVacName());
        a.setDate(appmt.getDate());
        a.setStartTime(appmt.getStartTime());
        a.setEndTime(appmt.getEndTime());
        a.setStatus(appmt.getStatus());
        AppointmentIO.allAppointments.set(appmtInd, a);
    }
}
