package MyString.test;

import MyString.MyString;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyStringTest {
    MyString ms = new MyString("Hello");
    char[] ex = {'H', 'e', 'l', 'l', 'o'};

    //проверка итератора
    @Test
    public void test() {
        assertEquals(ms.getStrB().length(), ex.length);
        int count = 0;
        for (char c : ms) {
            assertEquals(ex[count++], c);
        }

    }
}
