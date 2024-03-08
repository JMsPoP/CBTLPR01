/*
@Author ("Joao Marcos Teles Silva CB3026787")
16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos.
*/

import java.util.Scanner;

public class TP01Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do ângulo em graus: ");
        double anguloGraus = scanner.nextDouble();

        double anguloRadianos = Math.toRadians(anguloGraus);

        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);
        double secante = 1.0 / Math.cos(anguloRadianos);

        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Secante: " + secante);

        scanner.close();
    }
}