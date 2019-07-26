
package WindowCleaningService;


public class EquipmentType {
     private int value;
    public static final EquipmentType LADDER= new EquipmentType (0);
    public static final EquipmentType BUCKET = new EquipmentType (1);
   public static final EquipmentType HOIST = new EquipmentType (2);

    
    private EquipmentType(int x)
    {
        value = x;
    }
    
    public boolean equals(Object objectIn)
    {
    EquipmentType v =  (EquipmentType) objectIn;
    return value == v.value;
    }
    
    public String toString()
    {
    switch (value)
    {
    case 0: return "LADDER";
    case 1: return "BUCKET";
            case 2: return "HOIST";

    default: return "NOTHING";
   
    }       
    }

}
