package ejercicios;

import java.util.Scanner;

public class Sumar {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Ingrese numero 01:");
		var n1 = read.nextInt();
		
		System.out.println("Ingrese numero 02:");
		var n2 = read.nextInt();
		
		System.out.printf("La suma de %d + %d es = %d", n1, n2, n1+n2);
		
		read.close();
	}

}
