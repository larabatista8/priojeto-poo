package projetoModelo.main.java.br.edu.univasf.modelo.model;

public class AudioLivro  extends CD{
	private int quantidadeCapitulos;

	public AudioLivro(String formato, double tamanhoArquivo, double duracao, String titulo, String autoria, String tema,
			int quantidadeCapitulos) {
		super(formato, tamanhoArquivo, duracao, titulo, autoria, tema);
		this.quantidadeCapitulos = quantidadeCapitulos;
	}

	public int getQuantidadeCapitulos() {
		return quantidadeCapitulos;
	}

	public void setQuantidadeCapitulos(int quantidadeCapitulos) {
		this.quantidadeCapitulos = quantidadeCapitulos;
	}
	
	public void reproduzir(){
		
	}
	
	public void pausar() {
		
	}
	

}
