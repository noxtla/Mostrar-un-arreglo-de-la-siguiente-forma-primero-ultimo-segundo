package arreglo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int arreglo [] = new int [10];

		
		for(int i=0; i<10; i++) {
			System.out.println("Ingresa el numero para la pos " + (i+1));
			arreglo[i] = entrada.nextInt();
		}
		
		
		System.out.println("Mostrando");
		for(int i = 0; i<5; i++) {
			System.out.println(arreglo[i] + " ");
			System.out.println(arreglo[9-i] + " ");
		}
	}

}
