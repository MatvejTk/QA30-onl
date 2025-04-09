package hometasks.lesson9.Task1;

import hometasks.lesson8.Task3.*;

import java.util.Date;

public class ExceptionsRunner extends Main {

    public static void main(String[] args) {

        try {
            SupplyContract supplyContract = new SupplyContract
                    ("1a2b0", new Date(), "Food", 100);
            EmployeeContract employeeContract = new EmployeeContract
                    ("a555", new Date(), new Date(), "John Doe");
            Invoice invoice = new Invoice
                    ("abc", new Date(), 1000, 1);

            reviewDocNumber(supplyContract.getDocNumber());
            reviewDocNumber(employeeContract.getDocNumber());
            reviewDocNumber(invoice.getDocNumber());

        }
        catch (Exception1a2b | ExceptionAbc | Exception555 exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void reviewDocNumber(String docNumber) throws Exception1a2b, Exception555, ExceptionAbc  {
        if (docNumber.endsWith("1a2b")) {
            throw new Exception1a2b("Document number ends with sequence '1a2b'");
        }
        if (docNumber.startsWith("555")) {
            throw new Exception555("Document number starts from sequence '555'");
        }
        if (docNumber.contains("abc")) {
            throw new ExceptionAbc("Document number contains sequence 'abc'");
        }
    }
}
// 1. Доработать нулевое домашнее задание предыдущего урока.
// Теперь надо создать свои классы исключений на каждую ситуацию:
// - Проверить содержит ли номер документа последовательность abc.
// - Проверить начинается ли номер документа с последовательности 555
// - Проверить заканчивается ли номер документа на последовательность 1a2b.
// Если номер документа не удовлетворяет условию - то "бросить" исключение.
// В методе класса, в котором будут вызываться эти методы для демонстрации работы,
// перехватить исключение конструкцией try-catch и в блоке catch вывести сообщение на консоль для пользователя