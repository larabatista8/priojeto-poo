package projetoModelo.main.java.br.edu.univasf.modelo.model;

	public class Adimin  extends Usuario{

		public Adimin(String nome, String matricula, String email) {
			super(nome, matricula, email);
			// TODO Auto-generated constructor stub
		}

		
		public void addLivro(Estoque estoque, Livro livro) {
			estoque.adicionarLivroAoEstoque(livro);
		}
		
		public void addJornal(Estoque estoque, Jornal jornal) {
			estoque.adicionarJornalAoEstoque(jornal);	
		}
		
		public void apagaLivro() {}
		
		
	}


