public class StringPractice {


    public static String getStrReverse(String str) {

        if (str == null || str.trim().isEmpty())
            return null;

        return new StringBuilder(str).reverse().toString();
    }

    public static String getStrReverse2(String str) {

        if (str == null || str.trim().isEmpty())
            return null;

        char[] chars = str.toCharArray();
        char temp;
        // i j temp = 'H' temp = 'e'
        // [H][e][l][l][o] ->[o][e][l][l][H] -> [o][l][l][e][H]
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }

    public static String getStrReverse3(String str) {
        if (str == null || str.trim().isEmpty())
            return null;

        String res = "";
        // "Hello" ""->"o"->"ol"->"oll"->"olle"->"olleH"
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i); // res = res + str.charAt(i);
        }
        return res;
    }

    public static int getCountWords(String input, String word) {
        if (input == null || word == null || input.trim().isEmpty() || word.trim().isEmpty())
            return -1;
        // "Two beer or not two beer Sheiks Beer"
        // [Two] [beer] [or] [not] [two] [beer] [Sheiks] [Beer]
        String[] strs = input.split(" ");
        int count = 0;
        word = word.trim();
        for (String s : strs) {
            if (s.equals(word))
                count++;
        }
        return count;
    }

}
