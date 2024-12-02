package projetoModelo.main.java.br.edu.univasf.modelo.model;

import projetoModelo.main.java.br.edu.univasf.modelo.model.Estoque;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Livro;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Usuario;

import java.util.ArrayList;
import java.util.Scanner;
public class Estoque implements Emprestimo{
	
	ArrayList<Livro> estoqueDeLivros = new ArrayList<Livro>();
	ArrayList<Jornal> estoqueDeJornais = new ArrayList<Jornal>();

	ArrayList<Podcast> estoqueDePodcasts = new ArrayList<Podcast>();
	ArrayList<AudioLivro> estoqueDeAudioLivro = new ArrayList<AudioLivro>();
	ArrayList<Documentario> estoqueDeDocumentario = new ArrayList<Documentario>(); 
	ArrayList<VideoAula> estoqueDeVideoAula = new ArrayList<VideoAula>();
	

	ArrayList<CD> estoqueDeCD = new ArrayList<CD>();
	ArrayList<DVD> estoqueDeDVD = new ArrayList<DVD>();

	
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
	public void listarObrasDisponiveis() {
		System.out.println("Livros disponiveis para emprestimo:");
		for(Livro it:estoqueDeLivros) {
			if(it.isDisponivel() == true)
				System.out.println(it.getTitulo());
		}
		
		System.out.println("\nJornais disponiveis para emprestimo:");
		for(Jornal it:estoqueDeJornais) {
			if(it.isDisponivel() == true)
				System.out.println(it.getTitulo());
		}
		
		System.out.println("\nPodcasts disponiveis para emprestimo:");
		for(Podcast it:estoqueDePodcasts) {
			if(it.isDisponivel() == true)
				System.out.println(it.getTitulo());
		}
		
		System.out.println("\nAudiolivros disponiveis para emprestimo:");
		for(AudioLivro it:estoqueDeAudioLivro) {
			if(it.isDisponivel() == true)
				System.out.println(it.getTitulo());
		}
		
		System.out.println("\nDocumentarios disponiveis para emprestimo:");
		for(Documentario it:estoqueDeDocumentario) {
			if(it.isDisponivel() == true)
				System.out.println(it.getTitulo());
		}
		
		System.out.println("\nVideoAulas disponiveis para emprestimo:");
		for(VideoAula it:estoqueDeVideoAula) {
			if(it.isDisponivel() == true)
				System.out.println(it.getTitulo());
		}
		
	}
	
	public void menuFazerEmprestimo(Usuario user) {
		System.out.println("1. Fazer emprestimo de Livro");
		System.out.println("2. Fazer emprestimo de Jornal");
		System.out.println("3. Fazer emprestimo de Podcast");
		System.out.println("4. Fazer emprestimo de AudioLivro");
		System.out.println("5. Fazer emprestimo de Documentario");
		System.out.println("6. Fazer emprestimo de VideoAula");
		System.out.print("Digite a opção desejada: ");
		Scanner input = new Scanner(System.in); 
		int opcao = input.nextInt();
		
		switch(opcao) {
		case 1:
			fazerEmprestimo(user);
			break;
		case 2:
			fazerEmprestimoJornal(user);
			break;
		case 3:
			fazerEmprestimoPodcast(user);
			break;
		case 4:
			fazerEmprestimoAudioLivro(user);
			break;
		case 5:
			fazerEmprestimoDocumentario(user);
			break;	
		case 6:
			fazerEmprestimoVideoAula(user);
			break;
		default: 
			System.out.println("Opção inválida");
		}
		
			
	}
	
	
	public void fazerEmprestimo(Usuario user) {
		System.out.println("\nDigite o titulo do livro:");
		Scanner input = new Scanner(System.in); 
		String titulo = input.nextLine();
		
		if(user.getDiasDeSuspensao()>0) System.out.println("Não é possível realizar o empréstimo!\n "
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
	public void renovarEmprestimo(Usuario user) {
		// TODO Auto-generated method stub
		
		System.out.println("1. Renovar Livro");
		System.out.println("2. Renovar Jornal");
		System.out.println("3. Renovar Podcast");
		System.out.println("4. Renovar AudioLivro");
		System.out.println("5. Renovar Documentario");
		System.out.println("6. Renovar VideoAula");
		System.out.print("Digite a opção desejada: ");
		Scanner input = new Scanner(System.in); 
		int opcao = input.nextInt();
		switch(opcao) {
		case 1:
			System.out.println("Digite o titulo do livro");
			String titulo = input.nextLine();
			System.out.println("Emprestimo Renovado");
			break;
		case 2:
			System.out.println("Digite o titulo do jornal");
			titulo = input.nextLine();
			System.out.println("Emprestimo Renovado");
			
			break;
		case 3:
			System.out.println("Digite o titulo do podcast");
			titulo = input.nextLine();
			System.out.println("Emprestimo Renovado");
			break;
		case 4:
			System.out.println("Digite o titulo do audiolivro");
			titulo = input.nextLine();
			System.out.println("Emprestimo Renovado");
			break;
		case 5:
			System.out.println("Digite o titulo do documentario");
			titulo = input.nextLine();
			System.out.println("Emprestimo Renovado");
			break;	
		case 6:
			System.out.println("Digite o titulo da videoaula");
			titulo = input.nextLine();
			System.out.println("Emprestimo Renovado");
			break;
		default: 
			System.out.println("Opção inválida");
		}
		
		
	}
	public void menuDevolucao(Usuario user) {
		System.out.println("1. Devolver Livro");
		System.out.println("2. Devolver Jornal");
		System.out.println("3. Devolver Podcast");
		System.out.println("4. Devolver AudioLivro");
		System.out.println("5. Devolver Documentario");
		System.out.println("6. Devolver VideoAula");
		System.out.print("Digite a opção desejada: ");
		Scanner input = new Scanner(System.in); 
		int opcao = input.nextInt();
		
		switch(opcao) {
		case 1:
			devolverEmprestimo(user);
			break;
		case 2:
			devolverEmprestimoJornal(user);
			break;
		case 3:
			devolverEmprestimoPodcast(user);
			break;
		case 4:
			devolverEmprestimoAudioLivro(user);
			break;
		case 5:
			devolverEmprestimoDocumentario(user);
			break;	
		case 6:
			devolverEmprestimoVideoAula(user);
			break;
		default: 
			System.out.println("Opção inválida");
		}
		
		
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
	public void devolverEmprestimoPodcast(Usuario user) {
		// TODO Auto-generated method stub
		System.out.println("\nDigite o titulo do podcast a ser devolvido:");
		Scanner input = new Scanner(System.in); 
		String titulo = input.nextLine();
		for(Podcast it:estoqueDePodcasts) {
			if(it.getTitulo().compareToIgnoreCase(titulo)==0) {
			user.devolverPOdcastEmprestado(it);
				it.setDisponivel(true);
				System.out.println("Emprestimo devolvido!");
				}
		}
	}

	@Override
	public void devolverEmprestimoAudioLivro(Usuario user) {
		// TODO Auto-generated method stub
		System.out.println("\nDigite o titulo do audiolivro a ser devolvido:");
		Scanner input = new Scanner(System.in); 
		String titulo = input.nextLine();
		for(AudioLivro it:estoqueDeAudioLivro) {
			if(it.getTitulo().compareToIgnoreCase(titulo)==0) {
			user.devolverAudioLivroEmprestado(it);
				it.setDisponivel(true);
				System.out.println("Emprestimo devolvido!");
				}
		}
		
	}

	@Override
	public void devolverEmprestimoVideoAula(Usuario user) {
		// TODO Auto-generated method stub
		System.out.println("\nDigite o titulo da videoaula a ser devolvida:");
		Scanner input = new Scanner(System.in); 
		String titulo = input.nextLine();
		for(VideoAula it:estoqueDeVideoAula) {
			if(it.getTitulo().compareToIgnoreCase(titulo)==0) {
			user.devolverVideoAulasEmprestado(it);
				it.setDisponivel(true);
				System.out.println("Emprestimo devolvido!");
				}
		}
		
	}

	@Override
	public void devolverEmprestimoDocumentario(Usuario user) {
		// TODO Auto-generated method stub
		System.out.println("\nDigite o titulo do documentario a ser devolvido:");
		Scanner input = new Scanner(System.in); 
		String titulo = input.nextLine();
		for(Documentario it:estoqueDeDocumentario) {
			if(it.getTitulo().compareToIgnoreCase(titulo)==0) {
			user.devolverDocumentariosEmprestados(it);
				it.setDisponivel(true);
				System.out.println("Emprestimo devolvido!");
				}
		}
	}
	
	@Override
	public void devolverEmprestimoJornal(Usuario user) {
		// TODO Auto-generated method stub
		System.out.println("\nDigite o titulo do jornal a ser devolvido:");
		Scanner input = new Scanner(System.in); 
		String titulo = input.nextLine();
		for(Jornal it:estoqueDeJornais) {
			if(it.getTitulo().compareToIgnoreCase(titulo)==0) {
			user.devolverJornalEmprestado(it);
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
			System.out.println("\nNenhum emprestimo de livro");
		}
		else {	
				for(Livro it: lista) {
					System.out.println(it.getTitulo());
				}
			}
		
		ArrayList<Jornal> listaJornal = user.getJornaisEmprestados();
		if(listaJornal.isEmpty()) {
			System.out.println("\nNenhum emprestimo de jornal");
		}
		else {	
				for(Jornal it: listaJornal) {
					System.out.println(it.getTitulo());
				}
			}
		
		ArrayList<Podcast> listaPodcast = user.getPodcastsEmprestados();
		if(listaPodcast.isEmpty()) {
			System.out.println("\nNenhum emprestimo de podcast");
		}
		else {	
				for(Podcast it: listaPodcast) {
					System.out.println(it.getTitulo());
				}
			}
		
		ArrayList<AudioLivro> listaAudioLivro = user.getAudioLivroEmprestados();
		if(listaAudioLivro.isEmpty()) {
			System.out.println("\nNenhum emprestimo de audiolivro");
		}
		else {	
				for(AudioLivro it: listaAudioLivro) {
					System.out.println(it.getTitulo());
				}
			}
		
		ArrayList<Documentario> listaDocumentario = user.getDocumentariosEmprestados();
		if(listaDocumentario.isEmpty()) {
			System.out.println("\nNenhum emprestimo de documentario");
		}
		else {	
				for(Documentario it: listaDocumentario) {
					System.out.println(it.getTitulo());
				}
			}
		
		ArrayList<VideoAula> listaVideoAula = user.getVideoAulaEmprestados();
		if(listaVideoAula.isEmpty()) {
			System.out.println("\nNenhum emprestimo de videoaula");
		}
		else {	
				for(VideoAula it: listaVideoAula) {
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


	@Override
	public void fazerEmprestimoPodcast(Usuario user) {
		// TODO Auto-generated method stub
		System.out.println("\nDigite o titulo do podcast:");
		Scanner input = new Scanner(System.in); 
		String titulo = input.nextLine();
		
		if(user.getDiasDeSuspensao()>0) System.out.println("Não é possível realizar o empréstimo!\n "
				+ "Você possui"+ user.getDiasDeSuspensao() + "dias de suspensão");
		else {
		for(Podcast it:estoqueDePodcasts) {
		
			if(it.isDisponivel() == true && it.getTitulo().compareToIgnoreCase(titulo)==0) {
				user.addPodcastsEmprestados(it);
				System.out.println("\nEmprestimo realizado!");
				it.setDisponivel(false);
				}
			else if(it.isDisponivel()== false && it.getTitulo().compareToIgnoreCase(titulo)==0) {
				System.out.println("\nPodcast não disponível para emprestimo");
				}
			
					} 
		}
		
	}

	@Override
	public void fazerEmprestimoAudioLivro(Usuario user) {
		// TODO Auto-generated method stub
		System.out.println("\nDigite o titulo do audiolivro:");
		Scanner input = new Scanner(System.in); 
		String titulo = input.nextLine();
		
		if(user.getDiasDeSuspensao()>0) System.out.println("Não é possível realizar o empréstimo!\n "
				+ "Você possui"+ user.getDiasDeSuspensao() + "dias de suspensão");
		else {
		for(AudioLivro it:estoqueDeAudioLivro) {
			
			if(it.isDisponivel() == true && it.getTitulo().compareToIgnoreCase(titulo)==0) {
				user.addAudioLivrosEmprestados(it);
				System.out.println("\nEmprestimo realizado!");
				it.setDisponivel(false);
				}
			else if(it.isDisponivel()== false && it.getTitulo().compareToIgnoreCase(titulo)==0) {
				System.out.println("\nAudiolivro não disponível para emprestimo");
				}
			
					} 
		}
		
	}

	@Override
	public void fazerEmprestimoVideoAula(Usuario user) {
		// TODO Auto-generated method stub
		System.out.println("\nDigite o titulo da videoaula:");
		Scanner input = new Scanner(System.in); 
		String titulo = input.nextLine();
		
		if(user.getDiasDeSuspensao()>0) System.out.println("Não é possível realizar o empréstimo!\n "
				+ "Você possui"+ user.getDiasDeSuspensao() + "dias de suspensão");
		else {
		for(VideoAula it:estoqueDeVideoAula) {
			
			if(it.isDisponivel() == true && it.getTitulo().compareToIgnoreCase(titulo)==0) {
				user.addVideoAulasEmprestados(it);
				System.out.println("\nEmprestimo realizado!");
				it.setDisponivel(false);
				}
			else if(it.isDisponivel()== false && it.getTitulo().compareToIgnoreCase(titulo)==0) {
				System.out.println("\nPodcast não disponível para emprestimo");
				}
			
					} 
		}
		
	}

	@Override
	public void fazerEmprestimoDocumentario(Usuario user) {
		// TODO Auto-generated method stub
		System.out.println("\nDigite o titulo do documentario:");
		Scanner input = new Scanner(System.in); 
		String titulo = input.nextLine();
		
		if(user.getDiasDeSuspensao()>0) System.out.println("Não é possível realizar o empréstimo!\n "
				+ "Você possui"+ user.getDiasDeSuspensao() + "dias de suspensão");
		else {
		for(Documentario it:estoqueDeDocumentario) {
			
			if(it.isDisponivel() == true && it.getTitulo().compareToIgnoreCase(titulo)==0) {
				user.addDocumentariosEmprestados(it);
				System.out.println("\nEmprestimo realizado!");
				it.setDisponivel(false);
				}
			else if(it.isDisponivel()== false && it.getTitulo().compareToIgnoreCase(titulo)==0) {
				System.out.println("\nPodcast não disponível para emprestimo");
				}
			
					} 
		}
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

	
	public void fazerEmprestimoJornal(Usuario user) {
		System.out.println("\nDigite o titulo do jornal:");
		Scanner input = new Scanner(System.in); 
		String titulo = input.nextLine();
		
		if(user.getDiasDeSuspensao()>0) System.out.println("Não é possível realizar o empréstimo!\n "
				+ "Você possui"+ user.getDiasDeSuspensao() + "dias de suspensão");
		else {
		for(Jornal it:estoqueDeJornais) {
			
			if(it.isDisponivel() == true && it.getTitulo().compareToIgnoreCase(titulo)==0) {
				user.addJonaisEmprestados(it);
				System.out.println("\nEmprestimo realizado!");
				it.setDisponivel(false);
				}
			else if(it.isDisponivel()== false && it.getTitulo().compareToIgnoreCase(titulo)==0) {
				System.out.println("\nJornal não disponível para emprestimo");
				}
			
					} 
		}
	}
	
	public ArrayList<Jornal> getEstoqueDeJornais() {
		return estoqueDeJornais;
	}

	public void setEstoqueDeJornais(ArrayList<Jornal> estoqueDeJornais) {
		this.estoqueDeJornais = estoqueDeJornais;
	}

	public ArrayList<Podcast> getEstoqueDePodcasts() {
		return estoqueDePodcasts;
	}

	public void setEstoqueDePodcasts(ArrayList<Podcast> estoqueDePodcasts) {
		this.estoqueDePodcasts = estoqueDePodcasts;
	}

	public ArrayList<AudioLivro> getEstoqueDeAudioLivro() {
		return estoqueDeAudioLivro;
	}

	public void setEstoqueDeAudioLivro(ArrayList<AudioLivro> estoqueDeAudioLivro) {
		this.estoqueDeAudioLivro = estoqueDeAudioLivro;
	}

	public ArrayList<Documentario> getEstoqueDeDocumentario() {
		return estoqueDeDocumentario;
	}

	public void setEstoqueDeDocumentario(ArrayList<Documentario> estoqueDeDocumentario) {
		this.estoqueDeDocumentario = estoqueDeDocumentario;
	}

	public ArrayList<VideoAula> getEstoqueDeVideoAula() {
		return estoqueDeVideoAula;
	}

	public void setEstoqueDeVideoAula(ArrayList<VideoAula> estoqueDeVideoAula) {
		this.estoqueDeVideoAula = estoqueDeVideoAula;
	}

	

	
	

	
	}

