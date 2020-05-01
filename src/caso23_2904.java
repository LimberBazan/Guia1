import java.util.Scanner;
public class caso23_2904 {

	public static void main(String[] args) {
		String producto;
		float precio, cantidad, importe;
		float igv, descu, total;
		
		
		System.out.println("Ingrese el nombre del producto: ");
		Scanner teclado = new Scanner(System.in);
		producto = teclado.nextLine();
		
		System.out.println("Ingrese el precio: ");
		precio = teclado.nextFloat();
		
		System.out.println("Ingrese la cantidad: ");
		cantidad = teclado.nextFloat();
		
		
		importe = precio * cantidad;
		igv = importe * 0.18f;
		descu = importe * 0.03f;
		total = (importe - descu) + igv;
		
		System.out.println("--------------------------------------------");
		System.out.println("Resultado");
		System.out.println("--------------------------------------------");
		System.out.println("Producto:  "+ producto);
		System.out.println("Cantidad:  "+ cantidad + "		Precio:  " + precio);
		System.out.println("--------------------------------------------");
		System.out.println("Importe:   "+ importe);
		System.out.println("IGV:	   "+ igv);
		System.out.println("Descuento: "+ descu);
		System.out.println("Total:	   "+ total);
		
		

	}

}
