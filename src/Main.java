//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача номер 1");

        int accumuLation = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            month++;
            total = total + accumuLation;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задача номер 2");

        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("Задача номер 3");

        int inTheCountryY = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int yearNew = 2024;
        for (int year = yearNew; year < yearNew + 10; year++) {
            inTheCountryY += inTheCountryY * birthRate / 1000 - inTheCountryY * mortalityRate / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + inTheCountryY);
        }

        System.out.println("Задача номер 4 и 5 ");

        int initialAmount = 15000;
        double percent = 0.07;
        int totalMoney = 12_000_000;
        int months = 0;
        while (initialAmount <= totalMoney) {
            initialAmount += initialAmount * percent;
            months++;
            if (months % 6 == 0) {
                System.out.println("месяц " + months + ", сумма накоплений равна " + initialAmount);
            }
        }

        System.out.println("Задача номер 6");

        int years = 9;
        int monthsPerYear = 12;
        int savings = 15000;
        years = years * monthsPerYear;
        for (int year = 1; year <= years; year++) {
            savings += savings * percent;
            if (year % 6 == 0) {
                System.out.println("за месяц " + year + ", сумма " + savings);
            }
        }

        System.out.println("Задача номер 7");

        int firstDay = 3;
        for (int day = firstDay; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число.");
        }

        System.out.println("Задание номер 8");

        int juniorYear = 1824;
        int finalYear = 2124;
        int realYear = 2024;
        for (int year = 0; year <= juniorYear + finalYear; year = year + 79) {
            if (year >= juniorYear) {
                System.out.println(year);
                if (year > realYear) {
                    break;
                }
            }
        }


    }

}