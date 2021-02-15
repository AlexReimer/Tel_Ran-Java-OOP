package de.telran.dao;

import de.telran.data.Book;

public class BookStore {
    public Book[] books;
    public int assortment;

    public BookStore(int stock) {
        books = new Book[stock];
        assortment = 0;
    }

    //add book to store
    public boolean addBook(Book bk) {
        if (assortment < books.length) {
            books[assortment] = bk;
            assortment++;
            return true;
        }
        return false;
    }

    //delete book from store
    public boolean deleteBookFromStore(Book buk) {
        //equals to comparison
        for (int i = 0; i < assortment; i++) {
            if (books[i].equals(buk)) {
                books[i] = books[assortment - 1];
               // books[assortment - 1] = null;
                assortment--;
                return true;
            }
        }
        return false;
    }
}
