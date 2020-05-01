import java.util.Scanner;
public class caso21_2904 {

	public static void main(String[] args) {
		float gasto;
		float dismin;
		
		System.out.println("Ingrese el valor de la venta: ");
		Scanner teclado = new Scanner(System.in);
		gasto = teclado.nextFloat();
		
		dismin = gasto * 0.12f;
		
		System.out.println("El gasto disminuido: "+ (gasto - dismin));
		
	}

}
