package atividadeSala;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op = 1;

        while (op != 0) {
            System.out.println("Qual temperatura vai converter : \n" +
                    "1- Celsios - > Kelvin\n" +
                    "2- Kelvin - > Celsios\n" +
                    "3- Celsios - > Fahrenheit\n" +
                    "4- Fahrenheit - > Celsios\n" +
                    "0- Sair \n : ");
            op = scan.nextInt();
            switch (op) {
                case 1 ->
                        System.out.println("Valor Convertido para Kelvin : " + getCelsiosKelvin(lerTemp(scan, "Valor em Celsios :")));
                case 2 ->
                        System.out.println("Valor Convertido para Celsios : " + getKelvinCelsios(lerTemp(scan, "Valor em Kelvin :")));
                case 3 ->
                        System.out.println("Valor Convertido para Fahrenheit : " + getCelsiosFahrenheit(lerTemp(scan, "Valor em Celsios :")));
                case 4 ->
                        System.out.println("Valor Convertido Celsios : " + fahrenheitCelsios(lerTemp(scan, "Valor em Fahrenheit :")));
                default -> System.out.println("Numero inserido não está no menu ");
            }

        }

    }


    private static double getCelsiosFahrenheit(double temp) {
        return (temp * 9 / 5) + 32;
    }

    private static double fahrenheitCelsios(double temp) {
        return (temp - 32) * 5 / 9;
    }


    private static double getKelvinCelsios(double temp) {
        return (temp - 273.15);
    }


    private static double getCelsiosKelvin(double temp) {
        return temp + 273.15;
    }

    private static double lerTemp(Scanner scan, String txt) {
        System.out.println(txt);
        return scan.nextDouble();
    }
}
