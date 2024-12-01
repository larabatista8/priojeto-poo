package projetoModelo.main.java.br.edu.univasf.modelo.model;

import projetoModelo.main.java.br.edu.univasf.modelo.model.Estoque;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Livro;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Usuario;

import java.util.ArrayList;
import java.util.Scanner;
public class Estoque implements Emprestimo{
	
	ArrayList<Livro> estoqueDeLivros = new ArrayList<Livro>();
	ArrayList<Jornal> estoqueDeJornais = new ArrayList<Jornal>();
	ArrayList<CD> estoqueDeCD = new ArrayList<CD>();
	ArrayList<DVD> estoqueDeDVD = new ArrayList<DVD>();
	ArrayList<AudioLivro> estoqueDeAudioLivro = new ArrayList<AudioLivro>();
	ArrayList<Documentario> estoqueDeDocumentario = new ArrayList<Documentario>();
	
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
	
	public void listarCDs() {
	    System.out.println();
	    if (estoqueDeCD.isEmpty()) {
	        System.out.println("Nenhum CD disponível no estoque.");
	        return;
	    }

	    System.out.println("Lista de CDs Disponíveis:");
	    int i = 0;
	    for (CD cd : estoqueDeCD) {
	        System.out.println(i + " - " + cd.getTitulo());
	        i++;
	    }
	}
	
	public void listarDVDs() {
	    System.out.println();
	    if (estoqueDeDVD.isEmpty()) {
	        System.out.println("Nenhum DVD disponível no estoque.");
	        return;
	    }

	    System.out.println("Lista de DVDs Disponíveis:");
	    int i = 0;
	    for (DVD dvd : estoqueDeDVD) {
	        System.out.println(i + " - " + dvd.getTitulo());
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

	public boolean removerLivroDoEstoque(String titulo) {
	    // Verifica se o título é válido
	    if (titulo == null || titulo.isEmpty()) {
	        return false; // Título inválido
	    }

	    // Percorre o estoque de livros
	    for (int i = 0; i < estoqueDeLivros.size(); i++) {
	        Livro livro = estoqueDeLivros.get(i);
	        if (livro.getTitulo().equalsIgnoreCase(titulo)) {
	            estoqueDeLivros.remove(i); // Remove o livro da lista
	            return true; // Indica que o livro foi removido
	        }
	    }

	    return false; // Retorna false se o livro não foi encontrado
	}


	public boolean removerJornalDoEstoque(String titulo) {
	    // Verifica se o título é válido
	    if (titulo == null || titulo.isEmpty()) {
	        return false; // Título inválido
	    }

	    // Percorre o estoque de jornais
	    for (int i = 0; i < estoqueDeJornais.size(); i++) {
	        Jornal jornal = estoqueDeJornais.get(i);
	        if (jornal.getTitulo().equalsIgnoreCase(titulo)) {
	            estoqueDeJornais.remove(i); // Remove o jornal da lista
	            return true; // Indica que o jornal foi removido
	        }
	    }

	    return false; // Retorna false se o jornal não foi encontrado
	}


	public boolean removerCDDoEstoque(String titulo) {
	    // Verifica se o título é válido
	    if (titulo == null || titulo.isEmpty()) {
	        return false; // Título inválido
	    }

	    // Percorre o estoque de CDs
	    for (int i = 0; i < estoqueDeCD.size(); i++) {
	        CD cd = estoqueDeCD.get(i);
	        if (cd.getTitulo().equalsIgnoreCase(titulo)) {
	            estoqueDeCD.remove(i); // Remove o CD da lista
	            return true; // Indica que o CD foi removido
	        }
	    }

	    return false; // Retorna false se o CD não foi encontrado
	}


	public boolean removerDVDDoEstoque(String titulo) {
	    // Verifica se o título é válido
	    if (titulo == null || titulo.isEmpty()) {
	        return false; // Título inválido
	    }

	    // Percorre o estoque de DVDs
	    for (int i = 0; i < estoqueDeDVD.size(); i++) {
	        DVD dvd = estoqueDeDVD.get(i);
	        if (dvd.getTitulo().equalsIgnoreCase(titulo)) {
	            estoqueDeDVD.remove(i); // Remove o DVD da lista
	            return true; // Indica que o DVD foi removido
	        }
	    }

	    return false; // Retorna false se o DVD não foi encontrado
	}


	public void adicionarCDAoEstoque(CD novoCD) {
		this.estoqueDeCD.add(novoCD);
	}

	public void adicionarDVDAoEstoque(DVD novoDVD) {
		this.estoqueDeDVD.add(novoDVD);
		
	}
	
	


	

	
	}

