package atividadeSala;

import static atividadeSala.Atividade6.scan;

public class Atividade8 {
    public static void main(String[] args) {
        int op = 0;

        while (op != 4) {
            int valorProduto = Integer.parseInt(lerString("Qual o valor do produto : "));
            op = Integer.parseInt(lerString("Qual é o valor do desconto escolhido : " +
                    "\n1 - 10" +
                    "\n2 - 20" +
                    "\n3 - 30" +
                    "\n4 - Sair"));

            switch (op) {
                case 1:
                    msgFinal(10, valorProduto);
                    break;
                case 2:
                    msgFinal(20, valorProduto);
                    break;
                case 3:
                    msgFinal(30, valorProduto);
                    break;
                case 4:
                    System.out.println("Sistema finalizado");
                    break;

            }
        }
    }

    private static void msgFinal(int desc, double valorProduto) {
        System.out.println("Valor com desconto = " + calcDesconto(desc, valorProduto));
    }

    private static double calcDesconto(int valorDesc, double valor) {
        return valor * (1 - (valorDesc / 100));
    }

    private static String lerString(String txt) {
        System.out.println(txt);
        return scan.nextLine();
    }
}
