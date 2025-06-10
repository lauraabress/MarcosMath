package atividadeSala;

import static atividadeSala.Atividade6.scan;

public class Atividade9 {
    public static void main(String[] args) {
    int qtdPessoas = Integer.parseInt(lerString("Quantas pessoas : "));
    double valor = Double.parseDouble(lerString("Qual o valor final do produto"));

        System.out.printf("Valor individual com a taxa da gorgeta : %.2f",calcValorFinal(valor,qtdPessoas));
    }

    private static String lerString(String txt){
    System.out.println(txt);
    return scan.nextLine();
}

    private static double calcValorFinal(double valorProduto, int qtdPessoas){
        return 1.10*(valorProduto/qtdPessoas);
    }

}
