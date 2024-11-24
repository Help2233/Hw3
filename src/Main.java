public class Main {
    public static void main(String[] args) {

        System.out.println("Задание номер 1");

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача номер 2");

        int clientDeviceYear = 2014;
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1)
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        if (clientDeviceYear <= 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }

        System.out.println("Задание номер 3");

        int year = 2538;
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0 ) || ( year % 400 == 0 && year % 100 == 0 ))) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }

        System.out.println("Задча номер 4");

        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Срок доставки" + deliveryTime + " день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Срок доставки " + (deliveryTime + 1) + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Срок доставки " + (deliveryTime + 2) + " дня");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }

        System.out.println("Задача номер 5");

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Весна");
                break;
            default:
                System.out.println("Такого времени года нет");
        }


    }
}


