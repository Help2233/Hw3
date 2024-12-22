
import java.util.Arrays;
import java.util.Locale;

public class Main {


    public static void main(String[] args) {
        Book learningJava = new Book("Изучение Java", new Author("Кэтти и Берт", "Сьерра К., Бэйтс Б."), 2023);
        String theNameOfTheBook = "Изучение Java";
        int yearOfPublication = 2023;
        String name = "Кэтти и Берт";
        String surname = "Сьерра и Бейтс";
        System.out.println("learningJava.theNameOfTheBook = " + learningJava.getTheNameOfTheBook());
        System.out.println("learningJava.getAuthor() = " + learningJava.getAuthor());
        System.out.println("learningJava.getYearOfPublication() = " + learningJava.getYearOfPublication());
        learningJava.setYearOfPublication(2024);
        System.out.println("learningJava.getYearOfPublication() = " + learningJava.getYearOfPublication());

        Author author = new Author("Кэтти и Берт", "Сьерра и Бейтс");
        System.out.println("name = " + author.getName());
        System.out.println("surname = " + author.getSurname());

        Book dataStructuresAndAlgorithmsInJava = new Book("Структуры данных и алгоритмы в Java", new Author("розе", "Лафоре"),2019 );
        System.out.println("dataStructuresAndAlgorithmsInJava.getTheNameOfTheBook() = " + dataStructuresAndAlgorithmsInJava.getTheNameOfTheBook());
        System.out.println("dataStructuresAndAlgorithmsInJava.getAuthor() = " + dataStructuresAndAlgorithmsInJava.getAuthor());
        System.out.println("dataStructuresAndAlgorithmsInJava.getYearOfPublication() = " + dataStructuresAndAlgorithmsInJava.getYearOfPublication());
        dataStructuresAndAlgorithmsInJava.setYearOfPublication(2022);
        System.out.println("dataStructuresAndAlgorithmsInJava.getYearOfPublication() = " + dataStructuresAndAlgorithmsInJava.getYearOfPublication());

        Book javaProgrammingForBeginners = new Book("Программирование на Java для начинающих", new Author(" Андрей", "Васильев"), 2024);
        System.out.println("javaProgrammingForBeginners.getTheNameOfTheBook() = " + javaProgrammingForBeginners.getTheNameOfTheBook());
        System.out.println("javaProgrammingForBeginners.getAuthor() = " + javaProgrammingForBeginners.getAuthor());
        System.out.println("javaProgrammingForBeginners.getYearOfPublication() = " + javaProgrammingForBeginners.getYearOfPublication());
        dataStructuresAndAlgorithmsInJava.setYearOfPublication(2020);
        System.out.println("dataStructuresAndAlgorithmsInJava.getYearOfPublication() = " + dataStructuresAndAlgorithmsInJava.getYearOfPublication());


    }
}
