package Java_POO;

import java.util.Scanner;

public class E2_20_DescobrindoSeUmAnoEBissexto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
			System.out.print("Digite um ano: ");
			int ano = scanner.nextInt();
			
		scanner.close();
		
		boolean divisivelPor400 = ano%400==0;
		boolean divisivelPor4ENãoDivisielPor100 = (ano%4==0 && ano%100!=0);
		boolean anoBissexto = divisivelPor400 || divisivelPor4ENãoDivisielPor100;
				
		if(anoBissexto){
			System.out.println("\nO ano " + ano + " é bissexto");
		} else System.out.println("\nO ano " + ano + " não é bissexto");
	}
}
