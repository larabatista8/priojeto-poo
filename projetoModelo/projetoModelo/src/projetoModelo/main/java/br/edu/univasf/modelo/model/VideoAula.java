package projetoModelo.main.java.br.edu.univasf.modelo.model;

public class VideoAula extends DVD {

	private String disciplina;

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public VideoAula(String formato, double tamanhoArquivo, double duracao, String titulo, String autoria, String tema,
			String resolucao, String disciplina) {
		super(formato, tamanhoArquivo, duracao, titulo, autoria, tema, resolucao);
		this.disciplina = disciplina;
	}
	

}
