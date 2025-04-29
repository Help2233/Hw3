package rg.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private int originalPrice;
    private int discountPercentage;

    public DiscountedProduct(String name, int originalPrice, int discountPercentage) {
        super(name);
        this.originalPrice = originalPrice;
        this.discountPercentage = discountPercentage;
        if (originalPrice <= 0 ) {
            throw new IllegalArgumentException("Не может быть такая цена");
        }
        if (discountPercentage > 100 || discountPercentage < 0) {
            throw new IllegalArgumentException("Ошибка в скидке");
        }

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

