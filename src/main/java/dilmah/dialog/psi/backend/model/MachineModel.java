package dilmah.dialog.psi.backend.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class MachineModel {

    @Id
    @GeneratedValue
    private String machineId;
    private String brand;
    private String type;
    private String model;
    @OneToOne
    private MachineCategoryModel deviceCategory;
    private String macAddress;
    private String name;

    public MachineModel() {
    }

    public MachineModel(String machineId, String brand, String type, String model, MachineCategoryModel deviceCategory, String macAddress, String name) {
        this.machineId = machineId;
        this.brand = brand;
        this.type = type;
        this.model = model;
        this.deviceCategory = deviceCategory;
        this.macAddress = macAddress;
        this.name = name;
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public MachineCategoryModel getDeviceCategory() {
        return deviceCategory;
    }

    public void setDeviceCategory(MachineCategoryModel deviceCategory) {
        this.deviceCategory = deviceCategory;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MachineModel{" +
                "machineId='" + machineId + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", deviceCategory=" + deviceCategory +
                ", macAddress='" + macAddress + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
