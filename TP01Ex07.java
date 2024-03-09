/*
@Author ("Joao Marcos Teles Silva CB3026787")
7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados.
*/

import java.util.Scanner;

public class TP01Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        double mediaGeometrica = calcularMediaGeometrica(valor1, valor2);

        System.out.println("A média geométrica dos valores é: " + mediaGeometrica);

        scanner.close();
    }

    private static double calcularMediaGeometrica(double valor1, double valor2) {
        return Math.sqrt(valor1 * valor2);
    }
}