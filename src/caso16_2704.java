import java.util.Scanner;
public class caso16_2704 {
	public static void main(String[] args) {
		double htrabajo = 0;
		double pagah = 0;
		double sueldo = 0;
		double bono = 0;
		double total = 0;
		double tc = 0;
		
		
		System.out.println("Ingrese las horas de trabajo: ");
		Scanner teclado = new Scanner(System.in);
		htrabajo = teclado.nextDouble();
		
		System.out.println("Ingrese su paga por hora: ");
		pagah = teclado.nextDouble();
		
		
		sueldo = htrabajo * pagah;
		bono = (sueldo*5)/100;
		total = sueldo + bono ;
		tc = total /3.24;
		
		
		System.out.println("------------------------------");
		System.out.println("Resultado");
		System.out.println("------------------------------");
		System.out.println("Sueldo: "+ sueldo);
		System.out.println("Bono: "+ bono);
		System.out.println("Total: "+ total);
		System.out.println("Dolars: "+ tc);
		
	}
}
