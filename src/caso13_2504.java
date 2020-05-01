import java.util.Scanner;
public class caso13_2504 {

    
    public static void main(String[] args) {
        String nombre;
        String apellido;
        
        System.out.println("ingrese su nombre: ");
        Scanner sc = new Scanner(System.in);
        nombre = sc.nextLine();
        
        System.out.println("ingrese su apellido: ");
        apellido = sc.nextLine();
        
        System.out.print("Su nombre y apellido es "+nombre + " "+apellido);
        
    }
    
}