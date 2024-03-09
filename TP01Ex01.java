/*
@Author ("Joao Marcos Teles Silva CB3026787")
1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área.
*/

import java.util.Scanner;

public class TP01Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.println("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = calcularAreaRetangulo(base, altura);

        System.out.println("A área do retângulo é: " + area);

        scanner.close();
    }

    private static double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }
}