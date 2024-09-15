import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int numero1 = lerNumero("Digite o primeiro numero: ");
        int numero2 = lerNumero("Digite o segundo numero: ");
        int soma = calcularSoma(numero1, numero2);
        exibirSoma(soma);
    }

    private static int lerNumero(String mensagem) {
        Scanner sc = new Scanner(System.in);
        int numero;

        while (true) {
            try {
                numero = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Valor inválido, tente novamente.");
                sc.next();
            }
        }
        return numero;
    }

    private static int calcularSoma(int num1, int num2) {
        return num1 + num2;
    }

    private static void exibirSoma(int soma) {
        System.out.println("SOMA = " + soma);
    }

}