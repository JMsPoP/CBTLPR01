/*
@Author ("Joao Marcos Teles Silva CB3026787")
17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
*/

import java.util.Scanner;

public class TP01Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        double x = scanner.nextDouble();

        System.out.println("Digite o valor de Y: ");
        double y = scanner.nextDouble();

        double resultado = calcularPotencia(x, y);

        System.out.println("X elevado a Y é: " + resultado);

        scanner.close();
    }

    private static double calcularPotencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}