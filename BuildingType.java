
package WindowCleaningService;


public class BuildingType {
    
    
    private int value;
    public static final BuildingType SMALL_VILLA= new BuildingType (0);
    public static final BuildingType LARGE_VILLA = new BuildingType(1);
    public static final BuildingType SINGLE_FLAT = new BuildingType(2);
    public static final BuildingType MULTI_STOREY_BLOCK = new BuildingType(3);
    public static final BuildingType SHOP_FRONT = new BuildingType(4);
    
    
    private BuildingType(int x)
    {
        value = x;
    }
    
    public boolean equals(Object objectIn)
    {
   BuildingType v =  (BuildingType) objectIn;
    return value == v.value;
    }
    
    public String toString()
    {
    switch (value)
    {
    case 0: return "SMALL_VILLA";
    case 1: return "LARGE_VILLA";
    case 2: return "SINGLE_FLAT";
    case 3: return  "MULTI_STOREY_BLOCK"; 
    case 4: return  "SHOP_FRONT"; 
    default: return "NOTHING";
   
    }       
    }
    
}
