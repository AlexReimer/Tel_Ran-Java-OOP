package reverse_str;

import org.junit.Test;
import reverse_str.StringReverse;

import static org.junit.Assert.*;

public class StringReverseTest {

    @Test
    public void reverseString() {
        assertEquals("olleH", new StringReverse().reversString("Hello"));
        assertEquals("54321", new StringReverse().reversString("12345"));
        assertNull(new StringReverse().reversString(null));
        assertNotEquals("olleH", new StringReverse().reversString(String.valueOf(3987439)));

    }
}