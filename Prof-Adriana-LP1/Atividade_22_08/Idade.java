package Atividade_22_08;
import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("Digite sua idade em anos: ");
			int anos = scanner.nextInt();
			System.out.println("Digite sua idade em meses: ");
			int meses = scanner.nextInt();
			System.out.println("Digite sua idade em dias: ");
			int dias = scanner.nextInt();
			
			int idadeEmDias = (anos * 365) + (meses * 30) + dias;
			
			System.out.println("Suas idade em dias é exatamente: "+ idadeEmDias);
	}
}
