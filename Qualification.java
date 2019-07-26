
package WindowCleaningService;


public class Qualification {
    private int value;
    public static final Qualification CLEANER= new Qualification(0);
    public static final Qualification CLEANER_TECH = new Qualification(1);
    public static final Qualification CLEANER_TECH_DRIVER = new Qualification(2);
    public static final Qualification CLEANER_DRIVER = new Qualification(3);
    
    
    private Qualification(int x)
    {
        value = x;
    }
    
    public boolean equals(Object objectIn)
    {
    Qualification v =  (Qualification) objectIn;
    return value == v.value;
    }
    
    public String toString()
    {
    switch (value)
    {
    case 0: return "CLEANER";
    case 1: return "CLEANER_TECH";
    case 2: return "CLEANER_TECH_DRIVER";
    case 3: return "CLEANER_DRIVER";
    default: return "NOTHING";
   
    }  
    }
}
