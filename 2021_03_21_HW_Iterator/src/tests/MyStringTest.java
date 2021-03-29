package tests;

import items.MyString;
import iterators.MyReverseIterator;
import iterators.MyStringIterator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class MyStringTest {
    String str = "Hello";
    MyString myStr = new MyString(str);
    char[] exAscChar = {'H', 'e', 'l', 'l', 'o'};
    char[] exRevChar = {'o', 'l', 'l', 'e', 'H'};

    @Test
    public void testIterable() {
        int index = 0;
        //поэлементная проверка
        for (char ch : myStr) {
            Assertions.assertEquals(exAscChar[index++], ch);
        }
        //тест если стринг зайдет меньше  чем ожидается
        assertEquals(exAscChar.length, index);
    }

    @Test
    //проверка итератора
    public void testAscIterator() {
        MyStringIterator ascIter = new MyStringIterator(myStr.getLetters());
        int index = 0;
        while (ascIter.hasNext()) {
            assertEquals(exAscChar[index++], (char) ascIter.next());
        }
        //тест если стринг пришедший менбше зайдет чем ожидается
        assertEquals(exAscChar.length, index);
    }


    //проверка реверс-итератора
    public void testRevIterator() {
        MyReverseIterator revIter = new MyReverseIterator(myStr.getLetters());
        int index = 0;
        while (revIter.hasNext()) {
            assertEquals(exRevChar[index++], (char) revIter.next());
        }
        assertEquals(exRevChar.length, index);
    }
}
