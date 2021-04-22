import java.util.HashMap;

public class Anagram {
    public static boolean isAnagram(String word, String anagram) {
        if (word == null || anagram == null || word.isEmpty() || anagram.isEmpty()
                || anagram.length() > word.length())
            return false;
        char[] letters = word.toCharArray();

        HashMap<Character, Integer> res = new HashMap<>();
        //какие буквы есть и сколько раз каждая встречется
        for (Character ch : letters) {
            int count = res.getOrDefault(ch, 0);
            res.put(ch, count + 1);
        }
        char[] lettersAnagram = anagram.toCharArray();

        for (Character ch : lettersAnagram) {
            int count = res.getOrDefault(ch, 0);
            if (count == 0) return false;
            res.put(ch, count - 1);
            // res.replace(ch, count-1);
        }
        return true;

        class DemoBook {

        }
    }
}
