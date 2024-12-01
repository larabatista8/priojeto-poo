package projetoModelo.main.java.br.edu.univasf.modelo.model;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
		Livro livro2 = new Livro("Livro2", "subt", "autor", "kk", "ddsdf", "fdfgds", 0, 0, "dfs", "dfrodpf", false);
		ArrayList<Livro>listaLivro=new ArrayList<Livro>();
		listaLivro.add(livro2);
		Estoque estoque1 = new Estoque(listaLivro);
		estoque1.setEstoqueDeLivros(listaLivro);
		estoque1.buscarGenero("ddsdf");

	}

}
