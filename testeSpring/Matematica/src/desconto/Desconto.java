package desconto;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do produto : ");
        double valorOriginal = scan.nextDouble();

        System.out.println("Digite o valor do desconto");
        double desc = scan.nextDouble();

        double valorDesconto = valorOriginal * (desc / 100);
        double valorFinal = valorOriginal - valorDesconto;

        System.out.printf("Desconto : R$ %.2F\n" + valorDesconto);

        System.out.printf("Valor final : R% %.2F\n" + valorFinal);
    }
}

