package data;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int copyNumber = 0;
    private int year;
    private String publisher;
    private String isbn;
    private double price;
    private String format;
    private boolean availible;
    private boolean exchange;
    private double rating;

    //Constructor
    Book(String title, String author, double price,
         String isbn, String genre, boolean availible) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        this.genre = genre;
        this.availible = availible;
    }

     Book(String title, String author, double price) {
    }

    //Business logic
    void setTitle(String newTitle) {
        this.title = newTitle;
    }

    void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    void setYear(int newYear) {
        this.year = newYear;
    }

    void setIsbn(String newIsbn) {
        this.isbn = newIsbn;
    }

    void setGenre(String newGenre) {
        this.genre = newGenre;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    void setFormat(String newFormat) {
        this.format = newFormat;
    }

    void setAvailible(boolean newAvailible) {
        this.availible = newAvailible;
    }

    public boolean isChange() {
        return exchange;
    }

   class TestBook {
        public void main(String[] args) {
            Book store = new Book("1984", "Oruel", 9.50, "49870983120", "Dystopia", true);
            store.setGenre("Dystopia");
            store.setPrice(5.99);
            System.out.println(isChange());
        }
    }


}


