package Java_POO;

import java.util.Scanner;

public class E2_15_CalculadoraProfessor {

	public static void main(String[] args) {
		
		System.out.println("¡REA DO DO CÕRCULO\n");
		
		Scanner scanner = new Scanner(System.in);
		
			System.out.print("Digite o valor do raio: ");
			float raio = scanner.nextFloat();
			
		scanner.close();
		
		float area = (float) (Math.PI*Math.pow(raio, 2));
		
		int areaInt = (int) area;
		
		System.out.printf("\n¡rea = %.2f", area);
		
		System.out.println("\nA parte inteira da ·rea = " + areaInt);
		
	}

}
