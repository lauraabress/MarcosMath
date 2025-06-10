package Tarefas;

import java.util.Scanner;


public class Exercicio2 {

    static String[] marca = new String[100];
    static String[] placas = new String[100];
    static int[] ano = new int[100];
    static int cont = 0;

    public static void main(String[] args) {

        int idCarro = 0;
        int op = 0;

        while (op != 4) {
            op = menu();

            switch (op) {
                case 1:
                    cadastrar();
                    cont++;
                    break;
                case 2:
                    idCarro = carroMaisNovo();
                    exibirMsg("Marca : " + marca[idCarro] + "\nPlaca : " + placas[idCarro]);
                    break;
                case 3 :
                     idCarro = acharCarro((lerMsg("Qual a placa do carro : ")));
                    exibirMsg("Marca : " + marca[idCarro] + "\nAno : " + ano[idCarro]);

            }
        }


    }

    private static int acharCarro(String placa) {
        for (int i = 0 ; i < cont ; i++ ){
            if (placa.equalsIgnoreCase(placas[i])){
                return i;
            }
        }
        return 0;
    }

    private static int carroMaisNovo() {
        int maisNovo = 0;

        for (int i = 0; i < cont; i++) {
            if (ano[i] < maisNovo) {
                maisNovo = ano[i];
            }
        }
        return maisNovo;
    }

    private static void cadastrar() {
        marca[cont] = lerMsg("Qual o nome do carro : ");
        ano[cont] = Integer.parseInt(lerMsg("Qual a marca do carro : "));
        placas[cont] = lerMsg("Qual a placa");
    }

    public static int menu() {
        return Integer.parseInt(lerMsg("1 – Cadastrar Carro" +
                "\n2 – Verificar qual a marca e a placa do carro mais novo\n" +
                "\n3 – Buscar a marca e o ano por uma placa específica (o usuário irá informar a placa e o programa vai mostrar os dados caso encontre a respectiva placa)" +
                "\n4 - Sair"));
    }

    public static String lerMsg(String txt) {
        Scanner scan = new Scanner(System.in);
        System.out.println(txt);
        return scan.nextLine();

    }

    public static void exibirMsg(String msg) {
        System.out.println(msg);
    }
}
