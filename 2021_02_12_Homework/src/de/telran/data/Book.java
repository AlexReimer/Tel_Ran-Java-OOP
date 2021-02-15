package de.telran.data;

public class Book {
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


    public Book(String title, String author, int year, double price, int copyNumber) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
        this.copyNumber = copyNumber;
    }

    public Book(double price, String genre, boolean availible, int copyNumber) {
        this.price = price;
        this.genre = genre;
        this.availible = availible;
        this.copyNumber = copyNumber;
    }

    public Book(String title, String author, String isbn,
                int year, String genre, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.genre = genre;
        this.format = format;
        this.price = price;
    }

    public Book(String title, String author, String isbn,
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

    public Book(String author, int year, boolean availible) {
        this.author = author;
        this.availible = availible;
    }

    public Book(String title, boolean availible) {
        this.title = title;
        this.availible = availible;
    }

    public String toDisplay() {
        return "The BOOK-car-STORE  " + "\n" +
                "Title: " + title + "\n" +
                "Written by : " + author + "\n" +
                "Genre: " + genre + "\n" +
                "ISBN: " + isbn + "\n" +
                "Published : " + year + "\n" +
                "Price  " + price + "";

    }

}


