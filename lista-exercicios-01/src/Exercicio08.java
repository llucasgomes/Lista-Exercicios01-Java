/*Criar um programa que receba o ano de nascimento de uma pessoa e imprima 
 * a sua idade atual e imprima também a sua idade em 2050.*/

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
int dataNasc,anoAtual = 2022,ano2050 = 2050,res;
		

		Scanner leitor = new Scanner(System.in);

		System.out.print("Qual seu Ano de Nascimento:");
		dataNasc = leitor.nextInt();
		leitor.close();

		res = Math.abs(dataNasc - anoAtual);
		System.out.println("Você tem " + res + " anos");

		res = Math.abs(dataNasc - ano2050);
		System.out.print("E voce terá " + res + " anos em 2050");

	}

}
