/*
@Author ("Joao Marcos Teles Silva CB3026787")
18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido.
*/

import java.util.Scanner;

public class TP01Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaProdutos = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o valor do produto " + i + ": ");
            double valorProduto = scanner.nextDouble();
            somaProdutos += valorProduto;
        }

        System.out.println("Digite o valor do pagamento: ");
        double valorPagamento = scanner.nextDouble();

        double troco = calcularTroco(somaProdutos, valorPagamento);

        System.out.println("O troco a ser devolvido é: " + troco);

        scanner.close();
    }

    private static double calcularTroco(double totalCompra, double valorPagamento) {
        return valorPagamento - totalCompra;
    }
}