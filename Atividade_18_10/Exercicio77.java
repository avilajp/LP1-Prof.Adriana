package Atividade_18_10;
import java.util.*;

public class Exercicio77 {
    public static void main(String[] args) {
        Exercicios77();
        exercicio77ArrayList();
    }

    public static void Exercicios77() {
        int[] novoArray = {5, 1, 4, 2, 7, 8, 3, 6};
        for (int i = 6; i >= 5; i--) {
            int auxiliar = novoArray[i];
            novoArray[i] = novoArray[6 - i + 5];
            novoArray[6 - i + 5] = auxiliar;
        }
        novoArray[2] = novoArray[1];
        novoArray[novoArray[2]] = novoArray[novoArray[1]];

        System.out.println(Arrays.toString(novoArray));
    }

    public static void exercicio77ArrayList() {
        List<Integer> novaLista = new ArrayList<>(Arrays.asList(5, 1, 4, 2, 7, 8, 3, 6));
        for (int i = 6; i >= 5; i--) {
            int auxiliar = novaLista.get(i);
            novaLista.set(i, novaLista.get(6 - i + 5));
            novaLista.set(6 - i + 5, auxiliar);
        }
        novaLista.set(2, novaLista.get(1));
        novaLista.set(novaLista.get(2), novaLista.get(novaLista.get(1)));

        System.out.println(novaLista);
    }
}
