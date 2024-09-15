import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        double A = lerValor("Digite o valor de A: ");
        double B = lerValor("Digite o valor de B: ");
        double C = lerValor("Digite o valor de C: ");

        double triangulo = calcularAreaTriangulo(A, C);
        double circulo = calcularAreaCirculo(C);
        double trapezio = calcularAreaTrapezio(A, B, C);

        exibirDados(triangulo, circulo, trapezio);
    }

    private static double lerValor(String mensagem) {
        Scanner sc = new Scanner(System.in);
        double valor;

        while (true) {
            try {
                valor = sc.nextDouble();
                break;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Valor invalido, tente novamente.");
                sc.next();
            }
        }
        return valor;
    }

    private static double calcularAreaTriangulo(double a, double c) {
        return (a * c) / 2;
    }

    private static double calcularAreaCirculo(double c) {
        final double PI = 3.14159;
        return (PI * Math.pow(c, PI));
    }

    private static double calcularAreaTrapezio(double a, double b, double c) {
        return (a + b) * c;
    }

    private static void exibirDados(double triangulo, double circulo, double trapezio) {
        System.out.printf("Área do triângulo: %.2f%n", triangulo);
        System.out.printf("Área do círculo: %.2f%n", circulo);
        System.out.printf("Área do trapézio: %.2f%n", trapezio);
    }
}
