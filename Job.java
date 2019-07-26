
package WindowCleaningService;


public class Job {

    /**
     *
     */
    private final String jobID;
    private String Ref_JobLocation; 
    private String Ref_BuildingID;
    private boolean CompleteWithinTime;
    private Priority priority;
    private boolean JobCompleted;
    private final JobType jobtype;
    private  State jobstate;
    private  Vehicle vechiles;
    private Date StartDate;
    private Date FinishDate;
     private int ExpectedDuration;
     private int RequestedDuration;
     private  Equipment equipments;
     private final Satisfaction satisfaction;
     private final building buildinginfo;
    public final VDMSet team;

    public Job(String jobID, String Ref_JobLocation, String Ref_BuildingID, boolean CompleteWithinTime, Priority priority, boolean JobCompleted, JobType jobtype, State jobstate, Vehicle vechiles, Date StartDate, Date FinishDate, int ExpectedDuration, int RequestedDuration, Equipment equipments, Satisfaction satisfaction, building buildinginfo,VDMSet team) {
        this.jobID = jobID;
        this.Ref_JobLocation = Ref_JobLocation;
        this.Ref_BuildingID = Ref_BuildingID;
        this.CompleteWithinTime = CompleteWithinTime;
        this.priority = priority;
        this.JobCompleted = JobCompleted;
        this.jobtype = jobtype;
        this.jobstate = jobstate;
        this.vechiles = vechiles;
        this.StartDate = StartDate;
        this.FinishDate = FinishDate;
        this.ExpectedDuration = ExpectedDuration;
        this.RequestedDuration = RequestedDuration;
        this.equipments = equipments;
        this.satisfaction = satisfaction;
        this.buildinginfo = buildinginfo;
        this.team = team;
    }

    public Job(String jobID, boolean CompleteWithinTime, Priority priority, boolean JobCompleted, JobType jobtype, State jobstate, Vehicle vechiles, Date StartDate, Date FinishDate, int ExpectedDuration, int RequestedDuration, Equipment equipments, Satisfaction satisfaction, building buildinginfo, VDMSet team) {
        this.jobID = jobID;
        this.CompleteWithinTime = CompleteWithinTime;
        this.priority = priority;
        this.JobCompleted = JobCompleted;
        this.jobtype = jobtype;
        this.jobstate = jobstate;
        this.vechiles = vechiles;
        this.StartDate = StartDate;
        this.FinishDate = FinishDate;
        this.ExpectedDuration = ExpectedDuration;
        this.RequestedDuration = RequestedDuration;
        this.equipments = equipments;
        this.satisfaction = satisfaction;
        this.buildinginfo = buildinginfo;
        this.team = team;
    }

   
    public void setVechiles(Vehicle vechiles) {
        this.vechiles = vechiles;
    }

    public void setEquipments(Equipment equipments) {
        this.equipments = equipments;
    }

    public String getRef_JobLocation() {
        return Ref_JobLocation;
    }

    public void setRef_JobLocation(String Ref_JobLocation) {
        this.Ref_JobLocation = Ref_JobLocation;
    }

    public String getRef_BuildingID() {
        return Ref_BuildingID;
    }

    public void setRef_BuildingID(String Ref_BuildingID) {
        this.Ref_BuildingID = Ref_BuildingID;
    }

    public boolean isCompleteWithinTime() {
        return CompleteWithinTime;
    }

    public void setCompleteWithinTime(boolean CompleteWithinTime) {
        this.CompleteWithinTime = CompleteWithinTime;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public boolean isJobCompleted() {
        return JobCompleted;
    }

    public void setJobCompleted(boolean JobCompleted) {
        this.JobCompleted = JobCompleted;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    public Date getFinishDate() {
        return FinishDate;
    }

    public void setFinishDate(Date FinishDate) {
        this.FinishDate = FinishDate;
    }

    public int getExpectedDuration() {
        return ExpectedDuration;
    }

    public void setExpectedDuration(int ExpectedDuration) {
        this.ExpectedDuration = ExpectedDuration;
    }

    public int getRequestedDuration() {
        return RequestedDuration;
    }

    public void setRequestedDuration(int RequestedDuration) {
        this.RequestedDuration = RequestedDuration;
    }

    public String getJobID() {
        return jobID;
    }

    public JobType getJobtype() {
        return jobtype;
    }

    public State getJobstate() {
        return jobstate;
    }

    public Vehicle getVechiles() {
        return vechiles;
    }

    public Equipment getEquipments() {
        return equipments;
    }

    public Satisfaction getSatisfaction() {
        return satisfaction;
    }

    public building getBuildinginfo() {
        return buildinginfo;
    }

    public void setJobstate(State jobstate) {
        this.jobstate = jobstate;
    }

    public VDMSet getTeam() {
        return team;
    }
    
	
  
}
