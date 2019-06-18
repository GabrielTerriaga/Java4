package exercicioWhile;

import java.util.Locale;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha: ");
		int pw = sc.nextInt();
		
		while (pw != 2002) {
			System.out.println("Senha invalida");
			System.out.println("Digite novamente: ");
			pw = sc.nextInt();
		}
		System.out.println("Acesso permitido");
		
		sc.close();
	}

}
