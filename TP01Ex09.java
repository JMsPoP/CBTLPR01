/*
@Author ("Joao Marcos Teles Silva CB3026787")
9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
*/

import java.util.Scanner;

public class TP01Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da resistência (em ohms): ");
        double resistencia = scanner.nextDouble();

        System.out.println("Digite o valor da corrente elétrica (em amperes): ");
        double correnteEletrica = scanner.nextDouble();

        double tensao = calcularTensao(resistencia, correnteEletrica);

        System.out.println("A tensão no circuito é: " + tensao + " volts.");

        scanner.close();
    }

    private static double calcularTensao(double resistencia, double correnteEletrica) {
        return resistencia * correnteEletrica;
    }
}