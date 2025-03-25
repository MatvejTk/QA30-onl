package hometasks.lesson6.computer;

public class ComputerStart {
    public static void main(String[] args) {
        getPCInfo();
        getPCInfoBasic();
    }
    public static void getPCInfo() {
        HDD hdd = new HDD("Samsung", "external", 1024);
        RAM ram = new RAM("Hynix", 16);
        Computer myPC = new Computer(999, "Lenovo", hdd, ram);
        System.out.println("This is detailed info about your computer \n" + myPC);
    }
    public static void getPCInfoBasic() {
        Computer newPC = new Computer(999, "Lenovo");
        System.out.println("This is info about price and model of your computer \n" + newPC);

    }
}