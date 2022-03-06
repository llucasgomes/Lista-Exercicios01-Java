import java.util.Scanner;

/*Criar um programa que leia 2 números inteiros, efetuar as 4 operações matemáticas e mostrar os resultados.*/
public class Exercicio05 {

	public static void main(String[] args) {
		int n1;
		int n2;
		int res;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira o Primeiro Valor:");
		n1 = Integer.parseInt(leitor.nextLine());
		System.out.println("Insira o Segundo Valor:");
		n2 = Integer.parseInt(leitor.nextLine());
		leitor.close();
		
		res = n1 + n2;
		System.out.println("A soma entre os valores é "+res);
		res = n1 - n2;
		System.out.println("A subtração entre os valores é "+res);
		res = n1 * n2;
		System.out.println("A multiplição entre os valores é "+res);
		res = n1 / n2;
		System.out.println("A divisão entre os valores é "+res);

	}

}
