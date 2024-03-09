/*
@Author ("Joao Marcos Teles Silva CB3026787")
15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$).
*/

import java.util.Scanner;

public class TP01Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.println("Digite a quantidade de dólares: ");
        double quantidadeDolares = scanner.nextDouble();

        double valorEmReais = converterDolaresParaReais(quantidadeDolares, cotacaoDolar);

        System.out.println("O valor correspondente em Reais é: R$" + valorEmReais);

        scanner.close();
    }

    private static double converterDolaresParaReais(double quantidadeDolares, double cotacaoDolar) {
        return quantidadeDolares * cotacaoDolar;
    }
}