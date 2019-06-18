package exercicioWhile;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite as coordenadas de X e Y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} 
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			
			System.out.print("Digite as coordenadas novamente: ");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		System.out.println("saiu");
		sc.close();
	}

}
