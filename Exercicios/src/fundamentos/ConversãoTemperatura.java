package fundamentos;

import java.util.Scanner;

public class ConversãoTemperatura {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		final double AJUSTE = 32;
		final double FATOR = 5 / 9.0;
		final double FAHRENHEIT = 273.15;
		double valor, celsius;
		int escolha;
		
		//°C = (X - 32) * 5/9.0
		for (int i=2; i>1; i++) {
			System.out.println("Você deseja converter:\n   1 - Fahrenheit para Celsius\n   2 - Celsius para Kelvin");
			escolha = teclado.nextInt();
			if (escolha == 1) {
				System.out.println("Quantidade de Fahrenheit que deseja converter?");
				System.out.println("A temperatura e: " + (((celsius = teclado.nextDouble()) - AJUSTE) * FATOR) + "ºC");
				System.out.println("Deseja fazer outra conversao?\nDigite 1 para sim e 2 para nao");
				if((escolha=teclado.nextInt()) == 2) {
					i =0;
				}
			} else if (escolha == 2) {
				System.out.println("Quantidade de Celsius que deseja converter?");
				System.out.println("A tempoeratura é: " + ((celsius = teclado.nextDouble()) + FAHRENHEIT) + "K");
				System.out.println("Deseja fazer outra conversão?\nDigite 1 para sim e 2 para não");
				if((escolha=teclado.nextInt()) == 2) {
					i =0;
				}
			} else {
				System.out.println("Escolha entre os números 1 e 2 para converter um número ou digite 0 para sair");
				escolha = teclado.nextInt();
				if(escolha==0) {i=0;}
			}
		}
		System.out.println("Obrigado por utilizar o sistema de conversão!!!");

	}

}
