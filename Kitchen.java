package Laboratorka1;

public class Kitchen extends Room {
    private String materialFloor;
    private String materialWall;

    public Kitchen(String colorFloor, String colorWall, boolean furniture, String materialFloor, String materialWall) {
        super(colorFloor, colorWall, furniture);
        this.materialFloor = materialFloor;
        this.materialWall = materialWall;
    }

    public String getMaterialFloor() {
        return materialFloor;
    }

    public void setMaterialFloor(String materialFloor) {
        this.materialFloor = materialFloor;
    }

    public String getMaterialWall() {
        return materialWall;
    }

    public void setMaterialWall(String materialWall) {
        this.materialWall = materialWall;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "materialFloor='" + materialFloor + '\'' +
                ", materialWall='" + materialWall + '\'' +
                '}';
    }
}
