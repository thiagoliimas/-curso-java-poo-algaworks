package Java_POO;

import java.util.Scanner;


public class E2_23_MultaVeiculo {
	
	static final float _5_POR_CENTRO = 5;
	static final float _10_POR_CENTRO = 10;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
			System.out.print("Digite: 1 - Veículos leves | 2 - Veículos pesados ");
			char tipoVeiculo = (char) scanner.nextShort();
			
			System.out.print("\nDigite a velocidade máxima da via: ");
			int velMaxVia = scanner.nextInt();
			
			System.out.print("\nDigite a velocidade do veículo: ");
			int velVeiculo = scanner.nextInt();
		
		scanner.close();
		
		int porcetagemUltrapassada = (int) ((((float) velVeiculo/velMaxVia)-1)*100);
		
		boolean multa = tipoVeiculo == 1 && porcetagemUltrapassada > _10_POR_CENTRO 
						|| tipoVeiculo == 2 && porcetagemUltrapassada > _5_POR_CENTRO;
		
		if(multa) {
			System.out.println("\nVelocidade do veículo: " + velVeiculo + " km/h");
			System.out.println("Velocidade máxima na via: " + velMaxVia + " km/h");
			System.out.println("Ultrapassou a velocidade máxima permitida em: " 
			+ porcetagemUltrapassada + "% \n");
			System.out.println("Multa aplicada!");
		} else {
			System.out.println("\nVelocidade do veículo: " + velVeiculo + " km/h");
			System.out.println("Velocidade máxima na via: " + velMaxVia + " km/h");
			System.out.println("\nVelocidade dentro do limite!");
		}
	}
}
