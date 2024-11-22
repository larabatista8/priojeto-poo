package projetoModelo.main.java.br.edu.univasf.modelo.model;

public class Midia {
	private String formato; // ex: MP3, MP4, JPEG
	private double tamanhoArquivo; // ex: 30 GB
	private double duracao; // ex 150 min
	private String titulo;
	private String autoria;
	private String tema;
	
	
	
	

	public Midia(String formato, double tamanhoArquivo, double duracao, String titulo, String autoria, String tema) {
		super();
		this.formato = formato;
		this.tamanhoArquivo = tamanhoArquivo;
		this.duracao = duracao;
		this.titulo = titulo;
		this.autoria = autoria;
		this.tema = tema;
	}


	public String getFormato() {
		return formato;
	}


	public void setFormato(String formato) {
		this.formato = formato;
	}


	public double getTamanhoArquivo() {
		return tamanhoArquivo;
	}


	public void setTamanhoArquivo(double tamanhoArquivo) {
		this.tamanhoArquivo = tamanhoArquivo;
	}


	public double getDuracao() {
		return duracao;
	}


	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutoria() {
		return autoria;
	}


	public void setAutoria(String autoria) {
		this.autoria = autoria;
	}


	public String getTema() {
		return tema;
	}


	public void setTema(String tema) {
		this.tema = tema;
	}


	public void reproduzir(){
		
	}
	
	public void pausar() {
		
	}
}
