public class Books {
    String title;
    String author;
    String genre;
    int copyNumber = 0;
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
        System.out.println(title + "costs " + price);
        System.out.println("Wir sell " + title + " as a " + format);
        System.out.println("The book " + title + (availible ? " is availible" : " not availible"));

    }
}


class TradeBooks {
    public static void main(String[] args) {
        Books alphabet = new Books();
        Books foods = new Books();
        Books peaceAndWar = new Books();
        Books thriller = new Books();
        Books guide = new Books();

        alphabet.title = "Your child first book";
        alphabet.author = "Xing Xing";
        alphabet.genre = "non-fiction";
        alphabet.publisher = "Pinguin Inc.";
        alphabet.copyNumber = 10_000;
        alphabet.isbn = "123023098-3092";
        alphabet.price = 19.99;
        alphabet.format = "Pocketbook";
        alphabet.availible = true;
        alphabet.bookInfoOutput();

        System.out.println("---------");

        guide.title = "Your first world trip: Bali, India, Peru";
        guide.author = "Axel Tripanutij";
        guide.genre = "non-fiction";
        guide.publisher = "Axel Verlag";
        guide.copyNumber = 5_000;
        guide.isbn = "78302-098-3092";
        guide.price = 9.99;
        guide.format = "Hardcover";
        guide.availible = true;
        guide.bookInfoOutput();

        System.out.println("---------");

        foods.title = "My best travel foods expirience";
        foods.author = "Axel Tripanutij";
        foods.genre = "food";
        foods.publisher = "Pinguin Inc.";
        foods.copyNumber = 5_000;
        foods.isbn = "78302-098-3092";
        foods.price = 9.99;
        foods.format = "Pocketbook";
        foods.availible = false;
        foods.bookInfoOutput();
    }
}
