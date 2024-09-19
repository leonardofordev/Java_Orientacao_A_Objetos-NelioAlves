package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos serao digitados: ");
        int qnt;

        while (true) {
            try {
                qnt = sc.nextInt();
                if (qnt < 0) {
                    System.out.println("O valor nao pode ser negativo. ");
                    continue;
                }
                break;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Valor invalido, tente novamente.");
                sc.next();
            }
        }

        String[] nome = new String[qnt];
        double[] nota1 = new double[qnt];
        double[] nota2 = new double[qnt];

        for (int i = 0; i < qnt; i++) {
            System.out.printf("Dados da %d pessoa:%n", i + 1);
            nome[i] = sc.next();
            System.out.println("Digite a primeira nota: ");
            nota1[i] = sc.nextDouble();
            System.out.println("Digite a segunda nota: ");
            nota2[i] = sc.nextDouble();
        }
        sc.close();

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < qnt; i++) {
            double media = (nota1[i] + nota2[i]) / 2.0;
            if (media > 6.0) {
                System.out.println(nome[i]);
            }
        }
    }
}
