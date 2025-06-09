package atividadeSala;

import java.util.Scanner;

public class Atividade5 {
    //Autonomia de combustivel
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a autonomia do combustivel : ");
        double mediaKilometroLitro = scan.nextDouble();
        System.out.println("Qual a litragem do tanque do combustivel : ");
        double litragemTanque = scan.nextDouble();
        System.out.println("Qual a distância da viagem : ");
        double distancia = scan.nextDouble();

        System.out.printf("O veiculo tem uma autonomia de %.2f Km%n",autonomiaVeiculo(mediaKilometroLitro,litragemTanque));
        System.out.printf("\nO veiculo vai ter um consumo de gasolina da viagem de %.2f L%n",consumoViagem(mediaKilometroLitro,distancia));

    }

    public static double autonomiaVeiculo(double mediaKilometroLitro, double litragemTanque){
        return mediaKilometroLitro * litragemTanque;
    }

    public static double consumoViagem(double mediaKilometroLitro,double distancia){

        return  distancia/mediaKilometroLitro;
    }
}
