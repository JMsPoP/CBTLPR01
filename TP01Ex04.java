/*
@Author ("Joao Marcos Teles Silva CB3026787")
4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
*/

import java.util.Scanner;

public class TP01Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.println("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();

        double area = calcularAreaTriangulo(base, altura);

        System.out.println("A área do triângulo é: " + area);

        scanner.close();
    }

    private static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}