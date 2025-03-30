package hometasks.lesson7.phone;

class Phone {
    int number;
    String model;
    int weight;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void displayInfo() {
        System.out.println(number + "\t" + model + "\t" + weight);
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
            }
    public void receiveCall(String name, int number) {
        System.out.println("Who calls: " + name + " from : " + number);
    }
    public int getNumber() {
        return number;
    }
    public void sendMessage(int... numbers) {
        System.out.print("Message sent: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
