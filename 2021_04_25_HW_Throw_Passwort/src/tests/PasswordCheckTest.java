package tests;

import org.junit.Test;
import static org.junit.Assert.*;

public class PasswordCheckTest {

    @Test
    public void rightPasswordTest() {
    }

    @Test
    public void wrongLengthTest() {
        //=================Positive=======================
        String str = "qhW5!m9c";
        assertEquals(8, str.length());
        //=================Negative=======================
       assertNotEquals(7,str.length());
       assertNotEquals(10,str.length());
    }


    @Test
    public void wrongSymbolTest() {
    }

    @Test
    public void wrongMissingSymbolTest() {
    }
}