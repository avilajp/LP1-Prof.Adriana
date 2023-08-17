package Atividade_22_08;

public class Valinverso {
	public static void main(String[] args) {		
		int a = 10;
        int b = 20;
		int invert;
		
        System.out.println("O valor de A é:"+a+" O valor de B é:"+b);

        invert = b;
        b = a;
        a = b;
        
        System.out.println("Os valores invertidos são respectivamente, A:"+invert+" B:"+b);
	}
}
