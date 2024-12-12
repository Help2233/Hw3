
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача номер 1 и 2 и 3");
        int[] theAmountOfExpenses = new int[5];
        int costsPerMonth = 0;
        int maximumExpenditure = -1;
        theAmountOfExpenses[0] = 15000;
        theAmountOfExpenses[1] = 14454;
        theAmountOfExpenses[2] = 13141;
        theAmountOfExpenses[3] = 32424;
        theAmountOfExpenses[4] = 24255;
        for (int w = 0; w < theAmountOfExpenses.length; w++) {
            costsPerMonth += theAmountOfExpenses[w];
        }
        System.out.println("Сумма трат за месяц составила " + costsPerMonth + " рублей");

        for (int i = 0; i < theAmountOfExpenses.length; i++) {
            if (theAmountOfExpenses[i] > maximumExpenditure) {
                maximumExpenditure = theAmountOfExpenses[i];
            }

        }
        System.out.println("Максимальный расход за неделю состовляет " + maximumExpenditure);

        for (int i = 0; i < theAmountOfExpenses.length; i++) {
            if (theAmountOfExpenses[i] < maximumExpenditure) {
                maximumExpenditure = theAmountOfExpenses[i];
            }

        }
        System.out.println("Минимальный расход за неделю состовляет " + maximumExpenditure);
        int sum = 0;
        for (int w : theAmountOfExpenses) {
            sum += w;
        }
        double average = (double) sum / theAmountOfExpenses.length - 1;
        System.out.println("средний расход за неделю составляет " + average);


        System.out.println("Задание номер 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char a = 0;
        for (int w = reverseFullName.length - 1; w >= 0; w--) {
            a += reverseFullName[w];
            System.out.print(reverseFullName[w]);
        }


    }
}