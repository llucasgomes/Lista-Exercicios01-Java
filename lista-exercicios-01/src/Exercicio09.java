/*Criar um programa que receba idade de uma pessoa e imprima o seu ano de nascimento.*/
import java.util.Scanner;
public class Exercicio09 {

	public static void main(String[] args) {
		
		int idade;
		int anoAtual = 2022;
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Insira a sua idade: ");
		idade = leitor.nextInt();
		leitor.close();
		
		idade = anoAtual - idade;
		
		System.out.print("Você nasceu em "+ idade);
		

	}

}
