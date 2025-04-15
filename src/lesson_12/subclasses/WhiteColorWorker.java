package lesson_12.subclasses;

public class WhiteColorWorker extends Person implements WhiteColorWorkerDuties{
    public WhiteColorWorker(String name, String surname, int age, String position, long mobilePhone) {
        super(name, surname, age, position, mobilePhone);
    }

    @Override
    public void getReport() {
        // CODE
    }

    @Override
    public void sendMail() {
        // CODE
    }
}