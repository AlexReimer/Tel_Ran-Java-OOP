import java.util.Arrays;

public class BooksStartApp {
    public static void main(String[] args) {
        Book b1 = new Book(18473888, "Peterson, Jordan", "12 rules for life", 350, 0.071);
        Book b2 = new Book(38881847, "K.Sierra; B.Bates ", "Head First Java", 750, 0.063);
        Book b3 = new Book(47318888, "Peterson, Jordan", "Maps of meaning", 1360, 0.0035);
        Book b4 = new Book(88184738, "Armentrout, Jennifer", "Redemtion.Nachtsturm", 180, 0.1);
        Book b5 = new Book(84738818, "Hopkins", "The Moments I Loved", 60, 0.25);
        Book b6 = new Book(73888184, "Rothman", "Darwins Faktor", 438, 0.03);

        Book[] bookstore = new Book[]{b1, b2, b3, b4, b5, b6};

        printBooks(bookstore);

        getTotalPrice(bookstore);

    }


    //print out array of objects in main
    public static void printBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
    }


    // count a book´s price and total price of all books (objects)
    public static double getTotalPrice(Book[] books, int countPages, double pricePerPage) {
        double bookPriсe = countPages * pricePerPage;
        double total = 0.0;
        for (int i = 0; i < books.length; i++) {
            total += bookPriсe;
            System.out.println(books[i].toString());
        }
        return total;
    }

}




