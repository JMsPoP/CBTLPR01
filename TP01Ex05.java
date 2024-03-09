/*
@Author ("Joao Marcos Teles Silva CB3026787")
5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado.
*/

import java.util.Scanner;

public class TP01Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o diâmetro da esfera: ");
        double diametro = scanner.nextDouble();

        double volume = calcularVolumeEsfera(diametro);

        System.out.println("O volume da esfera é: " + volume);

        scanner.close();
    }

    private static double calcularVolumeEsfera(double diametro) {
        double raio = diametro / 2;
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }
}