package ru.x5.animalTask;

public class Dog extends Animal {
    String barkType;

    public Dog(String food, String loaction, String barkType) {
        this.food = food;
        this.location = loaction;
        this.barkType = barkType;
    }

    @Override
    public void makeNoise() {
        System.out.println(barkType + "-" + barkType);
    }
}
