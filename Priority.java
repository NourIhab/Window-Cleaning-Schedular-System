
package WindowCleaningService;

public class Priority {
    private int value;
    public static final Priority LOW= new Priority(0);
    public static final Priority MEDUIM = new Priority(1);
    public static final Priority HIGH = new Priority(2);
    
    
    public Priority(int x)
    {
        value = x;
    }
    
    public boolean equals(Object objectIn)
    {
    Priority v =  (Priority) objectIn;
    return value == v.value;
    }
    
    public String toString()
    {
    switch (value)
    {
    case 0: return "LOW";
    case 1: return "MEDUIM";
    case 2: return "HIGH";
    default: return "NOTHING";
   
    }       
    }
    
}
