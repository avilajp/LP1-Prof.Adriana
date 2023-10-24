package Atividade_18_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio81 {
    public static void main(String[] args) {
        Exercicio81();
        ex81ArrayList();
    }
    public static void Exercicio81(){
        int[] pontuacoes = new int[5];
        Scanner scanner = new Scanner(System.in);
        double somaDasNotas = 0;
        double media = 0;

        for (int i = 0; i < pontuacoes.length; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ":");
            pontuacoes[i] = scanner.nextInt();
            somaDasNotas += pontuacoes[i];
        }

        media = somaDasNotas / pontuacoes.length;

        int menorNota = pontuacoes[0];
        int posicaoMenor = 1;

        for (int i = 1; i < pontuacoes.length; i++) {
            if (menorNota > pontuacoes[i]) {
                menorNota = pontuacoes[i];
                posicaoMenor = i + 1;
            }
        }

        System.out.println("O Array de notas: " + Arrays.toString(pontuacoes));
        System.out.println("A média das notas: " + media);
        System.out.println("A menor das notas: " + menorNota);
        System.out.println("A posição da menor nota na lista é: " + posicaoMenor);
    }

    public static void ex81ArrayList() {
        ArrayList<Integer> notas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double somaNotas = 0;
        double media = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira a nota do aluno " + (i + 1) + ": ");
            int nota = sc.nextInt();
            notas.add(nota);
            somaNotas += nota;
        }

        media = somaNotas / notas.size();
        int menor = notas.get(0);
        int pos = 1;

        for (int i = 0; i < notas.size(); i++) {
            if (menor > notas.get(i)) {
                menor = notas.get(i);
                pos = (i + 1);
            } else {
                pos = (i + 1);
            }
        }

        System.out.println("O ArrayList: " + notas);
        System.out.println("A média das notas: " + media);
        System.out.println("A menor das notas: " + menor);
        System.out.println("A posição da Menor é o número " + pos + " na lista");
    }
}
