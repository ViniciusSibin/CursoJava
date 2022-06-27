package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salario.");
		String salario1 = scan.nextLine();
		
		System.out.println("Digite o segundo salario.");
		String salario2 = scan.nextLine();
		
		System.out.println("Digite o terceiro salario.");
		String salario3 = scan.nextLine();
		
		double sal1 = Double.parseDouble(salario1.replace(",", "."));
		double sal2 = Double.parseDouble(salario2.replace(",", "."));
		double sal3 = Double.parseDouble(salario3.replace(",", "."));
		
		double media = (sal1+sal2+sal3)/3;
		
		System.out.println("A média dos três salários é: R$" + media);
	}

}
