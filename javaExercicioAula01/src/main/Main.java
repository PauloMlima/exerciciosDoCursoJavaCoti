package main;

import java.util.Scanner;
import java.util.UUID;

import entities.Funcionario;

public class Main {
	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();

		Scanner scanner = new Scanner(System.in);

		System.out.println("**** CADASTRO DE FUNCIONARIO ***\n");
		
		funcionario.setId(UUID.randomUUID());

		System.out.println("Digite o nome do funcionario: ");
		
		funcionario.setNome(scanner.nextLine());
		
		System.out.println("Digite o cpf do funcionario: ");
		funcionario.setCpf(scanner.nextLine());
		
		
		System.out.println("Digite a matricula do funcionario: ");
		
		funcionario.setMatricula(scanner.nextLine());
		
		 System.out.println("Digite o salário do funcionário:");
	        Double salario = Double.parseDouble(scanner.nextLine());
	        funcionario.setSalario(salario);
		

		scanner.close();

		 System.out.println("\n**** FUNCIONÁRIO CADASTRADO ****\n");
	        System.out.println("ID: " + funcionario.getId());
	        System.out.println("Nome: " + funcionario.getNome());
	        System.out.println("CPF: " + funcionario.getCpf());
	        System.out.println("Matrícula: " + funcionario.getMatricula());
	        System.out.println("Salário: R$" + funcionario.getSalario());
		

	}

}
