package Atividade_18_10;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio87 {
    public static void main(String[] args) {
        Exercicio87();
    }
    public static void Exercicio87(){
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[11];
        int novoValor;

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira um número: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Insira mais um número: ");
        novoValor = scanner.nextInt();

        int posicaoInsercao = 0;
        while (posicaoInsercao < 10 && novoValor > array[posicaoInsercao]) {
            posicaoInsercao++;
        }

        for (int i = 10; i > posicaoInsercao; i--) {
            array[i] = array[i - 1];
        }

        array[posicaoInsercao] = novoValor;

        System.out.println("Array com o novo número inserido e ordenado: " + Arrays.toString(array));
    }
}
