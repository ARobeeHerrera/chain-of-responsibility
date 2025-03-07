package Classes;

public class WasteContainer {
    private String wasteType;
    private Integer wasteAmount;
    private Integer containerFull = 100;

    public WasteContainer(String wasteType, Integer wasteAmount) {
        this.wasteType = wasteType;
        this.wasteAmount = wasteAmount;
    }
    public WasteContainer() {}

    public String getWasteType() {
        return wasteType;
    }

    public void setWasteType(String wasteType) {
        this.wasteType = wasteType;
    }

    public boolean getContainerFull() {
        return (wasteAmount >= containerFull);
    }

    public void setWasteAmount(Integer wasteAmount) {
        this.wasteAmount = this.wasteAmount + wasteAmount;
    }

    public Integer getWasteAmount() {
        return wasteAmount;
    }

    public void setWasteCapacityToEmpty() {
        this.wasteAmount = 0;
        System.out.println(wasteType + " has been set to empty\n");
    }
}
