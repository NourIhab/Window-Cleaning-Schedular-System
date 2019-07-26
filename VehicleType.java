
package WindowCleaningService;


public class VehicleType {
    
    private int value;
    public static final VehicleType CAR= new VehicleType (0);
    public static final VehicleType TRUCK = new VehicleType(1);
   
    
    
    public VehicleType(int x)
    {
        value = x;
    }
    
    public boolean equals(Object objectIn)
    {
    VehicleType v =  (VehicleType) objectIn;
    return value == v.value;
    }
    
    public String toString()
    {
    switch (value)
    {
    case 0: return "CAR";
    case 1: return "TRUCK";
    default: return "NOTHING";
   
    }       
    }

}
