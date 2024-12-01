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
	
	public void listarLivros() {
		System.out.println();
	    if (estoqueDeLivros.isEmpty()) {
	        System.out.println("Nenhum livro disponível no estoque.");
	        return;
	    }

	    System.out.println("Lista de Livros Disponíveis:");
	    int i = 0;
	    for (Livro livro : estoqueDeLivros) {
	        System.out.println(i + " - " + livro.getTitulo());
	        i++;
	    }
	}
	
	public void listarJornais() {
		System.out.println();
	    if (estoqueDeJornais.isEmpty()) {
	        System.out.println("Nenhum jornal disponível no estoque.");
	        return;
	    }

	    System.out.println("Lista de Jornais Disponíveis:");
	    int i = 0;
	    for (Jornal jornal : estoqueDeJornais) {
	        System.out.println(i + " - " + jornal.getTitulo());
	        i++;
	    }
	}

}
