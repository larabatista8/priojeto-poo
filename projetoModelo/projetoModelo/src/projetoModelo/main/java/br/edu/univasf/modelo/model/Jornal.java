package projetoModelo.main.java.br.edu.univasf.modelo.model;

public class Jornal extends Publicacao{
	

	private String dataPublicacao;
	private boolean disponivel;


	

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public Jornal(String titulo, String autor, int anoPublicacao, String dataPublicacao, boolean disponivel) {
		super(titulo, autor, anoPublicacao);
		this.dataPublicacao = dataPublicacao;
		this.disponivel = disponivel;
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
