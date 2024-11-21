package projetoModelo.main.java.br.edu.univasf.modelo.model;

import java.util.ArrayList;

public class Estoque {
	
	public Estoque() {
		
	}
	
	public Estoque(ArrayList<Livro> estoqueDeLivro) {
		super();
		this.estoqueDeLivro = estoqueDeLivro;
	}

	private ArrayList<Livro>estoqueDeLivro;
	private ArrayList<Jornal>estoqueDeJornal;
	
	
	public void buscarGenero(String genero) {
		for(Livro it:estoqueDeLivro) {
			if (it.getGenero().compareTo(genero)==0)
				it.exibirDetalhes();
				else {
			
			System.out.println("Não foi encontrado");
			
		}}

			
	}
	
	public void adicionarJornalAoEstoque(Jornal jornal) {
		this.estoqueDeJornal.add(jornal);
	}
	
	public void adicionarLivroAoEstoque(Livro livro) {
		this.estoqueDeLivro.add(livro);
	}

	public ArrayList<Livro> getEstoqueDeLivro() {
		return estoqueDeLivro;
	}

	public void setEstoqueDeLivro(ArrayList<Livro> estoqueDeLivro) {
		this.estoqueDeLivro = estoqueDeLivro;
	}

}
