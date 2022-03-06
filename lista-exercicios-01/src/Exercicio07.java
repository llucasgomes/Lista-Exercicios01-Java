import java.util.Scanner;

/*Criar um programa que leia um valor em Real e a cotação do dólar, e converta esse valor em dólares.*/
public class Exercicio07 {

	public static void main(String[] args) {
		float num;
		float dolar = 5.16f;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira o valor em reais, a ser convertido para dolar");
		num = leitor.nextFloat();
		leitor.close();
		
		num = num * dolar;
		
		System.out.println("Você tem "+ num + " dolar");
		System.out.printf("Você tem %.2f", num , " dolar");

	}

}
