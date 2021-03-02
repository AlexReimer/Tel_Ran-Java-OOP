package start;

import calculator.Math;
import data.Fraction;

public class Main {

    public static void main(String[] args) {
        Fraction fr1 = new Fraction(3,5);
        System.out.println(fr1);
        Fraction fr2 = new Fraction(5, 8);
        Fraction result = Math.addition(fr1, fr2);
        System.out.println(result);

    }

}
