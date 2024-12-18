
import java.util.Arrays;

public class Main {
    public static void leapYear(int year) {
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 && year % 100 == 0)) {
            System.out.println(year + " Год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void installingTheApplication(int clientOS) {
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        int clientDeviceYear = 2014;
        if (clientDeviceYear <= 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1)
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        if (clientDeviceYear <= 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }

    }

    public static void DeliveryTime(int deliveryDistance, int deliveryTime) {
        if (deliveryDistance <= 20) {
            System.out.println("Срок доставки " + deliveryTime + " день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Срок доставки " + (deliveryTime + 1) + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Срок доставки " + (deliveryTime + 2) + " дня");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }

    }

    public static void main(String[] args) {

        System.out.println("Задача номер 1");
        int year = 2024;
        leapYear(year);

        System.out.println("Задача номер 2");
        int clientOS = 1;
        installingTheApplication(clientOS);

        System.out.println("Задача номер 3");

        int deliveryDistance = 95;
        int deliveryTime = 1;
        DeliveryTime(deliveryDistance,deliveryTime);
    }
}



