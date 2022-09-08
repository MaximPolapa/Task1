package Laboratorka1;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setNazva(String nazva) {
        this.name = nazva;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laboratorka1.Product{" +
                "nazva='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
