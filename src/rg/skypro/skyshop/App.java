package rg.skypro.skyshop;

import rg.skypro.skyshop.basket.ProductBasket;
import rg.skypro.skyshop.product.Product;
import rg.skypro.skyshop.product.SimpleProduct;
import rg.skypro.skyshop.product.DiscountedProduct;
import rg.skypro.skyshop.product.FixedPriceProduct;


public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();
        DiscountedProduct productOne = new DiscountedProduct("хлеб",54, 10);
        DiscountedProduct productTwo = new DiscountedProduct("макароны", 103, 6);
        FixedPriceProduct productThree = new FixedPriceProduct("лимонад");
        SimpleProduct productFour = new SimpleProduct("колбаса", 324);
        DiscountedProduct productFive = new DiscountedProduct("помидор", 234, 20);
        SimpleProduct productSix = new SimpleProduct("яйца", 153);
        basket.addProduct(productOne);
        basket.addProduct(productTwo);
        basket.addProduct(productThree);
        basket.addProduct(productFour);
        basket.addProduct(productFive);
        basket.addProduct(productSix);


        basket.isProductInCart("помидор");
        basket.isProductInCart("груша");

        ProductBasket cart = new ProductBasket();
        System.out.println("Корзина до очистки:");

        basket.printCart();
        basket.clearCart();
        System.out.println("Корзина после очистки:");
        basket.printCart();

        basket.isProductInCart("помидор");
        basket.isProductInCart("груша");


    }
}