package projetoModelo.main.java.br.edu.univasf.modelo.model;

public class Documentario extends DVD {
	private String anoLancamento;
	private String diretor;
	private String paisOrigem;
	private String idioma;
	private String classificacaoIndicativa;
	
	

	public Documentario(String formato, double tamanhoArquivo, double duracao, String titulo, String autoria,
			String tema, boolean disponivel, String resolucao, String anoLancamento, String diretor, String paisOrigem,
			String idioma, String classificacaoIndicativa) {
		super(formato, tamanhoArquivo, duracao, titulo, autoria, tema, disponivel, resolucao);
		this.anoLancamento = anoLancamento;
		this.diretor = diretor;
		this.paisOrigem = paisOrigem;
		this.idioma = idioma;
		this.classificacaoIndicativa = classificacaoIndicativa;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getClassificacaoIndicativa() {
		return classificacaoIndicativa;
	}

	public void setClassificacaoIndicativa(String classificacaoIndicativa) {
		this.classificacaoIndicativa = classificacaoIndicativa;
	}
	

}
