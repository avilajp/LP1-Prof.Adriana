package Atividade_22_08;
import java.util.Scanner;

public class Valores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valPrimeiro, valSegundo;

        while (true) {
            System.out.print("Digite o primeiro valor: ");
            valPrimeiro = scanner.nextInt();

            System.out.print("Digite o segundo valor: ");
            valSegundo = scanner.nextInt();

            if (valPrimeiro == valSegundo) {
                System.out.println("Valores iguais não são permitidos! Por favor, insira valores diferentes.");
            } else {
                break;
            }
        }

        if (valPrimeiro > valSegundo) {
            System.out.println("O primeiro valor é o maior: " + valPrimeiro);
        } else {
            System.out.println("O segundo valor é o maior: " + valSegundo);
        }

        scanner.close();
    }
}
