import java.util.Scanner;

public class TP01Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = converterCelsiusParaFahrenheit(celsius);

        System.out.println("A temperatura equivalente em Fahrenheit é: " + fahrenheit + " °F");

        scanner.close();
    }

    private static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}