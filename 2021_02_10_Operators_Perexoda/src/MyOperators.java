public class MyOperators {
    public static void main(String[] args) {
        //go to; break; return; continue;
        // go to - это не оператор, а зарирвированное слово
        // break - прекращает цикл в for и в swich
        //return - возврат
        //

        introContinue ();


    }

    private static void introContinue() {
        // continue говорит циклу перейти к слудующему i не выходя из цикла
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i %2== 0) {
                continue;
            }
            System.out.println();
        }
    }


}
