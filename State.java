
package WindowCleaningService;


public class State {
    private int value;
    public static final State NEW= new State (0);
    public static final State ACTIVE = new State(1);
    public static final State COMPLETED = new State(2);
    
    
    public State(int x)
    {
        value = x;
    }
    
    public boolean equals(Object objectIn)
    {
    State v =  (State) objectIn;
    return value == v.value;
    }
    
    public String toString()
    {
    switch (value)
    {
    case 0: return "NEW";
    case 1: return "ACTIVE";
    case 2: return "COMPLETED ";
    default: return "NOTHING";
   
    }       
    }
    

    
    
}
