package projetoModelo.main.java.br.edu.univasf.modelo.model;

import java.util.Scanner;

	public class Adimin  extends Usuario{
		
		private Scanner scanner = new Scanner(System.in);

		public Adimin(String nome, String matricula, String email) {
			super(nome, matricula, email);
			// TODO Auto-generated constructor stub
		}

		
		public void addLivro(Estoque estoque) {
	        if (estoque == null) {
	            System.out.println("Erro: Estoque não pode ser nulo.");
	            return;
	        }
	        System.out.println("=== Cadastro de Livro ===");
	        System.out.print("Digite o título do livro: ");
	        String titulo = scanner.nextLine();

	        System.out.print("Digite o subtítulo do livro: ");
	        String subTitulo = scanner.nextLine();

	        System.out.print("Digite o autor do livro: ");
	        String autor = scanner.nextLine();

	        System.out.print("Digite a sinopse do livro: ");
	        String sinopse = scanner.nextLine();

	        System.out.print("Digite o gênero do livro: ");
	        String genero = scanner.nextLine();

	        System.out.print("Digite o ISBN do livro: ");
	        String isbn = scanner.nextLine();

	        System.out.print("Digite o número de páginas: ");
	        int numeroDePaginas = scanner.nextInt();
	        scanner.nextLine(); // Consumir o \n

	        System.out.print("Digite o ano de publicação: ");
	        int anoPublicacao = scanner.nextInt();
	        scanner.nextLine(); // Consumir o \n

	        System.out.print("Digite o sumário do livro: ");
	        String sumario = scanner.nextLine();

	        System.out.print("Digite o nome da editora: ");
	        String nomeEditora = scanner.nextLine();

	        System.out.print("O livro está disponível (true/false)? ");
	        boolean disponivel = scanner.nextBoolean();
	        scanner.nextLine();

	        Livro novoLivro = new Livro(titulo, autor, subTitulo, sinopse, genero, isbn, numeroDePaginas,
	                anoPublicacao, sumario, nomeEditora, disponivel);

	        estoque.adicionarLivroAoEstoque(novoLivro);
	        System.out.println("Livro adicionado ao estoque com sucesso!");
		}
		
		public void addJornal(Estoque estoque) {
			if (estoque == null) {
	            System.out.println("Erro: Estoque não pode ser nulo.");
	            return;
	        }
			
			System.out.println();
	        System.out.println("=== Cadastro de Jornal ===");
	        System.out.print("Digite o título do jornal: ");
	        String titulo = scanner.nextLine();

	        System.out.print("Digite o autor do jornal: ");
	        String autor = scanner.nextLine();
	        
	        System.out.print("Digite o ano de publicação do jornal: ");
	        int anoPublicacao = scanner.nextInt();
	        scanner.nextLine();
	        
	        Jornal novoJornal = new Jornal(titulo,autor,anoPublicacao);
	        
	        estoque.adicionarJornalAoEstoque(novoJornal);
	        System.out.println("Jornal adicionado ao estoque com sucesso!");
		}
		
		public void apagaLivro() {}
		
		
	}


