package Atividade_18_10;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio83 {
    public static void main(String[] args) {
        Exercicio83();
    }
    public static void Exercicio83(){
        int[] notas = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira os números: ");
            notas[i] = sc.nextInt();
        }

        for (int i = 1; i < notas.length; i++) {
            System.out.println("Da primeira até a última: " + i);
        }

        System.out.println("----------------------");

        for (int i = 1; i < notas.length; i++) {
            System.out.println("Da última até o começo: " + notas[notas.length - i]);
        }

        System.out.println("Da última até o começo: " + notas[0]);
        System.out.println("O Array: " + Arrays.toString(notas));
    }
}
