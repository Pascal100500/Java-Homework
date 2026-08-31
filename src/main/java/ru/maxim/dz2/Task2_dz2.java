package ru.maxim.dz2;

public class Task2_dz2 {
    public static void main(String[] args) {

        Auto auto1 = new Auto("Corolla", "Toyota", 1966, 1.4);
        auto1.printData();
        auto1.printData("Информация об автомобиле:");

        var auto2 = new Auto("CX5", "Mazda");
        auto2.printData();
        auto2.setYear(2017);
        auto2.setEngineDisplacement(2.0);

        System.out.println(auto2.getYear());
        System.out.println(auto2.getEngineDisplacement());
        auto2.printData();

        Auto auto3 = new Auto();
        auto3.inputData();
        auto3.printData();
    }
}
