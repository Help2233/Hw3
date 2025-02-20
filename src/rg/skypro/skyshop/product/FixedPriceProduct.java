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
}