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