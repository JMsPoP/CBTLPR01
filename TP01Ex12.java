/*
@Author ("Joao Marcos Teles Silva CB3026787")
12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados.
*/

import java.util.Scanner;

public class TP01Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura do cone: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite o raio da base do cone: ");
        double raio = scanner.nextDouble();

        double volume = calcularVolumeCone(altura, raio);

        System.out.println("O volume do cone é: " + volume);

        scanner.close();
    }

    private static double calcularVolumeCone(double altura, double raio) {
        return (1.0 / 3.0) * Math.PI * Math.pow(raio, 2) * altura;
    }
}