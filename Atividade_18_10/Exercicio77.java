package Atividade_18_10;
import java.util.*;

public class Exercicio77 {
    public static void main(String[] args) {
        Exercicios77();
    }
    public static void Exercicios77() {
        int[] novoArray = {5, 1, 4, 2, 7, 8, 3, 6};
        for (int i = 7; i >= 5; i--) {
            int auxiliar = novoArray[i];
            novoArray[i] = novoArray[7 - i + 1];
            novoArray[7 - i + 1] = auxiliar;
        }
        novoArray[2] = novoArray[1];
        novoArray[novoArray[2]] = novoArray[novoArray[1]];

        System.out.println(Arrays.toString(novoArray));
    }
}