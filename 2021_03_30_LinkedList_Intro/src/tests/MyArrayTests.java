package tests;

import model.MyArray;
import interfaces.IList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayTests {
    IList numbers;
    IList strings;
    //    MyArray numbers;
//    MyArray strings;
    Integer[] arNumbers = {10, 7, 11, -2, 13, 10, 2000};
    String[] arStrings = {"abc", "lmn", "fg", "abc"};


    @Before
    public void setUp() throws Exception {
        numbers = new MyArray();
        for (Integer i : arNumbers) {
            numbers.add(i);
        }
        strings = new MyArray();
        for (String s : arStrings) {
            strings.add(s);
        }
    }

    @Test
    public void testSetUp() {
        int sizeNumbers = numbers.size();
        int sizeStrings = strings.size();
        assertEquals(arNumbers.length, sizeNumbers);
        assertEquals(arStrings.length, sizeStrings);
        //проверка по numbers
        for (int i = 0; i < sizeNumbers; i++) {
            assertEquals(arNumbers[i], numbers.get(i));
        }
        //проверка strings
        for (int i = 0; i < sizeStrings; i++) {
            assertEquals(arStrings[i], strings.get(i));
        }
    }

    @Test
    public void testRemoveAtIndex() {
        Integer[] arNumbers_2 = {10, 7, 11, 13, 10, 2000};
        //уменьшил размер массива {10, 7, 11, -2, 13, 10, 2000};и в проверке обращаюсь к последнему индексу,
        // ожидая null вместо 2000
        assertEquals(null, numbers.remove(7));
        assertEquals(null, numbers.remove(17));
        Integer res = (Integer) numbers.remove(3);
        //проверяем удален ли элемент -2
        assertEquals(-2, (int) res);
        assertEquals(arNumbers.length - 1, numbers.size());
        for (int i = 0; i < numbers.size(); i++) {
            //сравниваем два массива arNumbers_2 и arNumbers
            assertEquals(arNumbers_2[i], numbers.get(i));

        }
    }

    @Test
    public void indexOfTest() {
        //{10, 7, 11, -2, 13, 10, 2000}; -> проверяем первую встречу 10
        //{"abc", "lmn", "fg", "abc"}; -> проверяем первую встречу "abc"

        //positiv szenarien
        assertEquals(0, numbers.indexOf(10)); // return 0 if 10 vorhanden
        assertEquals(-1, numbers.indexOf(-100)); // return -1 weil -100 nicht vorhanden
        //negativ szenerien
        assertEquals(-1, numbers.indexOf(null)); // return -1 weil null input
        assertEquals(-1, numbers.indexOf("abc")); // return -1 weil abc input nicht vorhanden in numbers
        //============================
        //positiv szenarien
        assertEquals(0, strings.indexOf("abc")); // return 0 if abc vorhanden
        assertEquals(-1, strings.indexOf("ooo")); // return -1 weil ooo nicht vorhanden
        //negativ szenerien
        assertEquals(-1, strings.indexOf(null)); // return -1 weil null input
        assertEquals(-1, strings.indexOf(1000)); // return -1 weil abc input nicht vorhanden in numbers
        //============================
    }

    @Test
    public void lastIndexOfTest() {
        //{10, 7, 11, -2, 13, 10, 2000}; -> проверяем первую встречу 10
        //{"abc", "lmn", "fg", "abc"}; -> проверяем первую встречу "abc"

        //positiv szenarien
        assertEquals(5, numbers.lastIndexOf(10)); // return 0 if 10 vorhanden
        assertEquals(-1, numbers.lastIndexOf(-100)); // return -1 weil -100 nicht vorhanden
        //negativ szenerien
        assertEquals(-1, numbers.lastIndexOf(null)); // return -1 weil null input
        assertEquals(-1, numbers.lastIndexOf("abc")); // return -1 weil abc input nicht vorhanden in numbers
        //============================
        //positiv szenarien
        assertEquals(0, strings.lastIndexOf("abc")); // return 0 if abc vorhanden
        assertEquals(-1, strings.lastIndexOf("ooo")); // return -1 weil ooo nicht vorhanden
        //negativ szenerien
        assertEquals(-1, strings.lastIndexOf(null)); // return -1 weil null input
        assertEquals(-1, strings.lastIndexOf(1000)); // return -1 weil abc input nicht vorhanden in numbers
        //============================
    }


    @Test
    public void testRemoveAtObject() {
        //{10, 7, 11, -2, 13, 10, 2000}; -> проверяем первую встречу 10
        //{"abc", "lmn", "fg", "abc"}; -> проверяем первую встречу "abc"

        assertTrue(numbers.remove((Integer) 10)); //delete first 10 in array
        assertEquals(arNumbers.length - 1, numbers.size());//проверяю удалился ли один элемент, уменьшился ли дин.массив на 1 элемент
        assertEquals(7, numbers.get(0));//почвилсь ли на месте удаленной 10  первой (индекс 0) теперь 7
        assertEquals(10, numbers.get(numbers.size() - 2));
//        assertEquals();
//        assertEquals(-1,numbers.indexOf(10));
//        //negativ szenerien
//        assertFalse(numbers.remove());
//        assertFalse(numbers.remove());
        //      assertFalse(numbers.remove());

    }

    @Test
    public void testContains() {
        assertTrue(numbers.contains(10));//то что есть
        assertFalse(numbers.contains(101));//то чего нет
        assertFalse(numbers.contains(null));//если зашел null
    }

    @Test
    public void testToArray() {
        Object[] expectedNumbers = {10, 7, 11, -2, 13, 10, 2000};
        Object[] expectedStrings = {"abc", "lmn", "fg", "abc"};
//        assertArrayEquals(expectedNumbers, numbers.toAray());
//        assertArrayEquals(expectedNumbers, numbers.toAray());
    }

    @Test
    public void testClear() {
        numbers.clear();
        assertEquals(0, numbers.size());
        strings.clear();
        assertEquals(0, strings.size());
    }


    //проверяем итерабельнсть
    @Test
    public void testIterable() {
        /*  Integer[] arNumbers = {10, 7, 11, -2, 13, 10, 2000};
       на базе этого массива мы создаем наш динамический массив
         */

        int index = 0;
        for (Object o : numbers) {
            assertEquals(arNumbers[index++], o);
        }
        assertEquals(arNumbers.length, index);
    }
}
