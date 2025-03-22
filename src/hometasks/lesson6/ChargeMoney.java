package hometasks.lesson6;

import java.util.Scanner;

public class ChargeMoney {
    public static void main(String[] args) {
        chargeMoney();
        withdrawMoney();
    }

    public static void chargeMoney() {

        CreditCard cardOne = new CreditCard();
        cardOne.accountBalance = 1000;
        cardOne.accountNumber = 1234_5678_9876_4321L;
        System.out.println("Please insert amount on which we will charge bank card: ");
        Scanner sc = new Scanner(System.in);
        cardOne.transaction = sc.nextInt();
        if (cardOne.transaction > 0) {
            cardOne.accountBalance += cardOne.transaction;
        } else if (cardOne.transaction < 0) {
            System.out.println("We can't proceed with negative or zero transaction");
        }
        CreditCard cardTwo = new CreditCard();
        cardTwo.accountBalance = 1000;
        cardTwo.accountNumber = 1211_2222_3336_4345L;
        System.out.println("Please insert amount on which we will charge bank card: ");
        Scanner scan = new Scanner(System.in);
        cardTwo.transaction = scan.nextInt();
        if (cardTwo.transaction > 0) {
            cardTwo.accountBalance += cardTwo.transaction;
        } else if (cardTwo.transaction < 0) {
            System.out.println("We can't proceed with negative or zero transaction.");
        }
        System.out.println("Balance for card " + cardOne.accountNumber + " is " + cardOne.accountBalance);
        System.out.println("Balance for card " + cardTwo.accountNumber + " is " + cardTwo.accountBalance);
    }

    public static void withdrawMoney() {
        CreditCard cardThree = new CreditCard();
        cardThree.accountBalance = 1000;
        cardThree.accountNumber = 1211_2222_3336_4345L;
        System.out.println("Please insert amount on which we will withdraw bank card: ");
        Scanner sc = new Scanner(System.in);
        cardThree.transaction = sc.nextInt();
        if (cardThree.accountBalance >= cardThree.transaction) {
            cardThree.accountBalance -= cardThree.transaction;
        } else if (cardThree.accountBalance < cardThree.transaction) {
            System.out.println("We can't proceed with negative or zero transaction.");
        }
        System.out.println("Balance for card " + cardThree.accountNumber + " is " + cardThree.accountBalance);
    }

}
