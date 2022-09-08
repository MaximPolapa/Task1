package Laboratorka1;

class PairProduct {
    private Product product;
    private int count;

    public PairProduct(Product product, int count) {
        this.product = product;
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Laboratorka1.PairProduct{" +
                "product=" + product +
                ", count=" + count +
                '}';
    }
}
