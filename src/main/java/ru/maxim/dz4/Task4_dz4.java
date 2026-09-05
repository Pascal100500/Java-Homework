package ru.maxim.dz4;

public class Task4_dz4 {
    public static void main(String[] args) {
        Fraction fr1 = new Fraction(3, 5);
        System.out.println(fr1.getDenominator());
        fr1.print();

        Fraction fr2 = new Fraction(3, 0);
        fr2.print();
        Fraction result1 = fr1.add(fr2);
        Fraction result2 = fr1.add(2);
        result1.print();
        result2.print();
    }

}
