
package WindowCleaningService;


public class Vehicle
{
    
    private String VehicleID;
    private VehicleType viechleType;

    public Vehicle(String VehicleID, VehicleType viechleType) {
        this.VehicleID = VehicleID;
        this.viechleType = viechleType;
    }

    public String getVehicleID() {
        return VehicleID;
    }

    public void setVehicleID(String VehicleID) {
        this.VehicleID = VehicleID;
    }

    public VehicleType getViechleType() {
        return viechleType;
    }

    public void setViechleType(VehicleType viechleType) {
        this.viechleType = viechleType;
    }
 
}
