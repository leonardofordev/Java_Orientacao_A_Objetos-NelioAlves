import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int numero = lerValores("Digite o primeiro numero: ");

        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Imapr");
        }
    }

    private static int lerValores(String mensagem) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensagem);
        int valor;

        while (true) {

            try {
                valor = sc.nextInt();
                break;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Valor invalido, tente novamente.");
                sc.next();
            }

        }
        return valor;
    }
}