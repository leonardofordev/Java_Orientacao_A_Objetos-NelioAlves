import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        double raio = lerRaio(); // Lê o valor do raio
        double area = calcularArea(raio); // Calcula a área
        exibirArea(area); // Exibe a área com 4 casas decimais
    }

    // Método para ler o valor do raio
    private static double lerRaio() {
        Scanner sc = new Scanner(System.in);
        double raio;

        while (true) {
            System.out.print("Digite o valor do raio: ");
            try {
                raio = sc.nextDouble();
                if (raio >= 0) {
                    break; // Sai do loop se o valor for válido
                } else {
                    System.out.println("O valor do raio não pode ser negativo. Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Valor inválido, tente novamente.");
                sc.next(); // Limpa a entrada inválida
            }
        }
        return raio;
    }

    // Método para calcular a área do círculo
    private static double calcularArea(double raio) {
        final double PI = 3.14159; // Define o valor de π
        return PI * Math.pow(raio, 2); // Calcula a área (π * raio²)
    }

    // Método para exibir a área do círculo com 4 casas decimais
    private static void exibirArea(double area) {
        System.out.printf("Área = %.4f%n", area); // Formata a saída com 4 casas decimais
    }
}
