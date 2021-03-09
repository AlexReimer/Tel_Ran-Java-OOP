package data;

public class Fraction {
    private int numerator; // верхняя часть -> числитель
    private int denominator; // нижняя часть -> знаменатель

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return "data.Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}