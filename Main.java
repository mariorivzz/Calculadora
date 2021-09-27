package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Crear una interface con todos los metodos: suma,resta,division,multi.
		 * Clase principal con menu de selección de la operación y despues
		 * pide por teclado los numeros a operar. Se tienen que volver a 
		 * pedir la operacion y el número que sea.
		 * Todo hasta que pulses 0 y salgas.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int entrada;
		float resultado = 0;
		
		System.out.println("Introduce el primer numero");
		
		try {
			resultado = sc.nextFloat();
		}catch(Exception e) {
			System.out.println("No has introducido un número");
		}
		
		try {
			do {
			System.out.println("Que operacion deseas realizar?");
			System.out.println("[1] - Sumar");
			System.out.println("[2] - Restar");
			System.out.println("[3] - Multiplicar");
			System.out.println("[4] - Dividir");
			System.out.println("[0] - Salir");
			
			entrada = sc.nextInt();
			float nuevoNumero;
			
			switch(entrada) {
			case 1: System.out.println("Sumar: ");
				nuevoNumero = sc.nextInt();
				resultado = resultado+nuevoNumero;
				System.out.println("Resultado: " + resultado);
				break;
			
			case 2: System.out.println("Restar: ");
				nuevoNumero = sc.nextInt();
				resultado = resultado-nuevoNumero;
				System.out.println("Resultado: " + resultado);
				break;
			
			case 3: System.out.println("Multiplicar: ");
				nuevoNumero = sc.nextInt();
				resultado = resultado*nuevoNumero;
				System.out.println("Resultado: " + resultado);
				break;
			
			case 4: System.out.println("Dividir: ");
				nuevoNumero = sc.nextInt();
				resultado = resultado/nuevoNumero;
				System.out.println("Resultado: " + resultado);
				break;
			
			default: System.out.println("Has salido");
			
				}
			}while(entrada!=0);
		}catch(Exception e) {
			System.out.println("No has introducido bien el número.");
	}
		
	}
}
