package programacaoOrientadaObjeto.controller;

import programacaoOrientadaObjeto.model.ListaCompras;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuCompras {
    static ArrayList<ListaCompras> list = new ArrayList<ListaCompras>();

    public static void main(String[] args) {
        int op;
        do {
            op = getInt("\n1 - Cadastrar novo produto\n2- buscar por nome\n3 - Listar produtos que precisam de +10 compras\n4 - sair");

            switch (op) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    pesquisarNome();
                    break;
                case 3:
                    quantidade();
                    break;
            }
        } while (op != 4);
    }

    private static void quantidade() {
       String resp = "";
        for (ListaCompras prod : list){
            if(prod.qtd > 10 ){
                resp += "produto : "+ prod.nomeProduto + "\nQuantidade : "+ prod.qtd+"\n";
            }
        }
        exibirMsg(resp.trim() == "" ? "Não retornou nenhum produto" :resp );
    }

    private static void pesquisarNome() {
        String nome = getString("Qual o nome do produto : ");
        String resp = "";
        for (ListaCompras prod : list){
            if (prod.nomeProduto.equalsIgnoreCase(nome)){
                    resp += prod.qtd;
                    exibirMsg(resp);
                    return;
            }
        }
        resp = "Não achou o produto";
       exibirMsg(resp);


    }

    private static void cadastrar() {
        ListaCompras newList = new ListaCompras();
        newList.nomeProduto = getString("Qual o nome do produto : ");
        newList.qtd = getInt("Quantidade");
        if (newList.nomeProduto.trim().equals("") || newList.qtd <= 0) {
            exibirMsg("O nome esta vazio ou a quantidade é menor que 0");
        }
        list.add(newList);
    }

    static Scanner scan = new Scanner(System.in);

    public static int getInt(String msg) {
        System.out.println(msg);
        return Integer.parseInt(scan.nextLine());
    }

    public static double getDouble(String msg) {
        System.out.println(msg);
        return Double.parseDouble(scan.nextLine());
    }

    public static void exibirMsg(String msg) {
        System.out.println(msg);
    }

    public static String getString(String msg) {
        System.out.println(msg);
        return scan.nextLine();
    }
}
