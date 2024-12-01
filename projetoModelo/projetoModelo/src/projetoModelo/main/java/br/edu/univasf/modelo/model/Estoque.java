package projetoModelo.main.java.br.edu.univasf.modelo.model;

import projetoModelo.main.java.br.edu.univasf.modelo.model.Estoque;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Livro;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Usuario;

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
	
<<<<<<< HEAD
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
	
	public void listarLivrosDisponiveis() {
		for(Livro it:estoqueDeLivros) {
			if(it.isDisponivel() == true)
				System.out.println(it.getTitulo());
		}
	}
	
	public void fazerEmprestimo(Usuario user) {
		System.out.println("\nDigite o titulo do livro:");
		Scanner input = new Scanner(System.in); 
		String titulo = input.nextLine();
		
		if(user.getDiasDeSuspensao()>0) System.out.println("Não é possível realizar o empr´stimo!\n "
				+ "Você possui"+ user.getDiasDeSuspensao() + "dias de suspensão");
		else {
		for(Livro it:estoqueDeLivros) {
			
			if(it.isDisponivel() == true && it.getTitulo().compareToIgnoreCase(titulo)==0) {
				user.addLivrosEmprestados(it);
				System.out.println("\nEmprestimo realizado!");
				it.setDisponivel(false);
				}
			else if(it.isDisponivel()== false && it.getTitulo().compareToIgnoreCase(titulo)==0) {
				System.out.println("\nLivro não disponível para emprestimo");
				}
			
					} 
		}
>>>>>>> branch 'main' of https://github.com/larabatista8/projeto-poo.git
	}

	@Override
	public void renovarEmprestimo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void devolverEmprestimo(Usuario user) {
		System.out.println("\nDigite o titulo do livro a ser devolvido:");
		Scanner input = new Scanner(System.in); 
		String titulo = input.nextLine();
		for(Livro it:estoqueDeLivros) {
			if(it.getTitulo().compareToIgnoreCase(titulo)==0) {
			user.devolverLivroEmprestado(it);
				it.setDisponivel(true);
				System.out.println("Emprestimo devolvido!");
				}
		}
		
	}

	@Override
	public void consultarEmprestimosAtuais(Usuario user) {
		// TODO Auto-generated method stub
		ArrayList<Livro> lista = user.getLivrosEmprestados();
		if(lista.isEmpty()) {
			System.out.println("Nenhum emprestimo ativo");
		}
		else {	
				for(Livro it: lista) {
					System.out.println(it.getTitulo());
				}
			}
		}

	
	@Override
	public int consultarSuspensao(Usuario user){
		// TODO Auto-generated method stub
		return user.getDiasDeSuspensao();
	}

	@Override
	public void removerSuspensao(Usuario user) {
		// TODO Auto-generated method stub
		user.setDiasDeSuspensao(0);
		
	}
	
	


	

	
	}


