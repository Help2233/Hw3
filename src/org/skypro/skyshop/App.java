package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();
        Product productOne = new Product("хлеб", 54);
        Product productTwo = new Product("макароны", 103);
        Product productThree = new Product("лимонад", 164);
        Product productFour = new Product("колбаса", 324);
        Product productFive = new Product("помидоры", 234);
        Product productSix = new Product("яйца", 153);
        basket.addProduct(productOne);
        basket.addProduct(productTwo);
        basket.addProduct(productThree);
        basket.addProduct(productFour);
        basket.addProduct(productFive);
        basket.addProduct(productSix);

        System.out.println(productOne.getProduct() + ": " + productOne.getCost() + "руб.");
        System.out.println(productTwo.getProduct() + ": " + productTwo.getCost() + "руб.");
        System.out.println(productThree.getProduct() + ": " + productThree.getCost() + "руб.");
        System.out.println(productFour.getProduct() + ": " + productFour.getCost() + "руб.");
        System.out.println(productFive.getProduct() + ": " + productFive.getCost() + "руб.");
        System.out.println("Итого: " + basket.getAllPrice() + "руб.");

        System.out.println(basket.isProductInCart("помидоры"));
        System.out.println(basket.isProductInCart("груша"));

        ProductBasket cart = new ProductBasket();
        System.out.println("Корзина до очистки:");
        basket.printCart();
        basket.clearCart();
        System.out.println("Корзина после очистки:");
        basket.printCart();
        System.out.println("Итого: " + basket.getAllPrice() + "руб.");
        System.out.println(basket.isProductInCart("помидоры"));
        System.out.println(basket.isProductInCart("груша"));

    }
}



