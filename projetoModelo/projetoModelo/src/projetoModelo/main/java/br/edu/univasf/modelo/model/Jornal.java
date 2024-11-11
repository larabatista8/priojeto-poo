package projetoModelo.main.java.br.edu.univasf.modelo.model;

public class Jornal extends Publicacao{
	

	private String dataPublicacao;
	
	public Jornal(String titulo, String autor, int anoPublicacao) {
		super(titulo, autor, anoPublicacao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void exibirDetalhes() {
		// TODO Auto-generated method stub
		
	}

	public String getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	
	
	

}
