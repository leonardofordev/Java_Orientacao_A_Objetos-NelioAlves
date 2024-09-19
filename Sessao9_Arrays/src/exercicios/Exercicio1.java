package exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qnt;
        while (true) {
            try {
                System.out.println("Quantos numeros você  vai digitar: ");
                qnt = sc.nextInt();
                if (qnt > 10) {
                    System.out.println("O numero maximo permitido eh 10.");
                    continue;
                }
                if (qnt <= 0) {
                    System.out.println("Digite um valor positivo.");
                    continue;
                }
                break;

            } catch (Exception e) {
                System.out.println("Valor invalido, tente novamente.");
                sc.next();
            }
        }

        int[] numeros = new int[qnt];

        for (int i = 0; i < qnt; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos: ");
        for (int i = 0; i < qnt; i++) {
            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }

        sc.close();
    }
}
