package lesson_8.inher;

public class Lion extends Animal{
    public Lion(String animalName, String animalType, String animalColor,
                double animalWeight, String animalSex, int animalAge) {
        super(animalName, animalType, animalColor, animalWeight, animalSex, animalAge);
    }

    @Override
    public String run() {
        return "30 KM per HOUR.";
    }

    @Override
    public String voice() {
        return "ROARS!";
    }
}