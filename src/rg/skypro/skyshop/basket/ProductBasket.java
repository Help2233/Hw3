package rg.skypro.skyshop.basket;

import rg.skypro.skyshop.product.Product;

public class ProductBasket {
    Product[] products = new Product[5];

    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
        System.out.println("Места нет");
    }

    public int getAllPrice() {
        int price = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                price = price + products[i].getCost();
            }
        }
        return price;
    }

    public boolean isProductInCart(String productName) {
        for (Product product : products) {
            if (product.getProduct().equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }

    public void clearCart() {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
        products.clone(); // Чистим список
    }

    public void printCart() {
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getProduct());
            } else {
                System.out.println("null");
            }
        }
    }
}