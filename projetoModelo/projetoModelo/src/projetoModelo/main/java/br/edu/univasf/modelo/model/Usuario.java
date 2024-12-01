package projetoModelo.main.java.br.edu.univasf.modelo.model;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Estoque;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Livro;
import java.util.ArrayList;
	public class Usuario  {
		private String nome;
		private String matricula;
		private String email;
		private ArrayList<Livro> livrosEmprestados = new ArrayList<Livro>();
		private int diasDeSuspensao;
		
		public Usuario(String nome, String matricula, String email) {
			super();
			this.nome = nome;
			this.matricula = matricula;
			this.email = email;
			this.diasDeSuspensao=0; // dias de suspensao começa com 0
		}
		
		public ArrayList<Livro> getLivrosEmprestados() {
			return livrosEmprestados;
		}

		public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados) {
			this.livrosEmprestados = livrosEmprestados;
		}

		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
<<<<<<< HEAD
		
		public void fazerEmprestimo() {}
		
		public void renovarEmprestimo() {}
		
		public void devolverEmprestimo() {}
=======
		public int getDiasDeSuspensao() {
			return diasDeSuspensao;
		}
>>>>>>> branch 'main' of https://github.com/larabatista8/projeto-poo.git

		public void setDiasDeSuspensao(int diasDeSuspensao) {
			this.diasDeSuspensao = diasDeSuspensao;
		}

		public void addLivrosEmprestados(Livro livro) {
			this.livrosEmprestados.add(livro);
		}
		public void devolverLivroEmprestado(Livro livro) {
			this.livrosEmprestados.remove(livro);
		}

		
		
<<<<<<< HEAD
=======
			
>>>>>>> branch 'main' of https://github.com/larabatista8/projeto-poo.git
		
	}
		



