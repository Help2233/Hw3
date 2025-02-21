package rg.skypro.skyshop.product;

public class FixedPriceProduct extends Product {
    private static final int fixPrice = 142;

    public FixedPriceProduct(String name) {
        super(name);

    }

    @Override
    public int getPrice() {
        return fixPrice;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return getName() +
                "  " + getPrice() + " руб.";
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