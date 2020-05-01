import java.util.Scanner;
public class caso20_2904 {

	public static void main(String[] args) {
		float venta;
		float incremento;
		
		System.out.println("Ingrese el valor de la venta: ");
		Scanner teclado = new Scanner(System.in);
		venta = teclado.nextFloat();
		
		incremento = venta * 0.42f;
		
		System.out.println("Valor de la venta incrementada: " + (incremento + venta));
		
	}

}
