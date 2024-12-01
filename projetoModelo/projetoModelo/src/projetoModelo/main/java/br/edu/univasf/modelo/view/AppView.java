package projetoModelo.main.java.br.edu.univasf.modelo.view;

import java.util.Scanner;

import projetoModelo.main.java.br.edu.univasf.modelo.model.Usuario;

public class AppView {
	 private Scanner scanner;

	    public AppView() {
	        this.scanner = new Scanner(System.in);
	    }

	    public void exibirMensagemBemVindo() {
	        System.out.println("======================================");
	        System.out.println("  Bem-vindo ao Sistema da Biblioteca  ");
	        System.out.println("======================================");
	    }
	    
	    public int exibirMenuInicial() {
	    	System.out.println();
	        System.out.println("======================================");
	        System.out.println("       Sistema de Biblioteca          ");
	        System.out.println("======================================");
	        System.out.println("1. Fazer Login");
	        System.out.println("2. Sair");
	        System.out.print("Digite a opção desejada: ");
	        return scanner.nextInt();
	    }

	    public Usuario obterDadosLogin() {
	    	System.out.println();
	        scanner.nextLine(); // Limpar buffer
	        System.out.println("Digite seus dados para realizar o login:");
	        System.out.print("Matrícula: ");
	        String matricula = scanner.nextLine();
	        System.out.print("E-mail: ");
	        String email = scanner.nextLine();
	        return new Usuario(null, matricula, email); // Nome não é necessário para o login
	    }

	    public int exibirMenuAdmin() {
	        System.out.println();
	        System.out.println("======================================");
	        System.out.println("        Menu - Administrador          ");
	        System.out.println("======================================");
	        System.out.println("1. Adicionar Livro");
	        System.out.println("2. Adicionar Jornal");
	        System.out.println("3. Listar Livros");
	        System.out.println("4. Listar Jornais");
	        System.out.println("0. Sair");
	        System.out.print("Digite a opção desejada: ");
	        int opcao = scanner.nextInt();
	        scanner.nextLine(); // Limpa o buffer
	        return opcao;
	    }

	    public int exibirMenuUsuario() {
	    	System.out.println();
	        System.out.println("======================================");
	        System.out.println("        Menu - Usuário Comum          ");
	        System.out.println("======================================");
	        System.out.println("1. Consultar Livros Disponíveis");
	        System.out.println("2. Fazer Empréstimo");
	        System.out.println("3. Renovar Empréstimo");
	        System.out.println("4. Devolver Empréstimo");
	        System.out.println("5. Consultar Multas");
	        System.out.println("6.Consultar emprestimos");
	        System.out.println("7. Sair");
	        System.out.print("Digite a opção desejada: ");
	        return scanner.nextInt();
	    }

	    public void exibirMensagem(String mensagem) {
	        System.out.println(mensagem);
	    }
}
