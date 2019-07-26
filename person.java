
package WindowCleaningService;

public class person {
   private String ID;
   private String tempID;
   private String Name;
   private Qualification qualifications;

    public person() {
    }

    public person(String ID, String tempID, String Name, Qualification qualifications) {
        this.ID = ID;
        this.tempID = tempID;
        this.Name = Name;
        this.qualifications = qualifications;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTempID() {
        return tempID;
    }

    public void setTempID(String tempID) {
        this.tempID = tempID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Qualification getQualifications() {
        return qualifications;
    }

    public void setQualifications(Qualification qualifications) {
        this.qualifications = qualifications;
    }
   
   
     
}

    

    

