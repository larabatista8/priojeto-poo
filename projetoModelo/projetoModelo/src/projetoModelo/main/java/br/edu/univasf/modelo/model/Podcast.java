package projetoModelo.main.java.br.edu.univasf.modelo.model;

public class Podcast extends CD {
	private int quantidadeEpisodios; 

	public Podcast(String formato, double tamanhoArquivo, double duracao, String titulo, String autoria, String tema,
			int quantidadeEpisodios) {
		super(formato, tamanhoArquivo, duracao, titulo, autoria, tema);
		this.quantidadeEpisodios = quantidadeEpisodios;
	}

	public int getQuantidadeEpisodios() {
		return quantidadeEpisodios;
	}

	public void setQuantidadeEpisodios(int quantidadeEpisodios) {
		this.quantidadeEpisodios = quantidadeEpisodios;
	}

	public void reproduzir(){
		
	}
	
	public void pausar() {
		
	}

	
}
