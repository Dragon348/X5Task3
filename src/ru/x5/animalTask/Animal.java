package ru.x5.animalTask;

public class Animal {
    protected String food;
    protected String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void makeNoise() {
        System.out.println("Животное спит");
    }

    public void eat() {
        System.out.println("Животное тихо ест");
    }

    public void sleep() {
        System.out.println("Животное мирно спит");
    }
}
