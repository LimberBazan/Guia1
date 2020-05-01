import java.util.Scanner;
public class caso18_2704 {

	public static void main(String[] args) {
		int b;
		int h;
		int area;
		
		System.out.println("Ingrese el valor de la base: ");
		Scanner teclado = new Scanner(System.in);
		b = teclado.nextInt();
		System.out.println("Ingrese el valor de la altura: ");
		h = teclado.nextInt();
		
		area = (b*h)/2;
		
		System.out.println("-----------------------------");
		System.out.println("Respuesta ");
		System.out.println("-----------------------------");
		System.out.println("Area = " + area);
		
	}

}
