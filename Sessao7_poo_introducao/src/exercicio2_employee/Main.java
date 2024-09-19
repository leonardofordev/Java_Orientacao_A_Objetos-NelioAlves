package exercicio2_employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: ");
        String name = sc.next();
        System.out.println("Gross salary: ");
        double grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        double tax = sc.nextDouble();

        Employee emp = new Employee(name, grossSalary, tax);

        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.println("Which percentage to increase salary ? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + emp);
        sc.close();
    }
}
