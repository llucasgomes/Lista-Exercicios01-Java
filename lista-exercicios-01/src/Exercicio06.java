/*Criar um programa que leia 2 n�meros reais, efetuar as 4 opera��es matem�ticas e mostrar os resultados.*/

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		double n1;
		double n2;
		double res;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira o Primeiro Valor:");
		n1 = Double.parseDouble(leitor.nextLine());
		System.out.println("Insira o Segundo Valor:");
		n2 = Double.parseDouble(leitor.nextLine());
		leitor.close();
		
		res = n1 + n2;
		System.out.println("A soma entre os valores � "+res);
		res = n1 - n2;
		System.out.println("A subtra��o entre os valores � "+res);
		res = n1 * n2;
		System.out.println("A multipli��o entre os valores � "+res);
		res = n1 / n2;
		System.out.println("A divis�o entre os valores � "+res);

	}

}
