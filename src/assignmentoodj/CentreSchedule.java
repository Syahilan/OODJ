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
public class CentreSchedule extends Schedule {

    private int sId;
    private int quantity;

    public CentreSchedule(int sId, String centre, String date, String startTime, String endTime, String vacName, int quantity) {
        super(centre, date, startTime, endTime, vacName);
        this.sId = sId;
        this.quantity = quantity;
    }

    public CentreSchedule(int sId, String startTime, String endTime, int quantity) {
        super("", "", startTime, endTime, "");
        this.sId = sId;
        this.quantity = quantity;
    }

    public int getsId() {
        return sId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private static int searchScheduleRecord(int schId) {
        for (int i = 0; i < ScheduleIO.allSchedules.size(); i++) {
            CentreSchedule s = ScheduleIO.allSchedules.get(i);
            if (s.getsId() == schId) {
                return i;
            }
        }
        return -1;
    }

    public static void updateScheduleRecord(CentreSchedule sch) {
        int schInd = searchScheduleRecord(sch.getsId());
        CentreSchedule s = ScheduleIO.allSchedules.get(schInd);
        s.setStartTime(sch.getStartTime());
        s.setEndTime(sch.getEndTime());
        s.setQuantity(sch.getQuantity());
        ScheduleIO.allSchedules.set(schInd, s);
    }
}
