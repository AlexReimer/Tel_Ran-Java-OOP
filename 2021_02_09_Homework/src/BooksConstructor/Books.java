package BooksConstructor;

public class Books {

    String title;
    String author;
    String genre;
    int copyNumber = 0;
    int year;
    String publisher;
    String isbn;
    double price;
    String format;
    boolean availible;


    public void bookInfoOutput() {
        System.out.println("Book title: " + title);
        System.out.println("Book author: " + author);
        System.out.println("Book genre: " + genre);
        System.out.println("Publisher is : " + publisher);
        System.out.println("First edition of " + title + " has " + copyNumber + " books");
        System.out.println("ISDN is : " + isbn);
        System.out.println(title + " costs " + price);
        System.out.println("Wir sell " + title + " as a " + format);
        System.out.println("The book " + title + (availible ? " is availible" : " not availible"));

    }

    public Books(String title, String author, int year, double price, int copyNumber) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
        this.copyNumber = copyNumber;
    }

    public Books(double price, String genre, boolean availible, int copyNumber) {
        this.price = price;
        this.genre = genre;
        this.availible = availible;
        this.copyNumber = copyNumber;
    }

    public Books(String title, String author, String isbn,
                 int copyNumber, String format, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.copyNumber= copyNumber;
        this.format = format;
        this.price = price;
    }

    public Books(String title, String author, String isbn,
                 String format, double price, String publisher,
                 int copyNumber, boolean availible) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.format = format;
        this.price = price;
        this.publisher = publisher;
        this.copyNumber = copyNumber;
        this.availible = availible;
    }

    public Books(String author, int year, boolean availible){
        this.author = author;
        this.availible = availible;
    }

    public Books(String title,  boolean availible){
        this.title = title;
        this.availible = availible;
    }
}
