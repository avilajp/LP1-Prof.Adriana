package Exception_exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws TrocaDeValoresException {
        System.out.println("Ex1: Custo final de um carro usando exceção");
        ex10();
    }

    public static void ex10() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        double custoFabrica;
        double distribuidor = 28;
        double imposto = 45;
        try {
            System.out.println("Insira o custo de fábrica:");
            custoFabrica = scanner.nextDouble();
            System.out.println("O valor final do carro é: " + (
                    (custoFabrica)
                            + (custoFabrica * (distribuidor / 100))
                            + (custoFabrica * (imposto / 100))
            ));
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Não é possível utilizar letras");
        }
    }

    public static class TrocaDeValoresException extends Exception {
        public TrocaDeValoresException(String message) {
            super(message);
        }
    }
}