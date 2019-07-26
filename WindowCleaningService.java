/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WindowCleaningService;


/**
 *
 * @author Shehab
 */
public class WindowCleaningService implements InvariantCheck{

     private VDMSet Cleaners;
     private VDMSet Technicians;
     private VDMSet Driver;
     private VDMSet hoistTeam;
    private VDMSet HoistTeam;
    private VDMSet OnJob;
    private VDMSet ActiveHoistTeam;
    private VDMSet ActiveBucketLadderTeam;
    
    private VDMSequence NewJobs;
    private VDMSequence AcceptedJobs;
    private VDMSequence OverScheduleJobs;
    private VDMSequence ActiveJobs;
    private VDMSequence CompletedJobs;
    private VDMSequence HigherCostJobs;
    
    private VDMSet AvailableHoistTeam;
    private VDMSet AvailableBucketLadderTeam ;
    private VDMSet OnDutyBucketLadderTeam;
     private VDMSet AvaliableVechile;
    private VDMSet AvaliableEquipment;
    
    
    private VDMSet Locations;
    private VDMSet Buildings;
    private VDMSet Vehicles;
    private VDMSet Equipments;
    private VDMMap HoistTeamToJob;
    private VDMMap BucketTeamToJob;
    private VDMMap LocationsToActiveHoistTeam;
    private VDMMap LocationsToActiveBucketLadderTeam;
    private VDMMap VehiclesToJob;
    private VDMMap  EquipmentToJob;
    
    public static final int HoistTeamLimit = 4;
    public static final int BucketLadderLimit = 2;
    public static final int jobDeadline = 60;
    
    
    
    
    
      Equipment equipment1= new Equipment("55",EquipmentType.BUCKET);
      Equipment equipment2= new Equipment("12",EquipmentType.LADDER);
       Equipment equipment3= new Equipment("13",EquipmentType.BUCKET);
        Equipment equipment4= new Equipment("52",EquipmentType.LADDER);
         Equipment equipment5= new Equipment("18",EquipmentType.BUCKET);
          Equipment equipment6= new Equipment("73",EquipmentType.LADDER);
          Equipment equipment7= new Equipment("23",EquipmentType.BUCKET);
          Equipment equipment8= new Equipment("94",EquipmentType.LADDER);
          Equipment equipment9= new Equipment("17",EquipmentType.BUCKET);
          Equipment equipment10= new Equipment("19",EquipmentType.LADDER);
          Equipment equipment11= new Equipment("18",EquipmentType.HOIST);
          
          Vehicle vehicle1= new Vehicle("g6",VehicleType.CAR);
         Vehicle vehicle2 =new Vehicle("y7",VehicleType.TRUCK);
  
  
	
	
    
    @Override
    public boolean inv() {
        
        VDMSet test= new VDMSet();
        
        if(Cleaners.card()>0
                &&Technicians.card() >0
                && Driver.card()>0
                &&hoistTeam.card()>0
                &&HoistTeam.card() >0
                &&OnJob.card() >0
                &&ActiveHoistTeam.card() >0
                &&ActiveBucketLadderTeam.card() >0
                &&NewJobs.inds().card()>0
                &&AcceptedJobs.inds().card()>0
                &&OverScheduleJobs.inds().card()>0
                && ActiveJobs.inds().card()>0
                &&CompletedJobs.inds().card()>0
                &&HigherCostJobs.inds().card()>0
                &&AvailableHoistTeam.card() >0
                &&AvailableBucketLadderTeam.card() >0
                && OnDutyBucketLadderTeam.card() >0
                &&AvaliableVechile.card() >0
                &&AvaliableEquipment.card() >0
                &&Locations.card() >0
                &&Buildings.card() >0
                &&Vehicles.card() >0
                &&Equipments.card() >0
                && HoistTeamToJob.dom().card()>0
                && BucketTeamToJob .dom().card()>0
                && LocationsToActiveHoistTeam .dom().card()>0
                && LocationsToActiveBucketLadderTeam .dom().card()>0
                && VehiclesToJob .dom().card()>0
                &&  EquipmentToJob.dom().card()>0
   
                )
        {
    return true;
    }
    else {
    return false;
}
        
       // return true;
    }
    public WindowCleaningService(VDMSet nCleaners,VDMSet nDriver,VDMSet nHoistTeam,VDMSet nhoistTeam,VDMSet nOnJob,VDMSet nActiveHoistTeam,VDMSet nActiveBucketLadderTeam,VDMSet nOnDutyBucketLadderTeam,VDMSet nAvailableBucketLadderTeam,VDMSet nAvailableHoistTeam
    ,VDMSequence nNewJobs,VDMSequence nAcceptedJobs,VDMSequence nOverScheduleJobs,VDMSequence nActiveJobs,VDMSequence nCompletedJobs,VDMSequence nHigherCostJobs
    ,VDMSet nAvaliableVechile,VDMSet nAvaliableEquipment,VDMSet nLocations,VDMSet nBuildings, VDMSet nVehicles,VDMSet nEquipments,VDMMap nHoistTeamToJob,VDMMap nLocationsToActiveHoistTeam
    ,VDMMap nLocationsToActiveBucketLadderTeam,VDMMap nVehiclesToJob,VDMMap nEquipmentToJob,VDMMap nBucketTeamToJob)
    {
        Cleaners =nCleaners;
        Driver =nDriver;
        HoistTeam =nHoistTeam;
        hoistTeam =nhoistTeam;
        OnJob =nOnJob;
        ActiveHoistTeam =nActiveHoistTeam;
        ActiveBucketLadderTeam =nActiveBucketLadderTeam;
       
        OnDutyBucketLadderTeam =nOnDutyBucketLadderTeam;
        AvailableBucketLadderTeam  =nAvailableBucketLadderTeam;
        AvailableHoistTeam =nAvailableHoistTeam;
        
        NewJobs =nNewJobs;
        AcceptedJobs =nAcceptedJobs;
        OverScheduleJobs =nOverScheduleJobs;
        ActiveJobs =nActiveJobs;
        CompletedJobs = nCompletedJobs;
        HigherCostJobs = nHigherCostJobs;
        
        AvaliableVechile = nAvaliableVechile;
        AvaliableEquipment = nAvaliableEquipment;
        
        Locations= nLocations;
        Buildings = nBuildings;
        Vehicles = nVehicles;
        Equipments = nEquipments;
        
        
        HoistTeamToJob = nHoistTeamToJob;
        LocationsToActiveHoistTeam= nLocationsToActiveHoistTeam;
        LocationsToActiveBucketLadderTeam= nLocationsToActiveBucketLadderTeam;
        VehiclesToJob = nVehiclesToJob;
        EquipmentToJob= nEquipmentToJob;
        BucketTeamToJob = nBucketTeamToJob; 
    
    VDM.invTest(this);
    }
    
     public boolean AllocateHoisttoJob (Job AcceptedJob){
         JobType bucketladder =new JobType(0);
         Maplet m = new Maplet(hoistTeam , AcceptedJob);
         VDMMap temp = new VDMMap(m);
        
         try{
         VDM.preTest(
         HoistTeamToJob.getRangeElements().equals(AcceptedJob)==false
         && AcceptedJobs.elems().contains(AcceptedJob)==true
         && AcceptedJob.getJobtype()==bucketladder
         && hoistTeam.card()<=2
         && ActiveHoistTeam.contains(hoistTeam)//{
         );
          HoistTeamToJob.equals(HoistTeamToJob.union(temp));   
          AvailableBucketLadderTeam.equals(AvailableBucketLadderTeam.difference(hoistTeam));   
          ActiveBucketLadderTeam = ActiveBucketLadderTeam.union(hoistTeam);
          AcceptedJob.setJobstate(State.ACTIVE);
        
         VDM.invTest(this);

          return true;
          
         }
          
         catch(Exception E)
        {return false;} 
}

     public boolean DeallocateBucketTeam(Job job)
{
try{
  VDM.preTest(job.getJobstate().equals(State.COMPLETED) && BucketTeamToJob.rng().contains(job));
  {
  BucketTeamToJob = BucketTeamToJob.domDelete(new VDMSet(job.team));
  
  AvailableBucketLadderTeam.union(new VDMSet(job.team));
  OnDutyBucketLadderTeam.difference(new VDMSet(job.team));
  System.out.println("Deallocated");
   
  }
    
            VDM.invTest(this);
return true;
}
 catch (Exception E)
        {return false;} 

}


     
     public void ChangeJobPriority(Job job,int todayDay,int todayMonth,int todayYear){
         /*
            VDM.preTest(Math.abs(job.getStartDate().getDay()-todayDay)+Math.abs(job.getStartDate().getMonth()-todayMonth)*30+Math.abs(job.getStartDate().getYear()-todayYear)*30*12-jobDeadline<10
                    ||  Math.abs(job.getStartDate().getDay()-todayDay)+Math.abs(job.getStartDate().getMonth()-todayMonth)*30+Math.abs(job.getStartDate().getYear()-todayYear)*30*12-jobDeadline<5
                    ||  Math.abs(job.getStartDate().getDay()-todayDay)+Math.abs(job.getStartDate().getMonth()-todayMonth)*30+Math.abs(job.getStartDate().getYear()-todayYear)*30*12-jobDeadline>10);
                   */ 
            if(Math.abs(job.getStartDate().getDay()-todayDay)+Math.abs(job.getStartDate().getMonth()-todayMonth)*30+Math.abs(job.getStartDate().getYear()-todayYear)*12*30-jobDeadline<10){
            job.setPriority(Priority.MEDUIM);
            System.out.println("priority changed medium");
            }
            else if(Math.abs(job.getStartDate().getDay()-todayDay)+Math.abs(job.getStartDate().getMonth()-todayMonth)*30+Math.abs(job.getStartDate().getYear()-todayYear)*12*30-jobDeadline<5){
            job.setPriority(Priority.HIGH);
            System.out.println("priority changed high");

            }
            else if(Math.abs(job.getStartDate().getDay()-todayDay)+Math.abs(job.getStartDate().getMonth()-todayMonth)*30+Math.abs(job.getStartDate().getYear()-todayYear)*12*30-jobDeadline>10){
            job.setPriority(Priority.LOW);
                        System.out.println("priority changed low");

            }
             //VDM.postTest(job.setPriority(low));
             //System.out.println(Math.abs(job.getStartDate().getDay()-todayDay));
             //System.out.println(Math.abs(job.getStartDate().getMonth()-todayMonth));
             //System.out.println(Math.abs(job.getStartDate().getYear()-todayYear));
             VDM.invTest(this);
     }
     
    public boolean AllocateBucketTeamtoJob (Job AcceptedJob){
         Maplet m = new Maplet(hoistTeam , AcceptedJob);
         VDMMap temp = new VDMMap(m);
         try
         {VDM.preTest(
         HoistTeamToJob.getRangeElements().equals(AcceptedJob)==false
         && AcceptedJobs.elems().contains(AcceptedJob)==true
         && AcceptedJob.getJobtype()==JobType.BUCKET_LADDER
         && hoistTeam.card()<=2
         && AvailableBucketLadderTeam .contains(hoistTeam)//{
         );
         
          HoistTeamToJob.equals(HoistTeamToJob.union(temp));   
          AvailableBucketLadderTeam.equals(AvailableBucketLadderTeam.difference(hoistTeam));   
          ActiveBucketLadderTeam = ActiveBucketLadderTeam.union(hoistTeam);
          AcceptedJob.setJobstate(State.ACTIVE);
                   VDM.invTest(this);

          return true;
          
         }
         catch(Exception E)
        {return false;} 

}
     
      public boolean DeallocateHoistTeam( Job j){
 
 try{
 VDM.preTest(HoistTeamToJob.rng().contains(j)&& j.getJobstate().equals(State.COMPLETED));   // pre CompletedJob in set rng HoistTeamToJob and CompletedJob.JobState = <COMPLETED>
 
HoistTeamToJob= HoistTeamToJob.domDelete(CompletedJobs.elems());
ActiveHoistTeam.equals(ActiveHoistTeam.difference(HoistTeam));
HoistTeam. equals(HoistTeam.union(AvailableHoistTeam));
 // (ext wr condition) to help ensure that the method preserves the invariant
 return true;
 }
 catch(Exception E)
        {return false;} 
}
       public  boolean AllocateVechileAndEquipments (Job AcceptedJob){
        
         Maplet m = new Maplet(Vehicles , AcceptedJob);
         Maplet m2 = new Maplet(Equipments , AcceptedJob);
         VDMMap temp = new VDMMap(m);
         VDMMap temp2 = new VDMMap(m2);
      
         
         try{
         
         if ( 
                    VehiclesToJob.getRangeElements().equals(AcceptedJob)==false      
                  && EquipmentToJob.getRangeElements().equals(AcceptedJob)==false
                   && AcceptedJobs.elems().contains(AcceptedJob)==true
                   && AcceptedJob.getJobtype()==JobType.BUCKET_LADDER
                   && AcceptedJob.getBuildinginfo().getNumberOfWindows()<=20 
                    && AcceptedJob.getBuildinginfo().getNumberofStoryes()<=2
                   && AvaliableVechile .contains(Vehicles)
                    && AvaliableEquipment.contains(Equipments)
                 )
         {
               AcceptedJob.setEquipments(equipment1);
                 AcceptedJob.setEquipments(equipment3);
                  AcceptedJob.setEquipments(equipment2);
                   AcceptedJob.setEquipments(equipment4);
                 AcceptedJob.setVechiles(vehicle1);
                
         }
         

         else if (
                  VehiclesToJob.getRangeElements().equals(AcceptedJob)==false      
                  && EquipmentToJob.getRangeElements().equals(AcceptedJob)==false
                   && AcceptedJobs.elems().contains(AcceptedJob)==true
                   && AcceptedJob.getJobtype()==JobType.HOIST
                   && AcceptedJob.getBuildinginfo().getNumberOfWindows()>20 
                    && AcceptedJob.getBuildinginfo().getNumberofStoryes()>2
                   && AvaliableVechile .contains(Vehicles)
                    && AvaliableEquipment.contains(Equipments)

                 ) 
         {
                     AcceptedJob.setEquipments(equipment5);
                 AcceptedJob.setEquipments(equipment7);
                  AcceptedJob.setEquipments(equipment9);
                   AcceptedJob.setEquipments(equipment1);
                    AcceptedJob.setEquipments(equipment11);
                 AcceptedJob.setVechiles(vehicle2);
                
         }
                  VDM.invTest(this);

         return true;
         }
          catch(Exception E)
        {return false;} 
     }
         
         public boolean  DeallocateVechilesAndEquipments(Job CompletedJob){
             try{
                 
            if(
                    VehiclesToJob.getRangeElements().equals(CompletedJob)
                    
         && CompletedJob.getJobstate()==State.COMPLETED
                    
             
             )
  {
        VehiclesToJob.domDelete(CompletedJobs.elems());
         AvaliableVechile.equals(AvaliableVechile.difference(Vehicles));
        
         }
            else if (  EquipmentToJob.getRangeElements().equals(CompletedJob)
                    && CompletedJob.getJobstate()==State.COMPLETED
                    )
            {  VehiclesToJob.domDelete(CompletedJobs.elems());
         AvaliableVechile.equals(AvaliableVechile.difference(Vehicles));
         
  
         }  
          
        
                      VDM.invTest(this);

             return true;
         }
              catch(Exception E)
        {return false;} 
             
             
         }

         
    public WindowCleaningService() {
    }
         
    
}