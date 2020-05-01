import java.util.Scanner;

public class caso19_2604 {
	
	public static void main(String[] args) {
			int lado1;
			int lado2;
			int lado3;
			int perimetro;
			
			System.out.println("Ingrese el valor del primer lado: ");
			Scanner teclado = new Scanner(System.in);
			lado1 = teclado.nextInt();
			
			System.out.println("Ingrese el valor del segundo lado: ");
			lado2 = teclado.nextInt();
			
			System.out.println("Ingrese el valor del tercer lado: ");
			lado3 = teclado.nextInt();
			
			perimetro = lado1 + lado2 + lado3;
			
			System.out.println("El perimetro es: "+ perimetro);
			
	}
}
