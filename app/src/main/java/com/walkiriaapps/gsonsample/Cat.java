package com.walkiriaapps.gsonsample;

import java.util.ArrayList;

public class Cat {
    private String name, color, breed;
    private ArrayList<String> vaccinations = new ArrayList<String>();
    private int age;

    public Cat(String name, String color, String breed, ArrayList<String> vaccinations, int age) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", vaccinations=" + vaccinations +
                ", age=" + age +
                '}';
    }
}
