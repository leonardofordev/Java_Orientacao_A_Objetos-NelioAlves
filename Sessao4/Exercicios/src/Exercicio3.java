import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int valorA = lerValor("Digite o valor de A:");
        int valorB = lerValor("Digite o valor de B:");
        int valorC = lerValor("Digite o valor de C: ");
        int valorD = lerValor("Digite o valor de D: ");

        int diferenca = calcularDiferenca(valorA, valorB, valorC, valorD);
        exibirResultado(diferenca);
    }

    private static int lerValor(String mensagem) {
        Scanner sc = new Scanner(System.in);
        int valor;

        while (true) {
            try {
                valor = sc.nextInt();
                break;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Valor invalido, tente novamente");
                sc.next();
            }
        }
        return valor;
    }

    private static int calcularDiferenca(int val1, int val2, int val3, int val4) {
        return (val1 * val2 - val3 * val4);
    }

    private static void exibirResultado(int dif) {
        System.out.println("Diferenca = " + dif);
    }

}
