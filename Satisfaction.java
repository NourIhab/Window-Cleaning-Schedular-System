
package WindowCleaningService;


public class Satisfaction {
    private int value;
    public static final Satisfaction GOOD= new Satisfaction(0);
    public static final Satisfaction VERYGOOD = new Satisfaction(1);
    public static final Satisfaction BAD= new Satisfaction(2);
    public static final Satisfaction VERYBAD= new Satisfaction(3);
     
    private Satisfaction(int x)
    {
        value = x;
    }
    
    public boolean equals(Object objectIn)
    {
    Satisfaction v =  (Satisfaction) objectIn;
    return value == v.value;
    }
    
    public String toString()
    {
    switch (value)
    {
    case 0: return "GOOD";
    case 1: return "VERYGOOD";
    case 2: return "BAD ";
    case 3: return "VERYBAD "; 
    default: return "NOTHING";
   
    }       
    }

    
}
