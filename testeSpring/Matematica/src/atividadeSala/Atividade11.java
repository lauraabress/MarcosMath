package atividadeSala;

import static atividadeSala.Atividade6.scan;

public class Atividade11 {
    public static void main(String[] args) {

        double qtdPopulacao = lerDouble("Quantidade de pessoas hoje : ");

        for (int i = 0; i< 10 ; i++){
            qtdPopulacao = qtdPopulacao* 1.02;
        }
        System.out.printf("quantidade de pessoas daqui 10 anos : %.2f",qtdPopulacao);
    }

    private static double lerDouble(String txt){
        System.out.println(txt);
        return Double.parseDouble(scan.nextLine());
    }
}
