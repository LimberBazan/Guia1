//Hecho por Limber Bazan
import java.util.Scanner;
public class caso15_2504 {

    
    public static void main(String[] args) {
        int cantidad;
        int precio;
        double sol;
        double dol;
        double eur;
        
        
        System.out.println("ingrese su cantidad: ");
        Scanner cant = new Scanner(System.in);
        cantidad = cant.nextInt();
        
        System.out.println("ingrese su precio: ");
        Scanner prec = new Scanner(System.in);
        precio = prec.nextInt();
        
        sol = cantidad * precio;
        dol = sol /3.24;
        eur = sol /3.75;
        
        System.out.println("Importe en soles:	 " + sol);
        System.out.println("Importe en dolares:	 " + dol);
        System.out.println("Importe en euros:	 " + eur);
        
    }
    
}