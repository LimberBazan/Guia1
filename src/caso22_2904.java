import java.util.Scanner;
public class caso22_2904 {

	public static void main(String[] args) {
		float nota1, nota2, nota3;
		float valor1, valor2, valor3;
		
		
		System.out.println("Ingrese el valor de la primera nota: ");
		Scanner teclado = new Scanner(System.in);
		nota1 = teclado.nextFloat();
		
		System.out.println("Ingrese el valor de la segunda nota: ");
		nota2 = teclado.nextFloat();
		
		System.out.println("Ingrese el valor de la tercera nota: ");
		nota3 = teclado.nextFloat();
		
		
		valor1 = nota1 * 0.2f;
		valor2 = nota2 * 0.3f;
		valor3 = nota3 * 0.5f;
		
		System.out.println("El promedio es: " + (valor1 + valor2 + valor3));
		
	}

}
