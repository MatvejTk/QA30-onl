package hometasks.lesson6.atm;
import java.util.Scanner;
public class ATM {

    public int banknote20;
    public int banknote50;
    public int banknote100;

    public ATM(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public void chargeMoney() {
        Scanner sc = new Scanner(System.in);
        banknote20 = sc.nextInt();
        System.out.println("Please, insert amount of money: ");
        banknote50 = sc.nextInt();
        System.out.println("Please, insert amount of money: ");
        banknote100 = sc.nextInt();
        System.out.println("Please, insert amount of money: ");
    }

    public boolean withdrawMoney() {
        boolean success = false;
        banknote20 = 0;
        banknote50 = 0;
        banknote100 = 0;

        return success;
    }
}


//  2. Создать класс, описывающий банкомат.
//  Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100.
//  Сделать метод для добавления денег в банкомат.
//  Сделать функцию, снимающую деньги, которая принимает сумму денег,
//  а возвращает булевое значение - успешность выполнения операции.
//  При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.
//  Создать конструктор с тремя параметрами - количеством купюр каждого номинала.