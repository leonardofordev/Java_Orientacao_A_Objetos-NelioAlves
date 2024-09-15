import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int codigo;

        // Solicitar o código até que seja inserido o número 4 (Fim)
        do {
            codigo = lerCodigo("Informe o código do combustível (1. Álcool, 2. Gasolina, 3. Diesel, 4. Fim): ");

            // Verificar qual tipo de combustível foi escolhido
            switch (codigo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    // Não faz nada, apenas encerra o programa
                    break;
                default:
                    System.out.println("Código inválido. Tente novamente.");
            }
        } while (codigo != 4);

        // Exibir resultado final
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }

    // Função para ler o código e garantir que seja um número inteiro
    private static int lerCodigo(String mensagem) {
        Scanner sc = new Scanner(System.in);
        int valor;

        while (true) {
            System.out.print(mensagem);
            try {
                valor = sc.nextInt();
                return valor; // Retorna o valor assim que for um inteiro válido
            } catch (Exception e) {
                System.out.println("Entrada inválida, tente novamente.");
                sc.next(); // Limpa a entrada inválida
            }
        }
    }
}
