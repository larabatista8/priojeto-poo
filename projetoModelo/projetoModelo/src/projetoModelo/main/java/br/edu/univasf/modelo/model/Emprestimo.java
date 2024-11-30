package projetoModelo.main.java.br.edu.univasf.modelo.model;

public interface Emprestimo {
	
	public void fazerEmprestimo(Usuario user);
	
	public void renovarEmprestimo();
	
	public void devolverEmprestimo(Usuario user);

	public int consultarSuspensao(Usuario user);
	
	public void removerSuspensao(Usuario user);
	

	void consultarEmprestimosAtuais(Usuario user);

	
	

}
