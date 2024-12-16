
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача номер 1 и 2");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        fullName =  lastName + " " + firstName + " " + middleName + " ";
        System.out.println("Ф. И. О. сотрудника — " + fullName.toUpperCase());

        System.out.println("Задача номер 3");

        String fullNameTwo = "Иванов Семён Семёнович";
        fullNameTwo = fullNameTwo.replace("ё", "е");
        System.out.println(fullNameTwo);


    }
}