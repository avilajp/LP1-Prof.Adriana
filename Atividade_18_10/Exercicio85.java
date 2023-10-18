package Atividade_18_10;

import java.util.Scanner;

public class Exercicio85 {
    public static void main(String[] args) {
        Exercicio85();
    }
    public static void Exercicio85(){
        Scanner scanner = new Scanner(System.in);

        int[] temperaturasAnuais = new int[3];

        lerTemperaturasDiarias(temperaturasAnuais, scanner);

        int menorTemperatura = encontrarMenorTemperatura(temperaturasAnuais);
        int maiorTemperatura = encontrarMaiorTemperatura(temperaturasAnuais);
        double mediaAnual = calcularTemperaturaMediaAnual(temperaturasAnuais);
        int diasAbaixoMedia = contarDiasAbaixoDaMedia(temperaturasAnuais, mediaAnual);

        exibirResultados(menorTemperatura, maiorTemperatura, mediaAnual, diasAbaixoMedia);
    }
    public static void lerTemperaturasDiarias(int[] temperaturas, Scanner scanner) {
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Insira a temperatura média do dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextInt();
        }
    }

    public static int encontrarMenorTemperatura(int[] temperaturas) {
        int menorTemp = temperaturas[0];
        for (int temp : temperaturas) {
            if (temp < menorTemp) {
                menorTemp = temp;
            }
        }
        return menorTemp;
    }

    public static int encontrarMaiorTemperatura(int[] temperaturas) {
        int maiorTemp = temperaturas[0];
        for (int temp : temperaturas) {
            if (temp > maiorTemp) {
                maiorTemp = temp;
            }
        }
        return maiorTemp;
    }

    public static double calcularTemperaturaMediaAnual(int[] temperaturas) {
        int somaTemperaturas = 0;
        for (int temp : temperaturas) {
            somaTemperaturas += temp;
        }
        return (double) somaTemperaturas / temperaturas.length;
    }

    public static int contarDiasAbaixoDaMedia(int[] temperaturas, double media) {
        int diasAbaixoMedia = 0;
        for (int temp : temperaturas) {
            if (temp < media) {
                diasAbaixoMedia++;
            }
        }
        return diasAbaixoMedia;
    }

    public static void exibirResultados(int menorTemp, int maiorTemp, double media, int diasAbaixoMedia) {
        System.out.println("Menor temperatura do ano: " + menorTemp);
        System.out.println("Maior temperatura do ano: " + maiorTemp);
        System.out.println("Temperatura média anual: " + media);
        System.out.println("Número de dias com temperatura abaixo da média anual: " + diasAbaixoMedia);
    }
}
