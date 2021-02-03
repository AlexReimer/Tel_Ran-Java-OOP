public class Calculator {
    public static void main(String[] args) {
        System.out.println(addition(10, 5));;

    }
    //можно одно название метода при разынх типах данных или сигнатура разная
    // или количество вводимых параметров разное

    public static int addition (int a, int b) {
        return a +b;
    }

    public static double addtion (double a, double b) {
        return a+b;
    }

    public static String addition (String a, String b) {
        return a+b;
    }

    public static int addition (int a, double b) {
        return 0;
    }

    public static void addition (double a, int b) {

    }

    public static void addition (double a, int b, double c){

    }
}
