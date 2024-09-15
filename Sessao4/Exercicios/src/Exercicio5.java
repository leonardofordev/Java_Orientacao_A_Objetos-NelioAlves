import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoP1;
        int quantP1;
        double valorP1;

        int codigoP2;
        int quantP2;
        double valorP2;

        while (true) {
            try {
                codigoP1 = sc.nextInt();
                quantP1 = sc.nextInt();
                valorP1 = sc.nextDouble();

                codigoP2 = sc.nextInt();
                quantP2 = sc.nextInt();
                valorP2 = sc.nextDouble();

                if (codigoP1 < 0 || quantP1 < 0 || valorP1 < 0 || codigoP2 < 0 || quantP2 < 0 || valorP2 < 0) {
                    System.out.println("O valor nao pode ser negativo.");
                } else {
                    break;
                }

            } catch (Exception e) {
                System.out.println("Valor invalido tente novamente.");
                sc.next();
            }
        }
        sc.close();

        double calcularTotal = (quantP1 * valorP1) + (quantP2 * valorP2);

        System.out.printf("VALOR A PAGAR = R$ %.2f ", calcularTotal);
    }
}
