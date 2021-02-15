package de.telran.application;

import de.telran.dao.BookStore;
import de.telran.data.Book;

public class BookStartApplication {
    public static void main(String[] args) {

        BookStore storeMobil = new BookStore(50);

        //add a book to store
        Book stage = new Book("Back Stage", "Peterson, John", "98120-20019", 2020, "Science fiction", 25.00);
        System.out.println(stage.toDisplay());
        System.out.println("added to mobile store.");

        System.out.println("______"+ "\n");

        Book redemption = new Book("Redemtion.Nachtsturm", "Armentrout, Jennifer", "98120-203298", 2021, "Novel", 45.00);
        System.out.println(redemption.toDisplay());
        System.out.println("added to mobile store.");

        System.out.println("______" + "\n");

        //remove a book from store
        System.out.println(storeMobil.deleteBookFromStore(stage) + " was removed from store");
        //System.out.println(storeMobil.books[0].title);

    }



}
