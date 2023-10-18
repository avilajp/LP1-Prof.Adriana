package Atividade_18_10;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio82 {
    public static void main(String[] args) {
        Exercicio82();
    }
    public static void Exercicio82(){
        int[] numerosOriginais = new int[5];
        int[] numerosMultiplicados = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numerosOriginais.length; i++) {
            System.out.println("Digite um número: ");
            numerosOriginais[i] = scanner.nextInt();
        }

        System.out.println("Agora, insira outro número: ");
        int novoNumero = scanner.nextInt();

        for (int i = 0; i < numerosMultiplicados.length; i++) {
            numerosMultiplicados[i] = numerosOriginais[i] * novoNumero;
        }

        System.out.println("O Array Original: " + Arrays.toString(numerosOriginais));
        System.out.println("O Array Multiplicado: " + Arrays.toString(numerosMultiplicados));
    }
}
