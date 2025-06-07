package atividadeSala;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o valor do emprestimo : ");
        double valor = scan.nextDouble();
        System.out.println("Quantos meses");
        int meses = scan.nextInt();
        System.out.println("Qual a taxa mensal de juros : ");
        int taxaMensal = scan.nextInt();
        double taxaTotal = jurosTotal(meses,taxaMensal);

        System.out.println("Juros : "+taxaTotal+"\nValor dos juros : " + (valorTotal(taxaTotal,valor) - valor) + "\nValor total com juros :" + valorTotal(taxaTotal,valor));
    }

    public static double jurosTotal(int meses, int taxa) {
        return taxa * meses;
    }
     public static double valorTotal(double taxaTotal, double valor){
        return valor*(1+taxaTotal/100);
    }
}
