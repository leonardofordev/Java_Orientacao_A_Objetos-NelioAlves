import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        // Ler a hora inicial e a hora final
        int horaInicial = lerValor("Digite a hora inicial: ");
        int horaFinal = lerValor("Digite a hora final: ");

        // Calcular a duração do jogo
        int duracao = calcularDuracao(horaInicial, horaFinal);

        // Exibir a duração
        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
    }

    // Função para ler um valor inteiro
    private static int lerValor(String mensagem) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensagem);
        int valor;

        while (true) {
            try {
                valor = sc.nextInt();
                // Verifica se a hora está no intervalo válido (0-23)
                if (valor >= 0 && valor <= 23) {
                    break;
                } else {
                    System.out.println("Hora inválida. Digite um valor entre 0 e 23.");
                }
            } catch (Exception e) {
                System.out.println("Valor inválido, tente novamente.");
                sc.next(); // Limpa a entrada inválida
            }
        }
        return valor;
    }

    // Função para calcular a duração do jogo
    private static int calcularDuracao(int inicio, int fim) {
        if (inicio == fim) {
            return 24; // Se a hora inicial for igual à hora final, o jogo durou 24 horas
        } else if (inicio < fim) {
            return fim - inicio; // Se a hora final for maior que a inicial, basta subtrair
        } else {
            return (24 - inicio) + fim; // Se a hora final for menor que a inicial, o jogo atravessou o dia
        }
    }
}
