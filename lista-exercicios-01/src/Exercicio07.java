import java.util.Scanner;

/*Criar um programa que leia um valor em Real e a cota��o do d�lar, e converta esse valor em d�lares.*/
public class Exercicio07 {

	public static void main(String[] args) {
		float num;
		float dolar = 5.16f;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira o valor em reais, a ser convertido para dolar");
		num = leitor.nextFloat();
		leitor.close();
		
		num = num * dolar;
		
		System.out.println("Voc� tem "+ num + " dolar");
		System.out.printf("Voc� tem %.2f", num , " dolar");

	}

}
