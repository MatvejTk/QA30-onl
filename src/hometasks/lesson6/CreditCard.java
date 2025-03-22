package hometasks.lesson6;

import java.util.Scanner;

public class CreditCard {
    public long accountNumber;
    public double accountBalance;
    public long transaction;
    public void chargeMoney() {
        CreditCard card = new CreditCard();
        System.out.println("Please insert amount on which we will charge bank card: ");
        Scanner sc = new Scanner(System.in);
        transaction = sc.nextInt();
        if (accountBalance > transaction) {
            accountBalance += transaction;
            System.out.println("Your current balance is: " + accountBalance);
        } else if (card.transaction < 0) {
            System.out.println("Your balance can't be negative. Transaction declined");
        }
    }
    public void withdrawMoney(){
        if (transaction > accountBalance){
            System.out.println("Your account balance can't go in negative amount.");
            System.out.println("Operation declined");
        }
        else {
            accountBalance -= transaction;
            System.out.println("Transaction has completed successfully");
            System.out.println("Account balance has been updated");
        }
    }

    public void accountBalance(){
        System.out.println("Here are bank account balance for all your cards: " + accountBalance);
    }
}

//  Домашнее задание
//  Основное задание
//  1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//  Добавьте метод, который позволяет начислять сумму на кредитную карточку.
//  Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//  Добавьте метод, который выводит текущую информацию о карточке.
//  Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма

//  Тестовый сценарий для проверки:
//  Положите деньги на первые две карточки и снимите с третьей.
//  Выведите на экран текущее состояние всех трех карточек.

//  Дополнительное задание
//  1. Создать класс для описания компьютера, в этом классе должны быть поля: цена, модель(строковый тип), RAM и HDD.
//  Для полей RAM и HDD следует создать свои собственные классы.
//  Классы для RAM и HDD должны иметь конструктор по умолчанию и конструктор со всеми параметрами.
//  Класс RAM имеет поля "название" и "объем".
//  Класс HDD имеет поля "название", "объем" и "тип" (внешний или внутренний).
//  Класс Computer должен иметь два конструктора:
//  - первый - с параметрами стоимость и модель,
//  - второй - со всеми полями.
//  При создании объекта "компьютер" с помощью первого конструктора должны создаваться поля RAM и HDD с помощью конструкторов по
//умолчанию.
//  В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей и всех значений).
//  Тестовый сценарий для проверки:
//  создать объект "компьютер 1" с помощью первого конструктора и вывести информацию на экран;
//  создать объект "компьютер 2" с помощью второго конструктора и вывести информацию на экран.

//  2. Создать класс, описывающий банкомат.
//  Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100.
//  Сделать метод для добавления денег в банкомат.
//  Сделать функцию, снимающую деньги, которая принимает сумму денег,
//  а возвращает булевое значение - успешность выполнения операции.
//  При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.
//  Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
