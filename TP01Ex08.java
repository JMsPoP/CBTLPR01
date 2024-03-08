import java.util.Scanner;

public class TP01Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de milhas marítimas: ");
        double milhasMaritimas = scanner.nextDouble();

        double quilometros = converterMilhasMaritimasParaQuilometros(milhasMaritimas);

        System.out.println(milhasMaritimas + " milhas marítimas equivalem a " + quilometros + " quilômetros.");

        scanner.close();
    }

    private static double converterMilhasMaritimasParaQuilometros(double milhasMaritimas) {
        final double MILHA_MARITIMA_EM_METROS = 1852;
        final double METROS_POR_QUILOMETRO = 1000;

        double metros = milhasMaritimas * MILHA_MARITIMA_EM_METROS;
        return metros / METROS_POR_QUILOMETRO;
    }
}