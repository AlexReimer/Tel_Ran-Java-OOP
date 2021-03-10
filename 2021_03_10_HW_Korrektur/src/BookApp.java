public class BookApp {
    public static void main(String[] args) {

        Book[] books = {
                new Book(1111111, "author1", "title1", 234, 0.9),
                new Book(1111112, "author2", "title2", 24, 1.9),
                new Book(1111113, "author3", "title3", 267, 2.0),
                new Book(1111114, "author4", "title4", 654, 0.3),
                new Book(1111115, "author5", "title5", 987, 8.19),
                new Book(1111116, "author6", "title6", 34, 1.29),
                new Book(1111117, "author7", "title7", 65, 4.0)
        };

        printBooks(books);
        double res = getTotalPrice(books);
        System.out.println("Total price all books = " + res);
//        System.out.printf("Total price all books = %.2f\n", res);
//        int x = 123;
//        System.out.printf("x = %d\n",x);
//        System.out.printf("price = %.2f and x = %d\n",res,x);
    }

    private static double getTotalPrice(Book[] books) {
        double totalPrice = 0.0;
        for (Book b : books) {
            totalPrice += b.getCountPages() * b.getPricePerPage();
        }
        return totalPrice;
    }


    // [book1] [book2] [book3] [book4] ...
    private static void printBooks(Book[] books) {
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
