package rg.skypro.skyshop.product;

public class SimpleProduct extends Product {
    int cost;

    public SimpleProduct(String product, int cost) {
        super(product);
        this.cost = cost;
        if (cost <= 0 ) {
            throw new IllegalArgumentException("Не может быть такая цена");
        }
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
    public boolean isSpecial() {
        return false;
    }

    @Override
    public String searchTerm() {
        return getName();
    }

    @Override
    public String typeContent() {
        return "PRODUCT";
    }

    @Override
    public void getStringRepresentation() {
        super.getStringRepresentation();
    }
}
