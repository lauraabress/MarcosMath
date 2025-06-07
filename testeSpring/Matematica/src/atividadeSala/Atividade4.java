package atividadeSala;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("quantos produtos foram vendidos nos ultimos meses : ");
        int qtsProd = scan.nextInt();
        System.out.printf("A media de produtos vendidos nos ultimos 6 meses = %.2f",media(qtsProd), " mensais");
    }

    private static double media(int qtdProd) {
        return (qtdProd / 6);
    }
}
