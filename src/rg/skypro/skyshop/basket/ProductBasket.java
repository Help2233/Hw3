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

    public boolean checkBasket(String productName) {
        for (Product product : products) {
            if (product != null) {
                if (product.getProduct().equalsIgnoreCase(productName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void isProductInCart(String productName) {
        boolean found = false;
        for (Product product : products) {
            if (product != null && product.getProduct().equalsIgnoreCase(productName)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(productName + " есть в корзине!");
        } else {
            System.out.println(productName + " нет в корзине!");
        }
    }

    public void clearCart() {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
    }

    public void printCart() {
        int totalCost = 0;
        int count = 0;
        for (Product product : products) {
            if (product != null) {
                totalCost = totalCost + product.getPrice();
                System.out.println(product);
                if (product.isSpecial()) {
                    count++;
                }
            }
        }
        System.out.println("Всего: " + totalCost);
        System.out.println("Специальных продуктов в корзине: " + count);
    }
}

