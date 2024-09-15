import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int senha = lerSenha("Digite a senha: ");

        while (!verificarSenha(senha)) {
            System.out.println("Senha incorreta. Tente novamente.");
            senha = lerSenha("Digite a senha: ");
        }
        System.out.println("Acesso permitido.");
    }

    private static int lerSenha(String mensagem) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensagem);
        int senha;

        while (true) {
            try {
                senha = sc.nextInt();
                break;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Apenas numeros inteiros.");
                sc.next();
            }
        }
        return senha;
    }

    private static boolean verificarSenha(int senha) {
        final int SENHA_CORRETA = 2002;
        return senha == SENHA_CORRETA;
    }
}
