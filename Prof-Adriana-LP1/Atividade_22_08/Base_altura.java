package Atividade_22_08;
import java.util.Scanner;
public class Base_altura {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a base do retângulo: ");
		    double base = scanner.nextDouble();

	        System.out.print("Digite a altura do retângulo: ");
	        double h = scanner.nextDouble();

	        double area = base * h;

	        System.out.println("A área do retângulo é: " + area);

	        scanner.close();
	}
}
