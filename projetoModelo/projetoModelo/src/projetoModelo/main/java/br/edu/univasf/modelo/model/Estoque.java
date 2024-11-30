package projetoModelo.main.java.br.edu.univasf.modelo.model;

import java.util.ArrayList;
import java.util.Scanner;
public class Estoque implements Emprestimo{
	
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
	
	public void listarLivrosDisponiveis() {
		for(Livro it:estoqueDeLivros) {
			if(it.isDisponivel() == true)
				System.out.println(it.getTitulo());
		}
	}
	
	public void fazerEmprestimo() {
		System.out.println("Digite o titulo do livro:");
		Scanner input = new Scanner(System.in); 
		String titulo = input.nextLine();
		
		for(Livro it:estoqueDeLivros) {
			
			if(it.isDisponivel() == true && it.getTitulo().compareToIgnoreCase(titulo)==0) {
				System.out.println("Emprestimo realizado!");
				it.setDisponivel(false);
				}
			else if(it.isDisponivel()== false && it.getTitulo().compareToIgnoreCase(titulo)==0) {
				System.out.println("Livro não disponível para emprestimo");
			}
			
			}
	}

	@Override
	public void renovarEmprestimo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void devolverEmprestimo() {
		System.out.println("Digite o titulo do livro:");
		Scanner input = new Scanner(System.in); 
		String titulo = input.nextLine();
		for(Livro it:estoqueDeLivros) {
			if(it.getTitulo().compareToIgnoreCase(titulo)==0) {
				it.setDisponivel(true);
				System.out.println("Emprestimo devolvido!");
				}
		}
		
	}

	@Override
	public double consultarMultas() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void pagarMultas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultaEmprestimosAtuais() {
		// TODO Auto-generated method stub
		
	}

}
