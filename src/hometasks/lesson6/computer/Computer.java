package hometasks.lesson6.computer;

public class Computer {
    private final double cost;
    private final String model;
    private final HDD hdd;
    private final RAM ram;


    public Computer(double cost, String model, HDD hdd, RAM ram) {
        this.cost = cost;
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
    }

    public Computer(double cost, String model) {
        this.cost = cost;
        this.model = model;
        this.hdd = new HDD();
        this.ram = new RAM();
    }

    @Override
    public String toString() {
        return "Computer information:\n" +
                "\t Price "  + this.cost + "\n" +
                "\t Model " + this.model + "\n" +
                "\t" + this.hdd + "\n" +
                "\t" + this.ram;
    }
}


