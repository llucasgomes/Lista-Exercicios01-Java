/*Criar um programa que receba dois valores A e B, e efetue a troca dos valores de forma que a vari�vel 
 * A passe a possuir o valor da vari�vel B e que a vari�vel B passe a possuir o valor da vari�vel A.
 *  Por fim, apresentar os valores trocado*/
import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		 Scanner leitor = new Scanner(System.in);
		 
		 System.out.print("Insira o valor de A: ");
		 int a = leitor.nextInt();
		 System.out.print("Insira o valor de B: ");
		 int b = leitor.nextInt();
		 leitor.close();
		 
		 int aux = b;
		 b = a;
		 a = aux;
		 
		 System.out.println("O valor de A �: " + a);
		 System.out.print("O valor de B �: " + b);

	}

}
