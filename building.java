
package WindowCleaningService;



public class building {
    private String BuildingID;
    private String Location;
    private int NumberOfWindows ;
    private int NumberofStoryes ;
    private BuildingType BuildingType;
    private double Cost;
    private double ClientPayment;

    public building() {
    }

    public building(String BuildingID, String Location, int NumberOfWindows, int NumberofStoryes, BuildingType BuildingType, double Cost, double ClientPayment) {
        this.BuildingID = BuildingID;
        this.Location = Location;
        this.NumberOfWindows = NumberOfWindows;
        this.NumberofStoryes = NumberofStoryes;
        this.BuildingType = BuildingType;
        this.Cost = Cost;
        this.ClientPayment = ClientPayment;
    }

    public String getBuildingID() {
        return BuildingID;
    }

    public void setBuildingID(String BuildingID) {
        this.BuildingID = BuildingID;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getNumberOfWindows() {
        return NumberOfWindows;
    }

    public void setNumberOfWindows(int NumberOfWindows) {
        this.NumberOfWindows = NumberOfWindows;
    }

    public int getNumberofStoryes() {
        return NumberofStoryes;
    }

    public void setNumberofStoryes(int NumberofStoryes) {
        this.NumberofStoryes = NumberofStoryes;
    }

    public BuildingType getBuildingType() {
        return BuildingType;
    }

    public void setBuildingType(BuildingType BuildingType) {
        this.BuildingType = BuildingType;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double Cost) {
        this.Cost = Cost;
    }

    public double getClientPayment() {
        return ClientPayment;
    }

    public void setClientPayment(double ClientPayment) {
        this.ClientPayment = ClientPayment;
    }


    
}
