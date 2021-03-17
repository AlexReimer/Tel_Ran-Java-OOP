public class WrapperAppl {

         /*
        Классы обертки
        byte - Byte
        short - Short
        int - Integer
        long - Long
        float - Float
        double - Double
        char - Character
        boolean - Boolean
         */


    public static void main(String[] args) {
        int x = 10;

        Integer a = 6; //создание объекта без new - автоупаковка

        System.out.println(a + 10); //автораспаковка
        System.out.println(a > 10);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        String str = "1234";
        System.out.println(str + 10);
        //parsing -> String to int
        x = Integer.parseInt(str); //"1234" -> 1234
        System.out.println(x + 10);
        //when white space or simbol . , parsing dosn't work
        str = "12 34";
        x = Integer.parseInt(str);
        //==========================
        Long b = 12L;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        //parsing -> String to long
        Long c = Long.parseLong("38742072");
        System.out.println(c - 38742072);
        //==========================
        Double d = 3.14;
        System.out.println(Double.MAX_VALUE);
        double d2 = Double.parseDouble("12.1");
        System.out.println(d2);
        //==========================
        boolean bo = Boolean.parseBoolean("True");//-> true
        System.out.println(bo);
        bo = Boolean.parseBoolean("TRUE");//-> true
        System.out.println(bo);
        bo = Boolean.parseBoolean("TrUe");//-> true
        System.out.println(bo);
        bo = Boolean.parseBoolean("true");//-> true
        System.out.println(bo);
        bo = Boolean.parseBoolean("True   ");//-> false
        System.out.println(bo);
        bo = Boolean.parseBoolean("Vasjy");//-> false
        System.out.println(bo);
        //==========================
        System.out.println(Character.isLetter('A'));//true
        System.out.println(Character.isLetter('1'));//false
        System.out.println(Character.isDigit('A'));//false
        System.out.println(Character.isDigit('1'));// true
        System.out.println(Character.isWhitespace(' '));

        /*
        Output
        16
        false
        2147483647
        -2147483648
        123410
        1244
         */

    }
}
