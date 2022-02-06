package ejercicios;

import java.util.Scanner;

public class PrecioVenta {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de venta: ");
		
		double vv = read.nextDouble();
		
		double igv = vv * 0.18;
		
		double pv = vv + igv;
		
		System.out.println("Valor de venta: " + vv);
		System.out.println("IGV: " + igv);
		System.out.println("Precio de Venta:" + pv);
		
		read.close();
		
	}

}
