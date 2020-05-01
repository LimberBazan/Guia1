import java.util.Scanner;
public class caso14_2504 {

    
    public static void main(String[] args) {
        int numb;
        int suma;
        
        System.out.println("ingrese su numero: ");
        Scanner n = new Scanner(System.in);
        numb = n.nextInt();
        
        suma = (numb *(numb + 1))/2;
        
        System.out.println("--Resultado--");
        System.out.println("La suma es: "+ suma);
        
        
    }
    
}