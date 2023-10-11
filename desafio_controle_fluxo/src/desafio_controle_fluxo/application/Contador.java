package desafio_controle_fluxo.application;

import java.util.Locale;
import java.util.Scanner;

import desafio_controle_fluxo.exceptions.ParametrosInvalidosException;

public class Contador {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = sc.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = sc.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		}
		catch(ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}
		
		sc.close();
		
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois)
			throw new ParametrosInvalidosException();
		
		int contagem = parametroDois - parametroUm;
		for(int i = 1; i <= contagem; i++) {
			System.out.printf("Imprimindo o número %d%n", i);
		}
	}

}
