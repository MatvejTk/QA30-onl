package hometasks.lesson6.computer;

public class RAM {
    private String model;
    private int size;

    public RAM(String model, int size) {
        this.model = model;
        this.size = size;
    }
    public RAM() {

    }

    @Override
    public String toString() {
        return "RAM:\n" +
                "\t\tModel = " + this.model + "\n" +
                "\t\tSize = " + this.size;
    }
}
