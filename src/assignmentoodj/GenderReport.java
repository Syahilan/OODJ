/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

import java.util.ArrayList;

public class GenderReport {
    
    private String gender;
    private String vacStatus;
    private int count;

    public GenderReport(String gender, String vacStatus, int count) {
        this.gender = gender;
        this.vacStatus = vacStatus;
        this.count = count;
    }
    
    public static ArrayList<GenderReport> allGenderReport = new ArrayList<GenderReport>();

    public String getGender() {
        return gender;
    }

    public String getVacStatus() {
        return vacStatus;
    }

    public int getCount() {
        return count;
    }

    public static ArrayList<GenderReport> getAllGenderReport() {
        return allGenderReport;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setVacStatus(String vacStatus) {
        this.vacStatus = vacStatus;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static void setAllGenderReport(ArrayList<GenderReport> allGenderReport) {
        GenderReport.allGenderReport = allGenderReport;
    }
    
    public static void init(){
        GenderReport rg1 = new GenderReport("Male", "Vaccinated", 0);
        GenderReport rg2 = new GenderReport("Male", "Unvaccinated", 0);
        GenderReport rg3 = new GenderReport("Female", "Vaccinated", 0);
        GenderReport rg4 = new GenderReport("Male", "Unvaccinated", 0);
        
        allGenderReport.add(rg1);
        allGenderReport.add(rg2);
        allGenderReport.add(rg3);
        allGenderReport.add(rg4);
        
    }
    
    public static void processGenderReport() {
        String vacStatus;
        int genderCount = 0;
        GenderReport.init();
        
        
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();
        appointments = AppointmentIO.allAppointments;
        
        People peopleDetails;
        
        for (int i = 0; i < appointments.size(); i++){
            peopleDetails = DataIO.checkPeople("", "", "", appointments.get(i).getNIC());
            if (peopleDetails != null) {
                
                String genderX = peopleDetails.getGender();
                //int age = peopleDetails.getAge();
                
                if (appointments.get(i).getStatus().equals("")) {
                    vacStatus = "Unvaccinated";
                } else {
                    vacStatus = "Vaccinated";
                }
                for (int k = 0; k < allGenderReport.size(); k++) {
                    
                    if(allGenderReport.get(k).getGender().equals(genderX) && allGenderReport.get(k).getVacStatus().equals(vacStatus)){
                        genderCount = allGenderReport.get(k).getCount();
                        allGenderReport.get(k).setCount(genderCount + 1);
                        break;
                    } 
                    
                }
            }
            
            
        
        
        }
        
    }
    
    
    
}
