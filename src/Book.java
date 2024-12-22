public class Book {
    String theNameOfTheBook;
    Author author;
    private int yearOfPublication;

    public Book(String theNameOfTheBook, Author author, int yearOfPublication) {
        this.theNameOfTheBook = theNameOfTheBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;

    }

    public String getTheNameOfTheBook() {
        return this.theNameOfTheBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }

}



