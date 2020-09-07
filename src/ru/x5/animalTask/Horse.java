package ru.x5.animalTask;

public class Horse extends Animal {
    int horsePower;

    public Horse(String food, String loaction, int horsePower) {
        this.food = food;
        this.location = loaction;
        this.horsePower = horsePower;
    }

    @Override
    public void makeNoise() {
        System.out.println("Иго-го");
    }
}
