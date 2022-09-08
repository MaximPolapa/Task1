package Laboratorka1;

public class Bathroom extends Room{
    private boolean tile;
    private int amount;

    public Bathroom(String colorFloor, String colorWall, boolean furniture, boolean tile, int numberBath) {
        super(colorFloor, colorWall, furniture);
        this.tile = tile;
        this.amount = numberBath;
    }

    public boolean isTile() {
        return tile;
    }

    public void setTile(boolean tile) {
        this.tile = tile;
    }

    public int getNumberBath() {
        return amount;
    }

    public void setNumberBath(int numberBath) {
        this.amount = numberBath;
    }

    @Override
    public String toString() {
        return "Bathroom{" +
                "tile=" + tile +
                ", numberBath=" + amount +
                '}';
    }
}
