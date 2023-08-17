package Atividade_22_08;
import java.util.Scanner;
public class Reajuste {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("Digite seu salário atual: ");
			int salAtual = scanner.nextInt();
			double reajuste = 0.05;
			
			System.out.println("Seu salário reajustado é: " + (salAtual + (salAtual * reajuste)));
	}
}
