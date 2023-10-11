package conta_banco.application;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		System.out.println("Olá! Bem-vindo a aplicação ContaTerminal!");
		System.out.println("Por favor, insira:");
		System.out.print("Número da conta: ");
		numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Número da agência: ");
		agencia = sc.nextLine();
		System.out.print("Nome do cliente: ");
		nomeCliente = sc.nextLine();
		System.out.print("Saldo da conta: ");
		saldo = sc.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
		
		sc.close();
		
	}
	
	
	

}
