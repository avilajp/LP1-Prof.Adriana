package Atividade_18_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio80 {
    public static void main(String[] args) {
        Exercicio80();
        ex80ArrayList();
    }
    public static void Exercicio80(){
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

        int maiorNota = pontuacoes[0];
        int posicaoMaior = 0;

        for (int i = 1; i < pontuacoes.length; i++) {
            if (maiorNota < pontuacoes[i]) {
                maiorNota = pontuacoes[i];
                posicaoMaior = i;
            }
        }

        System.out.println("O Array de notas: " + Arrays.toString(pontuacoes));
        System.out.println("A média das notas: " + media);
        System.out.println("A maior nota: " + maiorNota);
        System.out.println("A posição da maior nota na lista é: " + (posicaoMaior + 1));
    }

    public static void ex80ArrayList() {
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
        int maior = notas.get(0);
        int pos = 0;

        for (int i = 0; i < notas.size(); i++) {
            if (maior < notas.get(i)) {
                maior = notas.get(i);
                pos = (i + 1);
            } else {
                pos = (i + 1);
            }
        }

        System.out.println("O ArrayList: " + notas);
        System.out.println("A média das notas: " + media);
        System.out.println("A maior das notas: " + maior);
        System.out.println("A posição do Maior é o número " + pos + " na lista");
    }
}
