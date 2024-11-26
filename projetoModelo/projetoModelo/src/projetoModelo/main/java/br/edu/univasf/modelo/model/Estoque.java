package projetoModelo.main.java.br.edu.univasf.modelo.model;

import java.util.ArrayList;

public class Estoque {
	
	ArrayList<Livro> estoqueDeLivros = new ArrayList<Livro>();
	ArrayList<Jornal> estoqueDeJornais = new ArrayList<Jornal>();
	
	public Estoque() {
		
	}
	
	public Estoque(ArrayList<Livro> estoqueDeLivros) {
		super();
		this.estoqueDeLivros = estoqueDeLivros;
	}
	
	
	public void buscarGenero(String genero) {
		for(Livro it:estoqueDeLivros) {
			if (it.getGenero().compareTo(genero)==0)
				it.exibirDetalhes();
				else {
			
			System.out.println("Não foi encontrado");
			
		}}

			
	}
	
	public void adicionarJornalAoEstoque(Jornal jornal) {
		this.estoqueDeJornais.add(jornal);
	}
	
	public void adicionarLivroAoEstoque(Livro livro) {
		this.estoqueDeLivros.add(livro);
	}

	public ArrayList<Livro> getEstoqueDeLivros() {
		return estoqueDeLivros;
	}

	public void setEstoqueDeLivros(ArrayList<Livro> estoqueDeLivro) {
		this.estoqueDeLivros = estoqueDeLivro;
	}

}
