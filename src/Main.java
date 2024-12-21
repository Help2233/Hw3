
import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
        Book learningJava = new Book("Изучение Java", "Сьерра К., Бэйтс Б.", 2023);
        String theNameOfTheBook = "Изучение Java";
        String author = "Сьерра К., Бэйтс Б.";
        int yearOfPublication = 2023;
        String name = "Кэтти и Берт";
        String surname = "Сьерра и Бейтс";
        System.out.println("learningJava.theNameOfTheBook = " + learningJava.getTheNameOfTheBook());
        System.out.println("learningJava.author = " + learningJava.author);
        System.out.println("learningJava.getYearOfPublication() = " + learningJava.getYearOfPublication());
        learningJava.setYearOfPublication(2024);
        System.out.println("learningJava.getYearOfPublication() = " + learningJava.getYearOfPublication());

        Author king = new Author("Кэтти и Берт", "Сьерра и Бейтс");
        System.out.println("name = " + king.getName());
        System.out.println("surname = " + king.getSurname());

        Book dataStructuresAndAlgorithmsInJava = new Book("Структуры данных и алгоритмы в Java", "Лафоре Р.",2019 );
        System.out.println("dataStructuresAndAlgorithmsInJava.getTheNameOfTheBook() = " + dataStructuresAndAlgorithmsInJava.getTheNameOfTheBook());
        System.out.println("dataStructuresAndAlgorithmsInJava.getAuthor() = " + dataStructuresAndAlgorithmsInJava.getAuthor());
        System.out.println("dataStructuresAndAlgorithmsInJava.getYearOfPublication() = " + dataStructuresAndAlgorithmsInJava.getYearOfPublication());
        dataStructuresAndAlgorithmsInJava.setYearOfPublication(2022);
        System.out.println("dataStructuresAndAlgorithmsInJava.getYearOfPublication() = " + dataStructuresAndAlgorithmsInJava.getYearOfPublication());

        Book javaProgrammingForBeginners = new Book("Программирование на Java для начинающих", "Васильев А.Н.", 2024);
        System.out.println("javaProgrammingForBeginners.getTheNameOfTheBook() = " + javaProgrammingForBeginners.getTheNameOfTheBook());
        System.out.println("javaProgrammingForBeginners.getAuthor() = " + javaProgrammingForBeginners.getAuthor());
        System.out.println("javaProgrammingForBeginners.getYearOfPublication() = " + javaProgrammingForBeginners.getYearOfPublication());
        dataStructuresAndAlgorithmsInJava.setYearOfPublication(2020);
        System.out.println("dataStructuresAndAlgorithmsInJava.getYearOfPublication() = " + dataStructuresAndAlgorithmsInJava.getYearOfPublication());


    }
}

