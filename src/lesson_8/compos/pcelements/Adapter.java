package lesson_8.compos.pcelements;

public class Adapter {
    private final String model;
    private final String voltage;

    public Adapter(String model, String voltage) {
        this.model = model;
        this.voltage = voltage;
    }

    @Override
    public String toString() {
        return "Adapter:\n" +
                "\t\tModel = " + this.model + "\n" +
                "\t\tVoltage = " + this.voltage;
    }
}