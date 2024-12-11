
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача номер 1 и 2");

        int[] anIntegerArray = new int[]{1, 2, 3};
        for (int q = 0; q < anIntegerArray.length; q++) {
            System.out.print(anIntegerArray[q]);
            if (q < anIntegerArray.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println();

        double[] fractionalArray = {1.57, 7.654, 9.986};
        for (int q = 0; q < fractionalArray.length; q++) {
            System.out.print(fractionalArray[q]);
            if (q < fractionalArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        int[] anArbitraryArray = new int[13];
        for (int q = 0; q < anArbitraryArray.length; q++) {
            anArbitraryArray[q] = q * 10;
        }
        for (int q = 0; q < anArbitraryArray.length; q++) {
            System.out.print(anArbitraryArray[q]);
            if (q < anArbitraryArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        System.out.println("Задача номер 3");

        int[] namber = new int[]{1, 2, 3};
        for (int q = namber.length - 1; q >= 0; q--) {
            System.out.print(namber[q]);
            if (q > 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        double[] namberOne = {1.57, 7.654, 9.986};
        for (int q = namberOne.length - 1; q >= 0; q--) {
            System.out.print(namberOne[q]);
            if (q > 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        int[] namberTwo = new int[13];
        for (int q = 0; q < namberTwo.length; q++) {
            namberTwo[q] = q * 10;
        }
        for (int q = namberTwo.length - 1; q >= 0; q--) {
            System.out.print(namberTwo[q]);
            if (q > 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        System.out.println("Зaдание номер 4");

        int[] array = {1, 2, 3};
        for (int y = 0; y < array.length; y++) {
            if (array[y] % 2 != 0) {
                array[y] = array[y] + 1;
            }
        }
        System.out.print(Arrays.toString(array));

    }
}