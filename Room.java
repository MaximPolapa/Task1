package Laboratorka1;

import java.util.Objects;

public class Room {
    private String colorFloor;
    private String colorWall;
    private boolean furniture;

    public Room(String colorFloor, String colorWall, boolean furniture) {
        this.colorFloor = colorFloor;
        this.colorWall = colorWall;
        this.furniture = furniture;
    }

    public String getColorFloor() {
        return colorFloor;
    }

    public void setColorFloor(String colorFloor) {
        this.colorFloor = colorFloor;
    }

    public String getColorWall() {
        return colorWall;
    }

    public void setColorWall(String colorWall) {
        this.colorWall = colorWall;
    }

    public boolean isFurniture() {
        return furniture;
    }

    public void setFurniture(boolean furniture) {
        this.furniture = furniture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room that = (Room) o;
        return Objects.equals(colorFloor, that.colorFloor) && Objects.equals(colorWall, that.colorWall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colorFloor, colorWall);
    }

    public void creatingNewColorWall(String colorWall){
        setColorWall(colorWall);
    }

    public void creatingNewCollorFloor(String colorFloor){
        setColorFloor(colorFloor);
    }

    @Override
    public String toString() {
        return "RepairHouse" +
                "colorFloor='" + colorFloor + '\'' +
                ", colorWall='" + colorWall + '\'';
    }
}
