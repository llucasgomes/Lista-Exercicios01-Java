import java.util.Scanner;

/*Criar um programa que leia o nome de uma pessoa, a sua idade e o seu sal�rio, e mostrar essas informa��es.*/
public class Exercicio03 {

	public static void main(String[] args) {
		String nome;
		double salario;
		int idade;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira o nome do funcionario:");
		nome = leitor.nextLine();
		System.out.println("Insira a idade do funcionario:");
		idade = Integer.parseInt(leitor.nextLine());
		System.out.println("Insira o salario do funcionario:");
		salario = Double.parseDouble(leitor.nextLine());
		leitor.close();
		
		System.out.println("Seu nome � "+ nome + ",tem "+ idade + " anos, e salario de R$"+salario);
		

	}

}
