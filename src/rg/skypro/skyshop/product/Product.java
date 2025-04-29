
package rg.skypro.skyshop.product;

import rg.skypro.skyshop.Searchable;

public abstract class Product implements Searchable {
    private String name;

    public String getProduct() {
        return name;
    }

    public void setProduct(String product) {
        this.name = product;
    }


    public Product(String product) {
        this.name = product;

    }

    public void productVerification(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Нет такого продукта");
        }
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public abstract int getPrice();

    public abstract boolean isSpecial();
}

