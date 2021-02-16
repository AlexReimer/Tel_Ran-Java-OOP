public class Book {
    String name;
    String isbn;
    String author;
    int yearOfPublishing;
    int pages;
    String cover;
    String genre;
    double rating;
    double price;

    public int bookNumber;

    static int count = 1;

    public Book(String name, String isbn, String author, int yearOfPublishing,
                int pages, String cover, String genre, double rating, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.pages = pages;
        this.cover = cover;
        this.genre = genre;
        this.rating = rating;
        this.price = price;

        bookNumber = count;
        count++;
    }

    public Book() {
        bookNumber = count;
        count++;
    }


    public String toDisplay() {
        return "Название книги: " + name + "\n" +
                "ISBN: " + isbn + "\n" + "Автор: " + author + "\n" +
                "Дата публикации: " + yearOfPublishing + "\n" +
                "Количество страниц: " + pages + "\n" +
                "Переплет: " + cover + "\n" +
                "Жанр: " + genre + "\n" + "Рейтинг: " + rating + "\n" +
                "Прайс: " + price + " руб";

    }

    private static void booksSorting(Book[] input) {
        boolean unsorted = false;
        for (int i = 0; i < input.length - 1; i++) {
            unsorted = false;
            if (input[i].rating > input[i + 1].rating) {

                Book temp = input[i];
                input[i] = input[i + 1];
                input[i + 1] = temp;
                unsorted = true;
            }
        }
        if (unsorted) {
            booksSorting(input);
        }
    }
}
