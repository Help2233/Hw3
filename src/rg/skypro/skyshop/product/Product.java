
package rg.skypro.skyshop.product;

public class Product {
    private String name;
    private int cost;


    public int getCost() {
        return cost;
    }

    public String getProduct() {
        return name;
    }

    public void setProduct(String product) {
        this.name = product;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Product() {
    }

    public Product(String product, int cost) {
        this.name = product;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return name + ": " + cost + " руб.";
    }
}

