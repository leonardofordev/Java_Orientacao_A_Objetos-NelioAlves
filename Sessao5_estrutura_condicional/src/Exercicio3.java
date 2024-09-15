import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int A = lerValores("Digite o primeiro valor: ");
        int B = lerValores("Digite o segundo valor: ");

        if (saoMultiplos(A, B)) {
            System.out.println("Sao multiplos.");
        } else {
            System.out.println("Nao sao multiplos.");
        }

    }

    private static int lerValores(String mensagem) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensagem);
        int valores;

        while (true) {
            try {
                valores = sc.nextInt();
                break;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Valor invalido, tente novamente.");
                sc.next();
            }
        }
        return valores;
    }

    private static boolean saoMultiplos(int a, int b) {
        return a % b == 0 || b % a == 0;
    }
}
