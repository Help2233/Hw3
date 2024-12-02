public class Main {
    public static void main(String[] args) {

        System.out.println("Задача номер 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }

        System.out.println("Задача номер 2");

        for (int y = 10; y > 0; y--) {
            System.out.println("Итерация цикла " + y);
        }

        System.out.println("Задача номер 3");

        for (int w = 0; w <= 17; w = w + 2) {
            System.out.println("Итерация цикла " + w);
        }

        System.out.println("Задача номер 4");

        for (int q = 10; q >= -10; q--) {
            System.out.println("Итерация цикла " + q);
        }

        System.out.println("Задача номер 5");

        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }

        System.out.println("Задача номер 6");

        for (int a = 7; a <= 98; a = a + 7) {
            System.out.println("Итерация цикла " + a);
        }

        System.out.println("Задача номер 7");

        for (int s = 1; s <= 512; s = s * 2) {
            System.out.println("Итерация цикла " + s);
        }

        System.out.println("Задача номер 8 и 9");

        int accumulation = 29000;
        int total = 0;
        for (int z = 0; z < 12; z++) {
            total = total + total / 100;
            total = total + accumulation;
            System.out.println("Месяц " + z + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задача номер 10");

        for (int p = 1; p <= 10; p++) {
            System.out.println("2 * " + p + " = " + p * 2);
        }


    }
}

