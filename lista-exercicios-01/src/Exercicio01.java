/*Criar um programa que receba tr�s nomes de pessoas e mostre-os na tela.*/
import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
			String n1;
			String n2;
			String n3;
			
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("Insira o nome da 1� pessoa:");
			n1 = leitor.nextLine();
			System.out.println("Insira o nome da 2� pessoa:");
			n2 = leitor.nextLine();
			System.out.println("Insira o nome da 3� pessoa:");
			n3 = leitor.nextLine();
			leitor.close();
			
			System.out.println("Primeira pessoa se chama: "+n1);
			System.out.println("Segunda pessoa se chama: "+n2);
			System.out.println("Terceira pessoa se chama: "+n3);
		}

	}


