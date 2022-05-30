package fundamentos;

import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// (°F -32) * 5/9 = °C

		final double AJUSTE = 32;
		final double FATOR = 5 / 9.0;
		final double FAHRENHEIT = 273.15;
		double valor;
		double celsius;

		System.out.println("Você deseja converter:\n	1 - Firehigh para Celsius\n	2 - Celsius para Kelvin");
		int escolha = teclado.nextInt();
		if (escolha == 1) {
			System.out.println("Quantidade de fahrenheit?");
			System.out.println(((valor = teclado.nextDouble()) - AJUSTE) * FATOR + "°C");
		} else if (escolha == 2) {
			System.out.println("Quantidade de Celsius?");
			System.out.println((celsius = teclado.nextDouble()) + FAHRENHEIT + " K");
		}

	}

}
