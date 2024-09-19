package exercicio1_rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura do retangulo: ");
        double largura = sc.nextDouble();

        System.out.println("Digite a altura do retangulo: ");
        double altura = sc.nextDouble();

        Rectangle rectangle = new Rectangle(largura, altura);

        System.out.printf("Área: %.2f%n", rectangle.area());
        System.out.printf("Perímetro: %.2f%n", rectangle.perimeter());
        System.out.printf("Diagonal: %.2f%n", rectangle.diagonal());
    }

}
