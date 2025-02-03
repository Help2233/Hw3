package rg.skypro.skyshop.product;

public class Product {
    private String product;
    private int cost;

    public int getCost() {
        return cost;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Product() {
    }

    public Product(String product, int cost) {
        this.product = product;
        this.cost = cost;
    }
}
