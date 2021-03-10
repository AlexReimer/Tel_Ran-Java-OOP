package calculator;

import data.Fraction;

public class Math {
    public static Fraction addition(Fraction a, Fraction b) {
        int cNumerator, cDenominator;
        //  знаменатель(cDenominator) = нок или leastCommonMultiple =
        // = leastCommonMultiple(a.getDenominator(), b.getDenominator());

        // числитель равен  а.числитель * cDenominator / а.деноманитор  +
        // + б.нумератор * cdenominator / b.denominator;
        cDenominator = leastCommonMultiple(a.getDenominator(), b.getDenominator());
        cNumerator = a.getNumerator() * cDenominator / a.getDenominator()
                + b.getNumerator() * cDenominator / b.getDenominator();
        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }

    public static int gcdRecursionAlgorithm(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursionAlgorithm(b, a % b);
    }

    // нахождение НОК
    public static int leastCommonMultiple(int a, int b) {
        return a / gcdRecursionAlgorithm(a, b) * b;
    }

}
