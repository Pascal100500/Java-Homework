package ru.maxim.test.models;

public class MenuItem {
    private String name;
    private String category;
    private double price;
    private int weight;
    private boolean isVegetarian;
    private int calories;


    public MenuItem(String name, String category, double price, int weight, boolean isVegetarian, int calories) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.weight = weight;
        this.isVegetarian = isVegetarian;
        this.calories = calories;

    }

    public void displayInfo() {
        System.out.println(
                "Название: " + this.name +
                        ", категория: " + this.category +
                        ", цена: " + this.price +
                        ", вес: " + this.weight +
                        ", вегетарианское: " + this.isVegetarian +
                        ", калории: " + this.calories
        );
    }

    public boolean isExpensive() {
        if (this.price > 500) {
            return true;
        } else {
            return false;
        }
    }
}

