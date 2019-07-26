
package WindowCleaningService;


public class JobType
{
    private int value;
    public static final JobType BUCKET_LADDER= new JobType (0);
    public static final JobType HOIST = new JobType(1);
    public static final JobType BOTH = new JobType(2);
    public JobType(int x)
    {
        value = x;
    }
    public boolean equals(Object objectIn)
    {
    JobType v =  (JobType) objectIn;
    return value == v.value;
    }
    
    public String toString()
    {
    switch (value)
    {
    case 0: return "BUCKET_LADDER";
    case 1: return "HOIST";
    case 2: return "BOTH";
    default: return "NOTHING";
   
    }       
    }
    
}
