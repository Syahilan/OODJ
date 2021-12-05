/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentoodj;

import java.util.Date;

/**
 *
 * @author Darshini
 */
public class Schedule {
    private String centre;
    private String date;
    private String startTime;
    private String endTime;
    private String vacName;

    public Schedule() {
    }

    public Schedule(String centre, String date, String startTime,
            String endTime, String vacName) {
        this.centre = centre;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.vacName = vacName;
    }

    public String getCentre() {
        return centre;
    }

    public String getDate() {
        return date;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getVacName() {
        return vacName;
    }

    public Date getDateDate() {
        return Util.str2Date(date, "E, dd/MM/yyyy");
    }

    public void setCentre(String centre) {
        this.centre = centre;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setVacName(String vacName) {
        this.vacName = vacName;
    }


}
