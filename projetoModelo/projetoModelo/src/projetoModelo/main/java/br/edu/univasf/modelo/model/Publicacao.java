package projetoModelo.main.java.br.edu.univasf.modelo.model;

public abstract class Publicacao {
	
	 	private String titulo;
	    private String autor;
	    private int anoPublicacao;

	    
	    public Publicacao(String titulo, String autor, int anoPublicacao) {
			super();
			this.titulo = titulo;
			this.autor = autor;
			this.anoPublicacao = anoPublicacao;
		}

		public String getTitulo() {
	        return titulo;
	    }

	    public String getAutor() {
	        return autor;
	    }

	    public int getAnoPublicacao() {
	        return anoPublicacao;
	    }
	    

	    
	    public void setTitulo(String titulo) {
			this.titulo = titulo;
		}


		public void setAutor(String autor) {
			this.autor = autor;
		}


		public void setAnoPublicacao(int anoPublicacao) {
			this.anoPublicacao = anoPublicacao;
		}


		public abstract void exibirDetalhes();
	}


