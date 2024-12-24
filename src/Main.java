
import java.util.Arrays;
import java.util.Locale;

public class Main {


    public static void main(String[] args) {
        String title = "Гарри Поттер и узник Азкаба";
        Author author = new Author();
        Author authorOne = new Author("Джоан", "Роулинг");
        Author authorTwo = new Author("Мишель", "Пейвер");
        Author authorThree = new Author("Стивен", "Кинг");
        System.out.println(authorOne);
        Book book = new Book("Гарри Поттер и узник Азкаба", authorOne, 2021);
        book.setYear(2020);
        Book bookOne = new Book("Гарри Поттер и Принц-полукровка", authorTwo, 2005);
        bookOne.setYear(2010);
        Book bookThree = new Book("Зелёная миля", authorThree, 2022);
        bookThree.setYear(2024);
        System.out.println(book);
        System.out.println(bookOne);
        System.out.println(bookThree);

    }
}
