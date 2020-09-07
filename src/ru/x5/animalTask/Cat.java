package ru.x5.animalTask;

public class Cat extends Animal {
    boolean isWild;

    public Cat(String food, String loaction, boolean isWild) {
        this.food = food;
        this.location = loaction;
        this.isWild = isWild;
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу");
    }
}
