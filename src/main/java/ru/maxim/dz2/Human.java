package ru.maxim.dz2;

import java.util.UUID;

public class Human {

    private final UUID id;
    private String name;
    private String lastName;


    public Human(String name, String lastName) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.lastName = lastName;
    }

    public Human(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.lastName = "";
    }

    public UUID getId() {
        return id;
    }
    public void walk() {
        System.out.println("Ходит");
    }

    public void walk(String speed){
        System.out.println(speed);
    }
}
