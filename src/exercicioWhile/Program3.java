package exercicioWhile;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {

	int op2;
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//variaveis utilizadas
		int op1 = 0;
		int op2 = 0;
		int cont = 0;
		int cont1 = 0;
		int cont2 = 0;
		
		System.out.print("Digite 1 para entrar no menu: ");
		op1 = sc.nextInt();
				
		if (op1 == 1) {
			
			//chamada da fun��o que contem o menu
			menu();
			//digitar op��o do menu
			op2 = sc.nextInt();
			
			//validar op��o do menu
			while (op2 != 4) {
				if (op2 == 1){
					cont++;
					System.out.println();
					System.out.println("Alcool: " + cont);
					System.out.println();
				}
				else if (op2 == 2) {
					cont1++;
					System.out.println();
					System.out.println("Gasolina: " + cont1);
					System.out.println();
				}
				else if (op2 == 3) {
					cont2++;
					System.out.println();
					System.out.println("Diesel: " + cont2);
					System.out.println();
				}
				else {
					System.out.println();
					System.out.println("MUITO OBRIGADO!");
					System.out.println();
				}
				
				//Valida��o op��o entrada de menu
				System.out.println("Digite sua op��o do menu novamente");
				//Amostragem de menu dentro da repit��o
				menu();
				//Escolha de op��o do menu
				op2 = sc.nextInt();
			}
		}
		else { //Valida��o para a primeira entrada
			System.out.println("Op��o invalida, digite novamente: ");
			op1 = sc.nextInt();
		}
		
	sc.close();
	}
	
	
	//Fun��o que contem o menu
	public static void menu () {
		System.out.println();
		System.out.println("-------- MENU --------");
		System.out.println();
		System.out.println("1 - Alcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		System.out.println("4 - Sair");
	}

}
