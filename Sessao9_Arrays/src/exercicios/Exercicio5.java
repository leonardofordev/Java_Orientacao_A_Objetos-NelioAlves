package exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar: ");
        int qnt;

        while (true) {
            try {
                qnt = sc.nextInt();
                if (qnt < 0) {
                    System.out.println("O valor nao pode ser negativo.");
                    continue;
                }
                break;

            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Valor invalido, tente novamente.");
                sc.next();
            }
        }

        int[] numeros = new int[qnt];
        int numerosPares = 0;

        System.out.println("Digite um numero: ");
        for (int i = 0; i < qnt; i++) {
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) {
                numerosPares++;
            }
        }

        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < qnt; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

        System.out.println("Quantidade de numeros pares: " + numerosPares);

        sc.close();
    }

}
