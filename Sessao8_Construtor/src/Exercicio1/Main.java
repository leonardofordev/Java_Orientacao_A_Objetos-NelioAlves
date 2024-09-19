package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int accounteNumber = sc.nextInt();

        System.out.println("Enter account holder: ");
        String holder = sc.next();

        System.out.println("Is there an inital deposit (y/n) ?");
        char option = sc.next().charAt(0);

        option = Character.toLowerCase(option);

        double initialDeposit = 0.0;

        if (option == 'y') {
            System.out.println("Enter initial deposit value: ");
            initialDeposit = sc.nextDouble();
        }

        Holder accountHolder = new Holder(holder, accounteNumber, initialDeposit);

        sc.close();
    }
}
