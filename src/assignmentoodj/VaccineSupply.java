/*
 * This is proprietary code written by Syahilan A/L Selvarajoo [TP062031] & Darshini Dakshyani Beerachee [TP060519]
 * APD2F2109CS(DA) || CT038-3-2-OODJ-LAB-18
 */
package assignmentoodj;

public class VaccineSupply {

    private int id;
    private String centre;
    private String vacName;
    private int quantity;

    public VaccineSupply(int id, String vacCentre, String vacName, int quantity) {
        this.id = id;
        this.centre = vacCentre;
        this.vacName = vacName;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getCentre() {
        return centre;
    }

    public String getVacName() {
        return vacName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCentre(String centre) {
        this.centre = centre;
    }

    public void setVacName(String vacName) {
        this.vacName = vacName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}

