package start;


import data.Fraction;
import dao.Math;

public class StartApp {
    public static void main(String[] args) {
        Fraction fr1 = new Fraction(27, 50);
        Fraction fr2 = new Fraction(23, 50);

        //Ожидаю 1

        Fraction frResult = Math.addition(fr1, fr2);
        System.out.println(frResult);
    }
}
