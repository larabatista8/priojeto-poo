package projetoModelo.main.java.br.edu.univasf.modelo.model;

import java.util.ArrayList;

public class Estoque {
	
	
	public Estoque(ArrayList<Livro> estoqueDeLivro) {
		super();
		this.estoqueDeLivro = estoqueDeLivro;
	}

	private ArrayList<Livro>estoqueDeLivro;
	
	
	public void buscarGenero(String genero) {
		for(Livro it:estoqueDeLivro) {
			if (it.getGenero().compareTo(genero)==0)
				it.exibirDetalhes();
				else {
			
			System.out.println("Não foi encontrado");
			
		}}

			
	}

	public ArrayList<Livro> getEstoqueDeLivro() {
		return estoqueDeLivro;
	}

	public void setEstoqueDeLivro(ArrayList<Livro> estoqueDeLivro) {
		this.estoqueDeLivro = estoqueDeLivro;
	}

}
