public class Book {
    private long isbn;
    private String author;
    private String title;
    private int countPages;
    private double pricePerPage;

    public Book() {
        title = "No title";
    }

    public Book(long isbn, String author, String title, int countPages, double pricePerPage) {

        this.isbn = isbn;

        setAuthor(author);

        setTitle(title);

//        this.author = author;
//        this.title = title;

        if (countPages > 0 && countPages < 10_000)
            this.countPages = countPages;

        if (pricePerPage > 0 && pricePerPage < 10)
            this.pricePerPage = pricePerPage;
    }




    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty())
            System.out.println("Miss author");
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty())
            System.out.println("Miss title");
        this.title = title;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        if (countPages == 0)
            System.out.println("Count pages and fill in field <countPages>");
        this.countPages = countPages;
    }

    public double getPricePerPage() {
        return pricePerPage;
    }

    public void setPricePerPage(double pricePerPage) {
        if (pricePerPage == 0)
            System.out.println("Fill in the field <pricePerPage>");
        this.pricePerPage = pricePerPage;
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
}
