package hometasks.lesson7.phone;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone phoneOne = new Phone(1234567, "iPhone", 200);
        Phone phoneTwo = new Phone(2345678, "Google", 210);
        Phone phoneThree = new Phone (3456789,"Samsung", 190);
        System.out.println("Number \t" + "Model \t" + "Weight \t");
        phoneOne.displayInfo();
        phoneTwo.displayInfo();
        phoneThree.displayInfo();
        phoneOne.receiveCall("Matvej", 1357902);
        phoneTwo.receiveCall("Archil", 9876543);
        System.out.println("First phone number : " + phoneOne.getNumber());
        System.out.println("Second phone number : " + phoneTwo.getNumber());
    }
}
