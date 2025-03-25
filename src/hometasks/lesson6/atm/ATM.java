package hometasks.lesson6.atm;
import java.util.Scanner;
import java.util.Random;
public class ATM {
    public int banknoteOne;
    public int banknoteTwo;
    public int banknoteThree;

    public ATM (int banknoteOne, int banknoteTwo, int banknoteThree){
        this.banknoteOne = banknoteOne;
        this.banknoteTwo = banknoteTwo;
        this.banknoteThree = banknoteThree;
    }

}
//  2. Создать класс, описывающий банкомат.
//  Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100.
//  Сделать метод для добавления денег в банкомат.
//  Сделать функцию, снимающую деньги, которая принимает сумму денег,
//  а возвращает булевое значение - успешность выполнения операции.
//  При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.
//  Создать конструктор с тремя параметрами - количеством купюр каждого номинала.