package Atividade_18_10;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio80 {
    public static void main(String[] args) {
        Exercicio80();
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
}
