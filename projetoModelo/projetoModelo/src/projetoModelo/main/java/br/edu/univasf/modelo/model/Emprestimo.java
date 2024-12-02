package projetoModelo.main.java.br.edu.univasf.modelo.model;

public interface Emprestimo {
	
	public void fazerEmprestimo(Usuario user);
	
	public void fazerEmprestimoPodcast(Usuario user);
	public void fazerEmprestimoAudioLivro(Usuario user);
	public void fazerEmprestimoVideoAula(Usuario user);
	public void fazerEmprestimoDocumentario(Usuario user);
	
	public void renovarEmprestimo(Usuario user);
	
	public void devolverEmprestimo(Usuario user);
	public void devolverEmprestimoJornal(Usuario user);
	public void devolverEmprestimoPodcast(Usuario user);
	public void devolverEmprestimoAudioLivro(Usuario user);
	public void devolverEmprestimoVideoAula(Usuario user);
	public void devolverEmprestimoDocumentario(Usuario user);

	public int consultarSuspensao(Usuario user);
	
	public void removerSuspensao(Usuario user);
	

	void consultarEmprestimosAtuais(Usuario user);

	
	

}
