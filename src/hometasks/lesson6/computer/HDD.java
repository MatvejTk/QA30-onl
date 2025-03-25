package hometasks.lesson6.computer;

public class HDD {
    private String model;
    private String type;
    private double capacity;

    public HDD(String model, String type, double capacity) {
        this.model = model;
        this.type = type;
        this.capacity = capacity;
    }
    public HDD() {
    }
      @Override
    public String toString() {
        return "HDD:\n" +
                "\t\tModel = " + this.model + "\n" +
                "\t\tType = " + this.type + "\n" +
                "\t\tCapacity = " + this.capacity;
    }
}
