import java.util.Scanner;
public class caso17_2704 {

	public static void main(String[] args) {
		double aprob;
		double desap;
		double ret;
		double total;
		
		System.out.println("Ingrese numero de aprobados: ");
		Scanner teclado = new Scanner(System.in);
		aprob = teclado.nextDouble();
		System.out.println("Ingrese numero de desaprobados: ");
		desap = teclado.nextDouble();
		System.out.println("Ingrese numero de retirados: ");
		ret = teclado.nextDouble();
		
		total = aprob + desap + ret;
		
		System.out.println("Numero Aprobados: "+ aprob);
		System.out.println("Numero Desaprobados: "+ desap);
		System.out.println("Numero Retirados: "+ ret);
		System.out.println("-------------------------");
		System.out.println("Aprobados: "+ (100*aprob)/total + "%");
		System.out.println("Desaprobados: "+ (100*desap)/total + "%");
		System.out.println("Retirados: "+ (100*ret)/total + "%");
		
	}

}
