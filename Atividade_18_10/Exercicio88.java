package Atividade_18_10;

import java.util.Scanner;

public class Exercicio88 {
    public static void main(String[] args) {
        Exercicio88(); // Correção: Remova esta chamada e não é necessário.
    }

    public static void Exercicio88() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Insira os números: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Insira mais um número: ");
        int novoNumero = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (novoNumero == numeros[i]) {
                encontrado = true;
                break; // Adicione um break para sair do loop assim que o número for encontrado.
            }
        }

        if (encontrado) {
            System.out.println("O número " + novoNumero + " foi encontrado no array.");
        } else {
            System.out.println("O número " + novoNumero + " não foi encontrado no array.");
        }
    }
}
