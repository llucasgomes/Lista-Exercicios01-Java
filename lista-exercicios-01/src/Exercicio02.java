/*Criar um programa que calcule a média de 2 notas e mostrar essa média na tela.*/
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		double nota1;
		double nota2;
		double media;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira a Primeira Nota:");
		nota1 = Double.parseDouble(leitor.nextLine()); //Double.parseDouble convert string para int
		
		System.out.println("Insira a Segunda Nota:");
		nota2 = Double.parseDouble(leitor.nextLine());//Double.parseDouble convert string para int
		leitor.close();
		
		media = nota1 + nota2;
		
		media = media / 2;
		if(media<5) {
			System.out.println("Reprovado");
		}
		if(media >= 5 && media <=6) {
			System.out.println("Recuperação");
		}
		if (media >6) {
			System.out.println("Passou!!!");
		}
		
		
		
		

	}

	}


