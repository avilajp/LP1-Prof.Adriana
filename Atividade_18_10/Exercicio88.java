package Atividade_18_10;

import java.util.Scanner;

public class Exercicio88 {
    public static void main(String[] args) {
        Exercicio88();
    }
    public static void Exercicio88(){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Insira os números: ");
            numeros[i] = scanner.nextInt();
        }

        boolean encontrado = false;

        System.out.println("Insira mais um número: ");
        int novoNumero = scanner.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (novoNumero == numeros[i]) {
                encontrado = true;
            }
        }
    }
}
