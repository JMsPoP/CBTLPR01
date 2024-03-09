/*
@Author ("Joao Marcos Teles Silva CB3026787")
11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
*/

import java.util.Scanner;

public class TP01Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o diâmetro do círculo: ");
        double diametro = scanner.nextDouble();

        double area = calcularAreaCirculo(diametro);

        System.out.println("A área do círculo é: " + area);

        scanner.close();
    }

    private static double calcularAreaCirculo(double diametro) {
        double raio = diametro / 2;
        return Math.PI * Math.pow(raio, 2);
    }
}