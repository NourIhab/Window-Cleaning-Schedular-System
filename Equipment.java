
package WindowCleaningService;


public class Equipment {

private String  EquipmentId;
private EquipmentType equipmentType;

    public Equipment(String EquipmentId, EquipmentType equipmentType) {
        this.EquipmentId = EquipmentId;
        this.equipmentType = equipmentType;
    }

    public String getEquipmentId() {
        return EquipmentId;
    }

    public void setEquipmentId(String EquipmentId) {
        this.EquipmentId = EquipmentId;
    }

    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(EquipmentType equipmentType) {
        this.equipmentType = equipmentType;
    }

   
 
 
}
