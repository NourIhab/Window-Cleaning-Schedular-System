/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WindowCleaningService;

import java.util.Scanner;


/**
 *
 * @author Shehab
 */
public class WindowCleaningServiceMain {
     public static void main(String args[]){
         person p1 = new person("d2", "b2", "shehab", Qualification.CLEANER);
     person p2 = new person("r2", "d2", "R2D2", Qualification.CLEANER_TECH_DRIVER);
     person p3 = new person("3c", "po", "3CPO", Qualification.CLEANER_DRIVER);
     person p4 = new person("619", "619", "rey mesterio", Qualification.CLEANER_TECH);
     person p5 = new person("1984", "1", "orwell", Qualification.CLEANER);
     
     building b1 = new building("3", "maadi", 25, 3, BuildingType.SMALL_VILLA,0,40);
     building b2 = new building("7", "tagamoa", 15, 0, BuildingType.SMALL_VILLA,0,50);
     building b3 = new building("15", "shorouk", 6, 1, BuildingType.SHOP_FRONT, 0,500);
      building b4 = new building("20", "maadi", 5, 1, BuildingType.SHOP_FRONT, 0, 0);
     building b5 = new building("30", "NasrCity", 10, 12, BuildingType.LARGE_VILLA, 0, 1000);
     
    
           Vehicle vehicle1= new Vehicle("g6",VehicleType.CAR);
         Vehicle vehicle2 =new Vehicle("y7",VehicleType.TRUCK);
         Vehicle vehicle3 =new Vehicle("y8",VehicleType.CAR);
           Vehicle vehicle4 =new Vehicle("y8",VehicleType.TRUCK);
           Vehicle vehicle5 =new Vehicle("y5",VehicleType.TRUCK);
         
    
      VDMSet team = new VDMSet(new Object[]{p1,p2,p3,p4,p5});
     VDMSet buildingset = new VDMSet(new Object[]{b1,b2,b3});
  VDMSet BucketLadderVehicle= new VDMSet( new Object[]{vehicle1});
    VDMSet HoistTeamVehicle = new VDMSet (new Object[]{vehicle2});
    
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
      


        Depot d1 = new Depot ("Tagamoa", vehicle1, equipment1 );
        Depot d2 = new Depot ("El-Shorouk", vehicle2, equipment2 );
        Depot d3 = new Depot ("Maadi", vehicle3, equipment3 );
        Depot d4 = new Depot ("NasrCity", vehicle4, equipment4 );
     
         
     Date j1StartDate = new Date(12, 11, 18);
     Date j1FinishDate = new Date(20, 11, 18);
     Date j2StartDate = new Date(10, 11, 18);
     Date j2FinishDate = new Date(15, 11, 18);
     Date j3StartDate = new Date(15, 11, 18);
     Date j3FinishDate = new Date(25, 11, 18);
      Date j4StartDate = new Date(20, 11, 18);
     Date j4FinishDate = new Date(30, 11, 18);
    Date j5StartDate = new Date(1, 12, 18);
     Date j5FinishDate = new Date(10, 12, 18);
     
     
 
   
   Job j1 = new Job("J111", "maadi", "3", true, Priority.LOW, true,JobType.BUCKET_LADDER,State.COMPLETED,vehicle1, j1StartDate,j1FinishDate,10,10,equipment1,Satisfaction.GOOD,b1,team);
   Job j2 = new Job("J112", "tagamoa", "7", true, Priority.MEDUIM, true,JobType.BUCKET_LADDER,State.COMPLETED,vehicle2, j2StartDate,j2FinishDate,7,5,equipment2,Satisfaction.VERYGOOD,b2,team);
   Job j3 = new Job("J113", "Shorouk", "15", true, Priority.HIGH, true,JobType.HOIST,State.COMPLETED,vehicle3, j3StartDate,j3FinishDate,10,10,equipment3,Satisfaction.VERYGOOD,b3,team); 
   Job j4 = new Job("J114", "maadi", "20", false, Priority.MEDUIM, true,JobType.HOIST,State.ACTIVE,vehicle4, j4StartDate,j4FinishDate,8,10,equipment4,Satisfaction.BAD,b4,team); 
   Job j5 = new Job("J115", "NasrCity", "30", true, Priority.HIGH, true,JobType.HOIST,State.NEW,vehicle5, j5StartDate,j5FinishDate,10,10,equipment5,Satisfaction.BAD,b5,team);
       
   
   
   
   /*
     person p1 = new person("d2", "b2", "shehab", Qualification.CLEANER);
     person p2 = new person("r2", "d2", "R2D2", Qualification.CLEANER_TECH_DRIVER);
     person p3 = new person("3c", "po", "3CPO", Qualification.CLEANER_DRIVER);
     person p4 = new person("619", "619", "rey mesterio", Qualification.CLEANER_TECH);
     person p5 = new person("1984", "1", "orwell", Qualification.CLEANER);
     
     building b1 = new building("3", "maadi", 25, 3, BuildingType.SMALL_VILLA,0,40);
     building b2 = new building("7", "tagamo3", 15, 0, BuildingType.SMALL_VILLA,0,50);
     building b3 = new building("15", "shorouk", 6, 1, BuildingType.SHOP_FRONT, 0,500);
    */
     Vehicle v1 = new Vehicle("5", VehicleType.CAR);
     Date startdate = new Date(12, 11, 18);
     Date endate = new Date(15, 11, 18);
     Equipment e1 = new Equipment("22", EquipmentType.BUCKET);
     
     //building b5 = new building("15", "madi", 5, 1, BuildingType.SHOP_FRONT, 0, 0);
     
      //VDMSet team = new VDMSet(new Object[]{p1,p2,p3,p4,p5});
     //VDMSet buildingset = new VDMSet(new Object[]{b1,b2,b3});
    // Job j1 = new Job("5", "maadi", "20", true, Priority.LOW, false,JobType.BUCKET_LADDER,State.NEW,v1,startdate,endate,20,20,e1,Satisfaction.GOOD,b5,team);
     
   VDMSet nCleaners = new VDMSet(p1);
   VDMSet nDriver = new VDMSet(p2);
   VDMSet nHoistTeam = new VDMSet(p3);
   VDMSet nhoistTeam = new VDMSet(p4);
   VDMSet nOnJob = new VDMSet(p5);
   VDMSet nActiveHoistTeam = new VDMSet(p1);
   VDMSet nActiveBucketLadderTeam = new VDMSet(p2);
   VDMSet nOnDutyBucketLadderTeam = new VDMSet(p3);
   VDMSet nAvailableBucketLadderTeam = new VDMSet(p4);
   VDMSet nAvailableHoistTeam = new VDMSet(p5);
   
   VDMSequence nNewJobs = new VDMSequence(j1);
   VDMSequence nAcceptedJobs =new VDMSequence(j2);
   VDMSequence nOverScheduleJobs =new VDMSequence(j3);
   VDMSequence nActiveJobs = new VDMSequence(j4);
   VDMSequence nCompletedJobs =new VDMSequence(j5);
   VDMSequence nHigherCostJobs = new VDMSequence(j1);
   
   VDMSet nAvaliableVechile = new VDMSet(vehicle1);
   VDMSet nAvaliableEquipment = new VDMSet(equipment1);
   String loc = new String("maadi");
   VDMSet nLocations = new VDMSet(loc);
   VDMSet nBuildings = new VDMSet(b1);
   VDMSet nVehicles = new VDMSet(vehicle1);
   VDMSet nEquipments = new VDMSet(equipment1);
   
   Maplet pertoj1 = new Maplet(nHoistTeam, nNewJobs);
   VDMMap nHoistTeamToJob = new VDMMap(pertoj1);
   
   Maplet loctoactvh = new Maplet(loc, p1);
   VDMMap nLocationsToActiveHoistTeam = new VDMMap(loctoactvh);
   
   Maplet loctoactvb = new Maplet(loc, p2);
   VDMMap nLocationsToActiveBucketLadderTeam = new VDMMap(loctoactvb);
   
   Maplet vehtojb = new Maplet(vehicle1, j1);
   VDMMap nVehiclesToJob = new VDMMap(vehtojb);
   
   Maplet equtojb = new Maplet(equipment1, j1);
   VDMMap nEquipmentToJob = new VDMMap();
   
   Maplet bcktojb = new Maplet(p2, j1);
   VDMMap nBucketTeamToJob = new VDMMap(bcktojb);
   
   
   
   
   
   WindowCleaningService wcs = new WindowCleaningService(nCleaners, nDriver, nhoistTeam, nhoistTeam, nOnJob, nActiveHoistTeam, nActiveBucketLadderTeam, nOnDutyBucketLadderTeam, nAvailableBucketLadderTeam, nAvailableHoistTeam, nNewJobs, nAcceptedJobs, nOverScheduleJobs, nActiveJobs, nCompletedJobs, nHigherCostJobs, nAvaliableVechile, nAvaliableEquipment, nLocations, nBuildings, nVehicles, nEquipments, nHoistTeamToJob, nLocationsToActiveHoistTeam, nLocationsToActiveBucketLadderTeam, nVehiclesToJob, nEquipmentToJob, nBucketTeamToJob);
     
   
   
   
    
  
 
   
   
    
  
  
  
  Scanner sc = new Scanner(System.in);
  
  
  int val;
  
         while (true) {             
             val =0;
             System.out.println("Welcome to the window cleaning service");
             
             
             System.out.println("for deallocating bucket team press 1");
             System.out.println("for changing job priority press 2");
             System.out.println("for deallocating vehicles and equipment press 3");
             System.out.println("for allocating vehicles and equipment press 4");
             System.out.println("for allocating hoist team to a job press 5");
             System.out.println("for deallocating hoist team from job press 6");
             System.out.println("for allocating bucket team to job press 7");
             System.out.println("press 8 to exit");
             val =sc.nextInt();
             
             switch(val){
                 case 1:
                     wcs.DeallocateBucketTeam(j1); //sha8ala
                     break;
                 case 2:
                     wcs.ChangeJobPriority(j1, 20, 11, 18);//sha8ala
                     break;
                 case 3: 
                     wcs.DeallocateVechilesAndEquipments(j5);//sha8ala
                     break;
                 case 4:
                     wcs.AllocateVechileAndEquipments(j1);//Sha8ala
                     break;
                 case 5: 
                      wcs.AllocateHoisttoJob(j5);
                      break;
                 case 6:
                     wcs.DeallocateHoistTeam(j5);
                     break;
                 case 7:
                     wcs.AllocateBucketTeamtoJob(j1);
                     break;
                 case 8:
                     break;
                 default:
                     System.out.println("invalid choice please enter a correct number: ");
                     val =sc.nextInt();
                     
             }
         }
  
  
  
     }

    
}

