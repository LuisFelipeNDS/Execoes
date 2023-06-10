package aplicacao;

import java.util.Scanner;
import model.execao.Execao;

import model.entidades.Conta;


public class Programa {
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			System.out.println("Qual o numero da conta ?");
			int numConta = teclado.nextInt();
			System.out.println("Qual e o seu nome?");
			String nome = teclado.next();
			System.out.println("Saldo inicial da conta");
			double saldo = teclado.nextDouble();
			System.out.println("Qual e o limite de saque ?");
			double limiteSaque = teclado.nextDouble();
		
			Conta conta = new Conta(numConta, nome, saldo, limiteSaque);
			System.out.println(conta);
			
			System.out.println("Qual a quantidade que deseja sacar ?");
			double sacar = teclado.nextDouble();
			
			conta.saque(sacar);
			
			System.out.println(conta);
		}
		catch(Execao e ) {
			System.out.println(e.getMessage());
		}
		
	}

}
