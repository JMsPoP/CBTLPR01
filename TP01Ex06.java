/*
@Author ("Joao Marcos Teles Silva CB3026787")
6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão
digitados.
*/

import java.util.Scanner;

public class TP01Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        System.out.println("Digite o quarto valor: ");
        double valor4 = scanner.nextDouble();

        double media = calcularMediaAritmetica(valor1, valor2, valor3, valor4);

        System.out.println("A média aritmética dos valores é: " + media);

        scanner.close();
    }

    private static double calcularMediaAritmetica(double valor1, double valor2, double valor3, double valor4) {
        return (valor1 + valor2 + valor3 + valor4) / 4;
    }
}