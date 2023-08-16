Fizemos um pequeno código de soma de números imaginários;

package teste_mesa;

public class Soma {
    
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int soma = a + b;
        System.out.println("soma = " + soma);
        
        Soma result1 = new Soma();
        System.out.println(result1.somar_real(2.6, 3.5));
        
        Soma result2 = new Soma();
        result2.somar_complexo(5, 2, 7, -3);
    }
    
    public double somar_real(double a, double b) {
        return a + b;
    }
    
    public void somar_complexo(int a, int b, int c, int d) {
        int r = a + c;
        int i = b + d;        
        System.out.println("A soma = " + r + " + " + i + "i");
    }
}
