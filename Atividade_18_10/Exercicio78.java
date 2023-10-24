package Atividade_18_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio78 {
    public static void main(String[] args) {
        Exercicio78();
        ex78ArrayList();
    }
        public static void Exercicio78() {
            Scanner inputScanner = new Scanner(System.in);
            ArrayList<String> nomesPessoas = new ArrayList<>();

            for (int contador = 0; contador < 5; contador++) {
                System.out.println("Digite o nome da pessoa " + (contador + 1) + ":");
                nomesPessoas.add(inputScanner.next());
            }

            System.out.println("Agora, insira outro nome: ");
            String novoNome = inputScanner.next();
            nomesPessoas.add(novoNome);

            for (int contador = 0; contador < 5; contador++) {
                if (novoNome.equals(nomesPessoas.get(contador))) {
                    System.out.println("O nome na posição " + (contador + 1) + " é igual ao novo nome fornecido, que é: " + novoNome);
                }
            }
        }
        public static void ex78ArrayList() {
            Scanner inputScanner = new Scanner(System.in);
            ArrayList<String> listaPessoas = new ArrayList<>();

            for (int contador = 0; contador < 5; contador++) {
                System.out.println("Digite o nome da pessoa " + (contador + 1) + ":");
                listaPessoas.add(inputScanner.next());
            }

            System.out.println("Agora, insira outro nome: ");
            String novoNome = inputScanner.next();
            listaPessoas.add(novoNome);

            for (int contador = 0; contador < 5; contador++) {
                if (novoNome.equals(listaPessoas.get(contador))) {
                    System.out.println("O nome na posição: " + (contador + 1) + " é igual ao novo nome fornecido, que é: " + novoNome);
                }
            }
        }
    }
