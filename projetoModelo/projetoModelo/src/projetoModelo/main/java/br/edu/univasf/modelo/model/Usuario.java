package projetoModelo.main.java.br.edu.univasf.modelo.model;
import java.util.ArrayList;
	public class Usuario  {
		private String nome;
		private String matricula;
		private String email;
		
		public Usuario(String nome, String matricula, String email) {
			super();
			this.nome = nome;
			this.matricula = matricula;
			this.email = email;
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
		
		
		public void login() {
			
		}
		
		public void logout() {
		
				}
		
		public void fazerEmprestimo() {
			
		}
		
		public void renovarEmprestimo() {}
		
		public void devolverEmprestimo() {}

		public double consultarMultas() {
			return 0;
			}
		
		public void pagarMultas() {}
		
		public void consultaEmprestimosAtuais() {}
		
		
		public void consultarLivrosDisponiveis() {}
		
		
	}



