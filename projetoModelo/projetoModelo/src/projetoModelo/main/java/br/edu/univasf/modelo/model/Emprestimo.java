package projetoModelo.main.java.br.edu.univasf.modelo.model;

public interface Emprestimo {
	
	public void fazerEmprestimo();
	
	public void renovarEmprestimo();
	
	public void devolverEmprestimo();

	public double consultarMultas();
	
	public void pagarMultas();
	
	public void consultaEmprestimosAtuais();
	

}
