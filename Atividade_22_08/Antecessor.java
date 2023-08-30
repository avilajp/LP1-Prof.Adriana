package Atividade_22_08;
import java.util.Scanner;
public class Antecessor {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("Digite um número: ");
			int count = scanner.nextInt();
			
			int antecessor = count-1;
			System.out.println("O antecessor é: "+antecessor);
			
			scanner.close();
	}
}
