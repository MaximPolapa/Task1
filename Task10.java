package Laboratorka1;

public class Task10 {
    public static void main(String[] args) {
        Room blueHouse = new Room("Blue","White", true);
        System.out.println(blueHouse+ "\n");
        blueHouse.creatingNewCollorFloor("White");
        blueHouse.creatingNewColorWall("Black");
        System.out.println(blueHouse);
        Kitchen kitchen = new Kitchen("Pink","White",false,
                "Stone","Brick");
        Bathroom bathroom = new Bathroom("Pink","White",false,
                true,2);
        System.out.println(kitchen + "\n");
        System.out.println(bathroom +"\n");

    }
}
