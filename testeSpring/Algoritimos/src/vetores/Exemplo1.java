package vetores;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int[] idade = new int[Integer.parseInt(lerMsg("Quantas pessoas deseja cadastrar : ", scan))];
        String[] nome = new String[idade.length];

        for (int i = 0; i < idade.length; i++) {

            nome[i] = lerMsg("Digite o nome do "+(i+1)+"° usuario",scan);
            idade[i] = Integer.parseInt(lerMsg("Digite a idade da "+nome[i]+" :",scan));
            soma += idade[i];
        }
        scan.close();
        mostrarMsg("A média das idades é : " + calcMedia(soma, idade.length));

    }

    public static String lerMsg(String txt, Scanner scan) {

        System.out.println(txt);
        return scan.nextLine();

    }

    public static double calcMedia(int soma, int qtd) {
        return (double) soma / qtd;
    }

    public static void mostrarMsg(String msg) {
        System.out.println(msg);
        ;
    }

}
