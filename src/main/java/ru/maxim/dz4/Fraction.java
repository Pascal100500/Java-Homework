package ru.maxim.dz4;

public class Fraction {
    private int numerator;
    private int denominator;

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            System.out.println("Знаменатель не может быть равен 0. Установлено значение 1.");
            this.denominator = 1;
        } else {
            this.denominator = denominator;
        }
    }

    public int getDenominator() {
        return this.denominator;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        setDenominator(denominator);
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    public Fraction add(Fraction other) {
        int  additionNumerator = (numerator * other.denominator) + (denominator * other.numerator);
        int additionDenominator = (denominator * other.denominator);
        return new Fraction(additionNumerator, additionDenominator);
    }

    public Fraction add(int number) {
        int  additionNumerator = numerator + (denominator * number);
        int additionDenominator = denominator;
        return new Fraction(additionNumerator, additionDenominator);
    }
}
