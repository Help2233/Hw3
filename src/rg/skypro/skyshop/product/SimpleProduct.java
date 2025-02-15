package rg.skypro.skyshop.product;

public class SimpleProduct extends Product {
    int cost;

    public SimpleProduct(String product, int cost) {
        super(product);
        this.cost = cost;

    }

    @Override
    public int getPrice() {
        return cost;
    }

    @Override
    public String toString() {
        return getName() +
                " " + cost +
                " руб.";
    }
    @Override
    public boolean isSpecial (){
        return false;
    }

}
