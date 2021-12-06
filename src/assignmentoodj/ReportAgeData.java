/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentoodj;

import java.util.ArrayList;

/**
 *
 * @author Darshini
 */
public class ReportAgeData {
        private int ageMin;
    private int ageMax;
    private String vacStatus;
    private int count;

    public ReportAgeData(int ageMin, int ageMax, String vacStatus, int count) {
        this.ageMin = ageMin;
        this.ageMax = ageMax;
        this.vacStatus = vacStatus;
        this.count = count;
    }

    public static ArrayList<ReportAgeData> allAgeReport
            = new ArrayList<ReportAgeData>();

    public int getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(int ageMin) {
        this.ageMin = ageMin;
    }

    public int getAgeMax() {
        return ageMax;
    }

    public void setAgeMax(int ageMax) {
        this.ageMax = ageMax;
    }

    public String getVacStatus() {
        return vacStatus;
    }

    public void setVacStatus(String vacStatus) {
        this.vacStatus = vacStatus;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static void init() {
        ReportAgeData rd1 = new ReportAgeData(18, 30, "Vaccinated", 0);
        ReportAgeData rd2 = new ReportAgeData(18, 30, "Unvaccinated", 0);
        ReportAgeData rd3 = new ReportAgeData(31, 40, "Vaccinated", 0);
        ReportAgeData rd4 = new ReportAgeData(31, 40, "Unvaccinated", 0);
        ReportAgeData rd5 = new ReportAgeData(41, 50, "Vaccinated", 0);
        ReportAgeData rd6 = new ReportAgeData(41, 50, "Unvaccinated", 0);
        ReportAgeData rd7 = new ReportAgeData(51, 60, "Vaccinated", 0);
        ReportAgeData rd8 = new ReportAgeData(51, 60, "Unvaccinated", 0);
        ReportAgeData rd9 = new ReportAgeData(61, 70, "Vaccinated", 0);
        ReportAgeData rd10 = new ReportAgeData(61, 70, "Unvaccinated", 0);
        ReportAgeData rd11 = new ReportAgeData(71, 80, "Vaccinated", 0);
        ReportAgeData rd12 = new ReportAgeData(71, 80, "Unvaccinated", 0);
        ReportAgeData rd13 = new ReportAgeData(81, 90, "Vaccinated", 0);
        ReportAgeData rd14 = new ReportAgeData(81, 90, "Unvaccinated", 0);
        ReportAgeData rd15 = new ReportAgeData(91, 9999, "Vaccinated", 0);
        ReportAgeData rd16 = new ReportAgeData(91, 9999, "Unvaccinated", 0);

        allAgeReport.add(rd1);
        allAgeReport.add(rd2);
        allAgeReport.add(rd3);
        allAgeReport.add(rd4);
        allAgeReport.add(rd5);
        allAgeReport.add(rd6);
        allAgeReport.add(rd7);
        allAgeReport.add(rd8);
        allAgeReport.add(rd9);
        allAgeReport.add(rd10);
        allAgeReport.add(rd11);
        allAgeReport.add(rd12);
        allAgeReport.add(rd13);
        allAgeReport.add(rd14);
        allAgeReport.add(rd15);
        allAgeReport.add(rd16);

    }

    public static void processAgeReportDate() {
        String vacStatus;
        int ageCount = 0;
        ReportAgeData.init();

        ArrayList<Appointment> appointments = new ArrayList<Appointment>();
        appointments = AppointmentIO.allAppointments;

        People peopleDetails;

        for (int i = 0; i < appointments.size(); i++) {
            peopleDetails = DataIO.checkPeople("", "", "", appointments.get(i).getNIC());
            if (peopleDetails != null) {
                int age = peopleDetails.getAge();
                if (appointments.get(i).getStatus().equals("")) {
                    vacStatus = "Unvaccinated";
                } else {
                    vacStatus = "Vaccinated";
                }
                for (int k = 0; k < allAgeReport.size(); k++) {
                    if (age >= allAgeReport.get(k).getAgeMin()
                            && age <= allAgeReport.get(k).getAgeMax()
                            && allAgeReport.get(k).getVacStatus().equals(vacStatus)) {
                        ageCount = allAgeReport.get(k).getCount();
                        allAgeReport.get(k).setCount(ageCount + 1);
                        break;
                    }
                }
            }

        }
    }


}
