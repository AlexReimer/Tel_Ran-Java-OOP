import org.junit.Test;
import static org.junit.Assert.*;

public class AnagramTest {
    private String word = "electricity";

    @Test
    public void isAnagramTestTrue() {
        assertTrue(Anagram.isAnagram(word , "electric"));
        assertTrue(Anagram.isAnagram(word , "tric"));
        assertTrue(Anagram.isAnagram(word , "city"));
        assertTrue(Anagram.isAnagram(word , "tet"));

    }


    @Test
    public void isAnagramTestFalse() {
        assertFalse(Anagram.isAnagram(word, " "));
        assertFalse(Anagram.isAnagram(word, "tron"));
        assertFalse(Anagram.isAnagram(word, "elect"));
        assertFalse(Anagram.isAnagram(word, "toc"));
        assertFalse(Anagram.isAnagram(word, "Tet"));
    }

    @Test
    public void isAnagram() {
    }
}