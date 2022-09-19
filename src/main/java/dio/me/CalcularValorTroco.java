package dio.me;

import java.util.Scanner;

public class CalcularValorTroco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double valorDoProduto;
        Double valorDaCedula;

        System.out.println("Digite o valor do produto: ");
        valorDoProduto = scanner.nextDouble();

        System.out.println("Insira o valor da cédula: ");
        valorDaCedula = scanner.nextDouble();

        double valorDoTotal = valorDaCedula - valorDoProduto;
        
        System.out.println("O troco do cliente é: " + valorDoTotal);


    }
}
