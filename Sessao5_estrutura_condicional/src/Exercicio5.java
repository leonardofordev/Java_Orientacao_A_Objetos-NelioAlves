import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        // Ler o código do item e a quantidade
        int codigo = lerValor("Digite o código do item: ");
        int quantidade = lerValor("Digite a quantidade: ");

        // Calcular o valor total a pagar
        double total = calcularValor(codigo, quantidade);

        // Exibir o total formatado
        System.out.printf("Total: R$ %.2f%n", total);
    }

    // Função para ler um valor inteiro
    private static int lerValor(String mensagem) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensagem);
        int valor;

        while (true) {
            try {
                valor = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Valor inválido, tente novamente.");
                sc.next(); // Limpa a entrada inválida
            }
        }
        return valor;
    }

    // Função para calcular o valor total com base no código e quantidade
    private static double calcularValor(int codigo, int quantidade) {
        double preco = 0.0;

        // Definir o preço com base no código do item
        switch (codigo) {
            case 1:
                preco = 4.00;
                break;
            case 2:
                preco = 4.50;
                break;
            case 3:
                preco = 5.00;
                break;
            case 4:
                preco = 2.00;
                break;
            case 5:
                preco = 1.50;
                break;
            default:
                System.out.println("Código inválido.");
                return 0.0; // Retorna 0 se o código for inválido
        }

        // Retorna o valor total (preço unitário * quantidade)
        return preco * quantidade;
    }
}
