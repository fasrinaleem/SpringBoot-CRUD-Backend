package dilmah.dialog.psi.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MachineCategoryModel {

    @Id
    @GeneratedValue
    private Long categoryId;
    private String brand;
    private String type;
    private String model;
    private String name;
    private String macAddress;

    public MachineCategoryModel() {
    }

    public MachineCategoryModel(Long categoryId, String brand, String type, String model, String name, String macAddress) {
        this.categoryId = categoryId;
        this.brand = brand;
        this.type = type;
        this.model = model;
        this.name = name;
        this.macAddress = macAddress;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    @Override
    public String toString() {
        return "MachineCategoryModel{" +
                "categoryId='" + categoryId + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", macAddress='" + macAddress + '\'' +
                '}';
    }
}
