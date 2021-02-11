package BooksConstructor;

import SwanConstructor.Swan;

public class Main {
    public static void main(String[] args) {
        Books b1 = new Books("11/22/63", "Stiven King", 1996, 29.99, 10000);
        Books b2 = new Books(12.00, "Fantasy", true, 8000 );
        Books b3 = new Books("Alchimist", "Paulo Coelho", "12987-109812", 8000000, "Fiction", 9.99);
//        Books b4 = new Books();
//        Books b5 = new Books();
//        Books b6 = new Books();
//
//        Books[] array = new Books[]{b1, b2, b3, b4, b5, b6,};
//        BooksSort(array);

    }

    private static void BooksSort(Books[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j].copyNumber < array[j - 1].copyNumber) {
                    int tmp = array[i].copyNumber;
                    array[j].copyNumber = array[j - 1].copyNumber;
                    array[j - 1].copyNumber = tmp;
                }
            }
        }
//        for (Swan sorted : array) {
//            System.out.println(sorted);
        }
    }


