package Atividade_18_10;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio89 {
    public static void main(String[] args) {
        Exercicio89();
    }
    public static void Exercicio89(){
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        int quantidadeIguais = 0;
        int mesmaPosicao = 0;

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Insira os números para o primeiro vetor: ");
            vetor1[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Insira os números para o segundo vetor: ");
            vetor2[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] == vetor2[i]) {
                quantidadeIguais++;
            }
        }

        System.out.println("Primeiro vetor: " + Arrays.toString(vetor1));
        System.out.println("Segundo vetor: " + Arrays.toString(vetor2));
        System.out.println("Quantidade de vezes em que os números são iguais e na mesma posição: " + quantidadeIguais);
    }
}
