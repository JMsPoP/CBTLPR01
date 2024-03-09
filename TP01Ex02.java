/*
@Author ("Joao Marcos Teles Silva CB3026787")
2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
digitado.
*/

import java.util.Scanner;

public class TP01Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = calcularAreaQuadrado(lado);

        System.out.println("A área do quadrado é: " + area);

        scanner.close();
    }

    private static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }
}