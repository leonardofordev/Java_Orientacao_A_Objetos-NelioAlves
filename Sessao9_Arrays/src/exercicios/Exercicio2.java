package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qnt;
        while (true) {
            try {
                System.out.println("Quantos numeros você vai digitar: ");
                qnt = sc.nextInt();

                if (qnt < 0) {
                    System.out.println("A quantidade precisa ser positiva.");
                    continue;
                }
                break;

            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Valor invalido, tente novamente.");
                sc.next();
            }
        }
        double[] numeros = new double[qnt];
        double total = 0.0;

        for (int i = 0; i < qnt; i++) {
            System.out.println("Digite o numero: ");
            numeros[i] = sc.nextDouble();
            total += numeros[i];
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < qnt; i++) {
            System.out.printf("%.1f ", numeros[i]);
        }
        System.out.println();

        System.out.printf("SOMA = %.2f%n", total);

        double media = total / qnt;
        System.out.printf("MEDIA = %.2f%n", media);

        sc.close();
    }
}
