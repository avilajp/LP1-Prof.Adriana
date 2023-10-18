package Atividade_18_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio79 {
    public static void main(String[] args) {
        Exercicio79();
    }
    public static void Exercicio79(){
        int[] pontuacoes = new int[5];
        Scanner scanner = new Scanner(System.in);
        double somaDasNotas = 0;
        double media = 0;
        int notasAcimaDaMedia = 0;

        for (int i = 0; i < pontuacoes.length; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ":");
            pontuacoes[i] = scanner.nextInt();
            somaDasNotas += pontuacoes[i];
        }

        media = somaDasNotas / pontuacoes.length;

        for (int i = 0; i < pontuacoes.length; i++) {
            if (pontuacoes[i] > media) {
                notasAcimaDaMedia += 1;
            }
        }

        System.out.println("A média das notas dos alunos é: " + media);
        System.out.println("Número de alunos com nota acima da média: " + notasAcimaDaMedia);
    }
}
