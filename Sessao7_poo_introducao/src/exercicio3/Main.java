package exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

        System.out.println("Final Grade = " + aluno.calcularMedia());
        if (aluno.testeAprovado()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("Faltam %.2f pontos para ser aprovado.%n", aluno.pontosFaltando());
        }
    }
}
