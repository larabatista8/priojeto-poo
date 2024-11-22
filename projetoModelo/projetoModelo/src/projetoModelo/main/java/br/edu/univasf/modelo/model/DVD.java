package projetoModelo.main.java.br.edu.univasf.modelo.model;

public class DVD  extends Midia{
	
	private String resolucao; // ex 1920x1080

	
	

	public DVD(String formato, double tamanhoArquivo, double duracao, String titulo, String autoria, String tema,
			String resolucao) {
		super(formato, tamanhoArquivo, duracao, titulo, autoria, tema);
		this.resolucao = resolucao;
	}


	public String getResolucao() {
		return resolucao;
	}


	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}

	public void reproduzir(){
		
	}
	
	public void pausar() {
		
	}

}
