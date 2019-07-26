/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WindowCleaningService;

import static org.junit.Assert.*;  

import org.junit.*;  

public class AllocateVehiclesEquipmentTestCase {
    
    private Object VDMSet;
    Vehicle vehicle3 =new Vehicle("y8",VehicleType.CAR);
    Date j1StartDate = new Date(12, 11, 18);
    Date j1FinishDate = new Date(20, 11, 18);
    Equipment equipment1= new Equipment("55",EquipmentType.BUCKET);
    Equipment equipment2= new Equipment("12",EquipmentType.LADDER);
    building b1 = new building("3", "maadi", 25, 3, BuildingType.SMALL_VILLA,0,40);
    person p1 = new person("d2", "b2", "shehab", Qualification.CLEANER);
    person p3 = new person("3c", "po", "3CPO", Qualification.CLEANER_DRIVER);
    VDMSet team1=new VDMSet(new Object[]{p1,p3});
    
     public void AllocateVehiclesEquipment(){  
    
      Job job = new Job("3",true,Priority.HIGH,true,JobType.BUCKET_LADDER,State.NEW,vehicle3,j1StartDate,j1FinishDate,10,8,equipment1,Satisfaction.GOOD,b1,team1);
      WindowCleaningService wcs=new WindowCleaningService();
      assertEquals(true, wcs.AllocateVechileAndEquipments(job));  

    }  
    
}
