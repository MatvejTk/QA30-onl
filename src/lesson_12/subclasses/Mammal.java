package lesson_12.subclasses;

public abstract class Mammal extends Animal{
    public Mammal(String name, String animalType) {
        super(name, animalType);
    }

    protected abstract void getMammalNotification();
}