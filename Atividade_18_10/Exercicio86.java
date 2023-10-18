package Atividade_18_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio86 {
    public static void main(String[] args) {
        Exercicio86();
    }
    public static void Exercicio86(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listaDesordenada = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            System.out.println("Insira os valores desordenados: ");
            listaDesordenada.add(scanner.nextInt());
        }

        System.out.println("O ArrayList desordenado: " + listaDesordenada);

        for (int i = 0; i < listaDesordenada.size() - 1; i++) {
            for (int j = 0; j < listaDesordenada.size() - 1 - i; j++) {
                if (listaDesordenada.get(j) > listaDesordenada.get(j + 1)) {
                    int temporario = listaDesordenada.get(j);
                    listaDesordenada.set(j, listaDesordenada.get(j + 1));
                    listaDesordenada.set(j + 1, temporario);
                }
            }
        }

        System.out.println("O ArrayList ordenado: " + listaDesordenada);
    }
}
