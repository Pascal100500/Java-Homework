package ru.maxim.dz2;

public class Task1_dz2 {
    public static void main(String[] args) {

        Human man1 = new Human("Lev", "Tolstoi" );
        man1.walk();
        man1.walk("быстро блин");
        Human man2 = new Human("Ivan");
        System.out.println(man2.getId());
    }
}
