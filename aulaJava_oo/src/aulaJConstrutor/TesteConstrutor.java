package aulaJConstrutor;

import java.util.Scanner;

public class TesteConstrutor {
	public static void main(String[]args) {
		
		Conta conta = new Conta(0.0, "12345-6","IS");
		conta.imprimirDados();
		
	
		Scanner input = new Scanner(System.in);
		System.out.println("por favor entre com o valor do deposito:");
		String valorDeposito= input.nextLine();
		
		conta.deposito(Double.parseDouble(valorDeposito));
		conta.imprimirDados();
		input.close();
		
		
	}
}