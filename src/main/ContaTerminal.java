package main;

import java.util.Scanner;

/**
 * @author Salevieno
 * @version 1.0
 * @since 19 of december of 2022
 **/

public class ContaTerminal
{
	/**
	 * @param nomeCliente is the name of the client
	 * @param agencia is the number of the agency
	 * @param numeroConta is the number of the account
	 * @param saldo is the amount of money in the account
	 **/
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.println("Nome do cliente: ") ;
			String nomeCliente = sc.next() ;
			
			System.out.println("Agência: ") ;
			String agencia = sc.next() ;
			
			System.out.println("Número da conta: ") ;
			int numeroConta = sc.nextInt() ;
			
			System.out.println("Saldo: ") ;
			double saldo = sc.nextDouble() ;
			
			System.out.printf(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo)) ;}
	}
}
