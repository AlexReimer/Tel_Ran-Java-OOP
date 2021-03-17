import org.junit.Test;

import static org.junit.Assert.*;

public class StringPracticeTest {

    @Test
    public void testGetStringReverse() {
        assertEquals("amaM", StringPractice.getStrReverse3("Mama"));
        assertEquals("amam", StringPractice.getStrReverse3("mama"));
        assertEquals("	amaM", StringPractice.getStrReverse3("Mama	"));
        //===========================Negative==========================
        assertNull(StringPractice.getStrReverse3(""));
        assertNull(StringPractice.getStrReverse3("			"));
        assertNull(StringPractice.getStrReverse3(null));
    }

    @Test
    public void testGetCountWords() {
        String input = "Two beer or not two beer Sheiks Beer";
        String word = "beer";
        assertEquals(2,(int)StringPractice.getCountWords(input, word));
        assertEquals(1, (int)StringPractice.getCountWords(input, "Beer"));
        assertEquals(0,(int)StringPractice.getCountWords(input, "Hello"));
        assertEquals(2, (int)StringPractice.getCountWords(input, " beer"));
        //==============================================================
        assertEquals(null, StringPractice.getCountWords(input, null));
        assertEquals(null, StringPractice.getCountWords(null, "beer"));
        assertEquals(null, StringPractice.getCountWords(null, null));
        assertEquals(null, StringPractice.getCountWords("", "beer"));
        assertEquals(null, StringPractice.getCountWords(input, ""));
        assertEquals(null, StringPractice.getCountWords("", ""));
        assertEquals(null, StringPractice.getCountWords("		", "beer"));
        assertEquals(null, StringPractice.getCountWords(input, "    "));
        assertEquals(null, StringPractice.getCountWords("	", "		"));
    }


}