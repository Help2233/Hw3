package rg.skypro.skyshop;

import rg.skypro.skyshop.basket.ProductBasket;
import rg.skypro.skyshop.product.*;

import java.util.Arrays;


public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();
        DiscountedProduct productOne = new DiscountedProduct("хлеб", 54, 10);
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

        SearchEngine searchEngine = new SearchEngine(5);


        Article one = new Article("Хлеб ржанной","Привезен из центра города");
        Article two = new Article("Макароны спагетти","Привезены из Краснодара");
        Article three = new Article("лимонад натахтари","Привезен из самой Турции");
        Article four = new Article("колбаса докторская","Привезена из самово лучшего комбинта в Самаре");
        Article five = new Article("Помидоры черри","Привезены из теплых стран");
        Article six = new Article("яйца с6","Привезены из Кавказа, самые свежие");

        searchEngine.add(one);
        searchEngine.add(two);
        searchEngine.add(three);
        searchEngine.add(four);
        searchEngine.add(five);
        searchEngine.add(six);

        System.out.println(Arrays.toString(searchEngine.search("Хлеб")));
        System.out.println(Arrays.toString(searchEngine.search("Привезен")));
        System.out.println(Arrays.toString(searchEngine.search("Свежие")));
        System.out.println(Arrays.toString(searchEngine.search("помидор")));




    }
}