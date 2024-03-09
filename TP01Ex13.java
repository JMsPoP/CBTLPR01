/*
@Author ("Joao Marcos Teles Silva CB3026787")
13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
(em s) que serão digitados.
*/

import java.util.Scanner;

public class TP01Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a velocidade inicial em m/s: ");
        double velocidadeInicial = scanner.nextDouble();

        System.out.println("Digite a aceleração em m/s^2: ");
        double aceleracao = scanner.nextDouble();

        System.out.println("Digite o tempo de percurso em s: ");
        double tempo = scanner.nextDouble();

        double velocidadeFinal = calcularVelocidadeFinal(velocidadeInicial, aceleracao, tempo);

        System.out.println("A velocidade final do automóvel é: " + velocidadeFinal + " km/h");

        scanner.close();
    }

    private static double calcularVelocidadeFinal(double velocidadeInicial, double aceleracao, double tempo) {
        return (velocidadeInicial + aceleracao * tempo) * 3.6; // Convertendo m/s para km/h
    }
}