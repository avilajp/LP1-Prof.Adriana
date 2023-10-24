package Atividade_18_10;

import java.util.Scanner;

public class Exercicio91 {
    public static void main(String[] args) {
        Exercicio91();
    }

    public static void Exercicio91() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Insira os números: ");
            numeros[i] = scanner.nextInt();
        }

        int quantidadeRepeticoes = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    quantidadeRepeticoes++;
                    System.out.println("O número: " + numeros[i] + " está repetido na posição: " + (i + 1) + " e na posição: " + (j + 1));
                }
            }
        }

        if (quantidadeRepeticoes == 0) {
            System.out.println("Nenhum número se repete no array.");
        } else {
            System.out.println("Foram encontradas " + quantidadeRepeticoes + " repetições no array.");
        }
    }
}
