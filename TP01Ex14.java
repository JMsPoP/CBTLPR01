/*
@Author ("Joao Marcos Teles Silva CB3026787")
14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
digitados.
*/

import java.util.Scanner;

public class TP01Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio da esfera: ");
        double raioEsfera = scanner.nextDouble();

        System.out.println("Digite a aresta do cubo: ");
        double arestaCubo = scanner.nextDouble();

        double volumeLivre = calcularVolumeLivre(raioEsfera, arestaCubo);

        System.out.println("O volume livre do ambiente é: " + volumeLivre);

        scanner.close();
    }

    private static double calcularVolumeLivre(double raioEsfera, double arestaCubo) {
        double volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(raioEsfera, 3);
        double volumeCubo = Math.pow(arestaCubo, 3);
        return volumeCubo - volumeEsfera;
    }
}