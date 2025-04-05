package hometasks.lesson8.Task2;

// 2. Создать классы "Директор", "Рабочий", "Бухгалтер".
// Реализовать интерфейс с методом, который печатает название должности и реализовать этот метод в созданные классы.

public class EmployeesRunner {
    public static void main(String[] args) {
        System.out.println("Here is list of job titles: ");
        Accountant accountant = new Accountant();
        Director director = new Director();
        Worker worker = new Worker();
        System.out.println(accountant.setEmployeeInfo());
        System.out.println(director.setEmployeeInfo());
        System.out.println(worker.setEmployeeInfo());
    }
}
