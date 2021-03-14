import java.util.Objects;

public class Book {
    private long isbn;
    private String author;
    private String title;
    private int countPages;
    private double pricePerPage;

    public Book() {
        //строчки ниже чтобы если кто-то будет испольщзовать пустой констк  и в Стринг не то значение и в итоге выдаст null
        author = "No author";
        title = "No title";
    }

    public Book(long isbn, String author, String title, int countPages, double pricePerPage) {
//        if (isbn > 999_999 && isbn < 10_000_000) // проверка чтобы был семизначный номер, не больше и не меньше
//            this.isbn = isbn;
        setIsbn(isbn);

        if (author != null || !author.trim().isEmpty())
            this.author = author;
        else
            this.author = "No author";

        this.title = title;
        if (title != null || !title.trim().isEmpty())
            this.author = title;
        else
            this.author = "No title";

        if (countPages > 0 && countPages <= 10_000)
            this.countPages = countPages;

        setPricePerPage(pricePerPage);

    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        // проверка чтобы был семизначный номер, не больше и не меньше
        if (isbn > 999_999 && isbn < 10_000_000)
            this.isbn = isbn;
        else
            System.out.println("Wrong isbn");
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null || !author.trim().isEmpty())
            this.author = author;
        else
            System.out.println("Wrong author");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null || !title.trim().isEmpty())
            this.author = title;
        else
            this.author = "Wrong title";
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        if (countPages > 0 && countPages <= 10_000)
            this.countPages = countPages;
        else
            System.out.println("Count pages and fill in field <countPages>");
    }

    public double getPricePerPage() {
        return pricePerPage;
    }

    public void setPricePerPage(double pricePerPage) {
        if (pricePerPage > 0 && pricePerPage <= 10)
            this.pricePerPage = pricePerPage;
        else
            System.out.println("Wrong PricePerPage");

    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", countPages=" + countPages +
                ", pricePerPage=" + pricePerPage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn && countPages == book.countPages && Double.compare(book.pricePerPage, pricePerPage) == 0 && author.equals(book.author) && title.equals(book.title);
    }

}
