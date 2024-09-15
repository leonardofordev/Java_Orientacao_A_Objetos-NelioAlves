import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int numero = lerValores("Digite um numero: ");

        if (numero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }
    }

    private static int lerValores(String mesangem) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mesangem);
        int num;

        while (true) {
            try {
                num = sc.nextInt();
                break;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Valor invalido, tente novamente.");
                sc.next();
            }
        }
        return num;
    }

}