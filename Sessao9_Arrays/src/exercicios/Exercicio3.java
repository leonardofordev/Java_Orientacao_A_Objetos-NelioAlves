package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qnt;

        System.out.println("Digite a quantidade de pessoas que serao digitadas: ");

        while (true) {
            try {
                qnt = sc.nextInt();
                if (qnt < 0) {
                    System.out.println("A quantidade nao pode ser negativa.");
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
        int[] idade = new int[qnt];
        double[] alturas = new double[qnt];

        for (int i = 0; i < qnt; i++) {
            System.out.printf("Dados da pessoa: %n ", i + 1);
            System.out.println("Digite o nome: ");
            nome[i] = sc.next();
            System.out.println("Digite a idade: ");
            idade[i] = sc.nextInt();
            System.out.println("Digite a altura em metros: ");
            alturas[i] = sc.nextDouble();
        }

        double somaAlturas = 0.0;
        for (int i = 0; i < qnt; i++) {
            somaAlturas += alturas[i];
        }

        double media = somaAlturas / qnt;

        int menoresDe16 = 0;
        for (int i = 0; i < qnt; i++) {
            if (idade[i] < 16) {
                menoresDe16++;
            }
        }

        double porcentagemMenores16 = ((double) menoresDe16 / qnt) * 100;

        System.out.printf("Altura média: %.2f%n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagemMenores16);

        for (int i = 0; i < qnt; i++) {
            if (idade[i] < 16) {
                System.out.println(nome[i]);
            }
        }

        sc.close();
    }
}
