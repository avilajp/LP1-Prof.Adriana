package Atividade_22_08;

public class Valinverso {
	public static void main(String[] args) {		
		int a = 10;
        int b = 20;
		int invert;
		
        System.out.println("O valor de A é:"+a+" O valor de B é:"+b);

        invert = a;
        a = b;
        b = invert;
        
        System.out.println("Os valores invertidos são respectivamente, A:"+a+" B:"+b);
	}
}
