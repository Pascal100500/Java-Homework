package ru.maxim.dz2;

import java.util.Scanner;

public class Auto {
    private String name;
    private String manufacturer;
    private int year;
    private double engineDisplacement;

    public Auto(String name,String manufacturer, int year, double engineDisplacement) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineDisplacement = engineDisplacement;
        }

    public Auto(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public Auto() {
    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return this.year;
    }

    public void setEngineDisplacement(double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }
    public double getEngineDisplacement() {
        return this.engineDisplacement;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название автомобиля:");
        this.name = scanner.nextLine();

        System.out.println("Введите производителя:");
        this.manufacturer = scanner.nextLine();

        System.out.println("Введите год выпуска:");
        this.year = scanner.nextInt();

        System.out.println("Введите объем двигателя:");
        this.engineDisplacement = scanner.nextDouble();
    }

    public void printData() {
        System.out.println("Название: " + name);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Год выпуска: " + year);
        System.out.println("Объем двигателя: " + engineDisplacement + " л");
    }

    public void printData(String prefix) {
        System.out.println(prefix);
        printData();
    }
}
