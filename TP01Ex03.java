/*
@Author ("Joao Marcos Teles Silva CB3026787")
3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.
*/

import java.util.Scanner;

public class TP01Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a diagonal do quadrado: ");
        double diagonal = scanner.nextDouble();

        double area = calcularAreaQuadradoDiagonal(diagonal);

        System.out.println("A área do quadrado é: " + area);

        scanner.close();
    }

    private static double calcularAreaQuadradoDiagonal(double diagonal) {
        return Math.pow(diagonal, 2) / 2;
    }
}