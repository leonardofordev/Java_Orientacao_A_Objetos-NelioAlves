import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qntFuncionarios;
        int horasTrabalhadas;
        double valorPorHora;

        while (true) {
            try {
                qntFuncionarios = sc.nextInt();
                horasTrabalhadas = sc.nextInt();
                valorPorHora = sc.nextDouble();

                break;
            } catch (Exception e) {
                System.out.println("Valor invalido, tente novamente.");
                sc.next();
            }
        }
        sc.close();

        double calcularSalario = horasTrabalhadas * valorPorHora;

        System.out.println("NUMBER = " + qntFuncionarios);
        System.out.println("SALARY = U$" + calcularSalario);
    }
}
