package Atividade_18_10;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio84 {
    public static void main(String[] args) {
        Exercicio84();
    }
    public static void Exercicio84(){
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        System.out.println("Insira o valor de N: ");
        n = scanner.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorSoma = new int[n];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Insira o valor " + (i + 1) + " do vetor A: ");
            vetorA[i] = scanner.nextInt();

            System.out.println("Insira o valor " + (i + 1) + " do vetor B: ");
            vetorB[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            vetorSoma[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("O vetor A: " + Arrays.toString(vetorA));
        System.out.println("O vetor B: " + Arrays.toString(vetorB));
        System.out.println("O vetor das somas de A e B: " + Arrays.toString(vetorSoma));
    }
}
