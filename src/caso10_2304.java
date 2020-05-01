import java.util.Scanner;
public class caso10_2304 {

    
    public static void main(String[] args) {
        int radio;
        double pi=3.1416;
        double area;
        double perimetro;
        
        System.out.println("Ingrese el valor del radio: ");
        Scanner teclado = new Scanner(System.in);
        radio = teclado.nextInt();
        
        perimetro= 2* pi * radio;
        area = (int) Math.pow(radio,2)* pi;
        
        System.out.println("---------------------");
        System.out.println("      Resultado      ");
        System.out.println("---------------------");
        System.out.println("El perimetro es: "+ perimetro);
        System.out.println("El area es: "+ area);
        
    }
    
}
