package Atividade_18_10;

import java.util.Scanner;

public class Exercicio90 {
    public static void main(String[] args) {
        Exercicio90();
    }
    public static void Exercicio90(){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Insira os números: ");
            numeros[i] = scanner.nextInt();
        }

        int quantidadeOcorrencias = 0;

        System.out.println("Insira mais um número: ");
        int numeroBuscado = scanner.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeroBuscado == numeros[i]) {
                quantidadeOcorrencias++;
            }
        }

        System.out.println("A quantidade de vezes em que o número digitado aparece no array é: " + quantidadeOcorrencias);
    }
}
