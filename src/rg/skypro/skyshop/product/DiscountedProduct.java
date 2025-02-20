package rg.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private int originalPrice;
    private int discountPercentage;

    public DiscountedProduct(String name, int originalPrice, int discountPercentage) {
        super(name);
        this.originalPrice = originalPrice;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public int getPrice() {
        return originalPrice - (originalPrice * discountPercentage / 100);
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return getName() +
                " " + getPrice() +
                " (  " + discountPercentage +
                " % )";
    }
}

