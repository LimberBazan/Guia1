import java.util.Scanner;
public class caso24_2904 {
	
	public static void main(String[] args) {
		float monto1;
		float monto2;
		float monto3;
		
		float rpta1;
		float rpta2;
		float rpta3;
		
		
		System.out.println("Ingrese el primer monto");
		Scanner teclado = new Scanner(System.in);
		monto1 = teclado.nextFloat();
		
		System.out.println("Ingrese el segundo monto");
		monto2 = teclado.nextFloat();
		
		System.out.println("Ingrese el tercer monto");
		monto3 = teclado.nextFloat();
		
		
		rpta1 = (monto1 / 5) + (monto2*0.2f);
		rpta2 = (monto3*1.6f)/2;
		//rpta3 = (monto1 + monto2 + monto3)*(1-0.08f);
		rpta3 = (monto1 + monto2 + monto3)*0.92f;
		
		
		System.out.println("--------------------------------------------");
		System.out.println("Resultado");
		System.out.println("--------------------------------------------");
		System.out.println("Respuesta 1:  "+ rpta1);
		System.out.println("Respuesta 2:  "+ rpta2);
		System.out.println("Respuesta 3:  "+ rpta3);
	}
}
