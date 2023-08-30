package Atividade_22_08;
import java.util.Scanner;

	public class Salario_func {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o número de carros vendidos: ");
	        int carrosVendidos = scanner.nextInt();

	        System.out.print("Digite o valor total das vendas: ");
	        double valorVendas = scanner.nextDouble();

	        System.out.print("Digite o salário fixo do vendedor: ");
	        double salarioFixo = scanner.nextDouble();

	        System.out.print("Digite o valor por carro vendido: ");
	        double valorPorCarro = scanner.nextDouble();

	        double comissaoFixaPorCarro = carrosVendidos * valorPorCarro;
	        double comissaoPercentual = 0.05 * valorVendas;
	        
	        double salarioFinal = salarioFixo + comissaoFixaPorCarro + comissaoPercentual;

	        System.out.println("O salário final do vendedor é: " + salarioFinal);

	        scanner.close();
	    }
	}

