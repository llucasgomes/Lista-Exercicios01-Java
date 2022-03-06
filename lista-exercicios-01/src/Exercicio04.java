/*Criar um programa que leia um número real imprima o seu dobro.*/
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double numero;
		
		System.out.println("Insira o numero real:");
		numero = Double.parseDouble(leitor.nextLine());
		
		numero = numero *2;
		leitor.close();
		
		System.out.println("O dobro do numero digital é "+ numero);

	}

}
