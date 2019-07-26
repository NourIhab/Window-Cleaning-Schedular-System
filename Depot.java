
package WindowCleaningService;


public class Depot {
    private String Adress;
    private final Vehicle viehles;
    private final Equipment equipments;

    public Depot(String Adress, Vehicle viehles, Equipment equipments) {
        this.Adress = Adress;
        this.viehles = viehles;
        this.equipments = equipments;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }
   
	
}
