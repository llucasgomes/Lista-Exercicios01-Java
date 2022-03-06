/*Desafio feito pelo professor para nao adicionar uma variavel auxiliar*/
import java.util.Scanner;

public class DesafioExercicio10 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		 
		 System.out.print("Insira o valor de A: ");
		 int a = leitor.nextInt();
		 System.out.print("Insira o valor de B: ");
		 int b = leitor.nextInt();
		 leitor.close();
		 
		 a = a+b;
		 b = a-b;
		 a = a-b;
		 
		 
		 System.out.println("O valor de A é: " + a);
		 System.out.print("O valor de B é: " + b);

	}

}
