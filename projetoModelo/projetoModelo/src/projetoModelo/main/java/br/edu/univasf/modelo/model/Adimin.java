package projetoModelo.main.java.br.edu.univasf.modelo.model;

import java.util.Scanner;

	public class Adimin  extends Usuario{
		
		private Scanner scanner = new Scanner(System.in);

		public Adimin(String nome, String matricula, String email) {
			super(nome, matricula, email);
			// TODO Auto-generated constructor stub
		}

		
		public void addLivro(Estoque estoque) {
	        if (estoque == null) {
	            System.out.println("Erro: Estoque não pode ser nulo.");
	            return;
	        }
	        System.out.println("=== Cadastro de Livro ===");
	        System.out.print("Digite o título do livro: ");
	        String titulo = scanner.nextLine();

	        System.out.print("Digite o subtítulo do livro: ");
	        String subTitulo = scanner.nextLine();

	        System.out.print("Digite o autor do livro: ");
	        String autor = scanner.nextLine();

	        System.out.print("Digite a sinopse do livro: ");
	        String sinopse = scanner.nextLine();

	        System.out.print("Digite o gênero do livro: ");
	        String genero = scanner.nextLine();

	        System.out.print("Digite o ISBN do livro: ");
	        String isbn = scanner.nextLine();

	        System.out.print("Digite o número de páginas: ");
	        int numeroDePaginas = scanner.nextInt();
	        scanner.nextLine(); // Consumir o \n

	        System.out.print("Digite o ano de publicação: ");
	        int anoPublicacao = scanner.nextInt();
	        scanner.nextLine(); // Consumir o \n

	        System.out.print("Digite o sumário do livro: ");
	        String sumario = scanner.nextLine();

	        System.out.print("Digite o nome da editora: ");
	        String nomeEditora = scanner.nextLine();


	        Livro novoLivro = new Livro(titulo, autor, subTitulo, sinopse, genero, isbn, numeroDePaginas,
	                anoPublicacao, sumario, nomeEditora, true);

	        estoque.adicionarLivroAoEstoque(novoLivro);
	        System.out.println("Livro adicionado ao estoque com sucesso!");
		}
		
		public void addJornal(Estoque estoque) {
			if (estoque == null) {
	            System.out.println("Erro: Estoque não pode ser nulo.");
	            return;
	        }
			
			System.out.println();
	        System.out.println("=== Cadastro de Jornal ===");
	        System.out.print("Digite o título do jornal: ");
	        String titulo = scanner.nextLine();

	        System.out.print("Digite o autor do jornal: ");
	        String autor = scanner.nextLine();
	        
	        System.out.print("Digite o ano de publicação do jornal: ");
	        int anoPublicacao = scanner.nextInt();
	        scanner.nextLine();
	        
	        Jornal novoJornal = new Jornal(titulo,autor,anoPublicacao, autor, true);
	        
	        estoque.adicionarJornalAoEstoque(novoJornal);
	        System.out.println("Jornal adicionado ao estoque com sucesso!");
		}
		
		public void addCD(Estoque estoque) {
	        if (estoque == null) {
	            System.out.println("Erro: Estoque não pode ser nulo.");
	            return;
	        }
	        
	        System.out.println("=== Cadastro de CD ===");
	        System.out.print("Digite o título do CD: ");
	        String titulo = scanner.nextLine();
	        
	        System.out.print("Digite o artista/banda: ");
	        String autoria = scanner.nextLine();
	        
	        System.out.print("Digite o gênero musical: ");
	        String tema = scanner.nextLine();
	        
	        System.out.print("Digite a duração total (em minutos): ");
	        double duracao = scanner.nextDouble();
	        scanner.nextLine();
	        
	        System.out.print("Digite o formato: ");
	        String formato = scanner.nextLine();
	        scanner.nextLine();
	        
	        System.out.print("Digite o tamanho do arquivo: ");
	        int tamanhoArquivo = scanner.nextInt();
	        scanner.nextLine();
	        
	        CD novoCD = new CD(formato, tamanhoArquivo, duracao, titulo, autoria, tema, true);
	        estoque.adicionarCDAoEstoque(novoCD);
	        
	        System.out.println("CD adicionado ao estoque com sucesso!");
	    }

		public void addDVD(Estoque estoque) {
		    if (estoque == null) {
		        System.out.println("Erro: Estoque não pode ser nulo.");
		        return;
		    }
		    
		    System.out.println("=== Cadastro de DVD ===");
		    System.out.print("Digite o título do DVD: ");
		    String titulo = scanner.nextLine();
		    
		    System.out.print("Digite o diretor do DVD: ");
		    String autoria = scanner.nextLine();
		    
		    System.out.print("Digite o gênero do DVD: ");
		    String tema = scanner.nextLine();
		    
		    System.out.print("Digite a duração total (em minutos): ");
		    double duracao = scanner.nextDouble();
		    scanner.nextLine(); // Consumir o \n residual
		    
		    System.out.print("Digite o tamanho do arquivo (em MB): ");
		    double tamanhoArquivo = scanner.nextDouble();
		    scanner.nextLine(); // Consumir o \n residual
		    
		    System.out.print("Digite o formato do DVD: ");
		    String formato = scanner.nextLine();
		    
		    DVD novoDVD = new DVD(formato, tamanhoArquivo, duracao, titulo, autoria, tema, true, formato);
		    estoque.adicionarDVDAoEstoque(novoDVD);
		    
		    System.out.println("DVD adicionado ao estoque com sucesso!");
		}
		
		public void addDocumentario(Estoque estoque) {
		    if (estoque == null) {
		        System.out.println("Erro: Estoque não pode ser nulo.");
		        return;
		    }

		    System.out.println("=== Cadastro de Documentário ===");
		    System.out.print("Digite o título do documentário: ");
		    String titulo = scanner.nextLine();

		    System.out.print("Digite o pais de origem do documentário: ");
		    String paisOrigem = scanner.nextLine();
		    
		    System.out.print("Digite a autoria do documentário: ");
		    String autoria = scanner.nextLine();

		    System.out.print("Digite o diretor do documentário: ");
		    String diretor = scanner.nextLine();
		    
		    System.out.print("Digite o gênero do documentário: ");
		    String tema = scanner.nextLine();

		    System.out.print("Digite o idioma do documentário: ");
		    String idioma = scanner.nextLine();
		    
		    System.out.print("Digite a classificacao indicativa do documentário: ");
		    String classificacaoIndicativa = scanner.nextLine();
		    
		    System.out.print("Digite a classificacao indicativa do documentário: ");
		    String anoLancamento = scanner.nextLine();
		    
		    System.out.print("Digite a duração total (em minutos): ");
		    double duracao = scanner.nextDouble();
		    scanner.nextLine(); // Consumir o \n residual
		    
		    System.out.print("Digite o tamanho do arquivo (em MB): ");
		    double tamanhoArquivo = scanner.nextDouble();
		    scanner.nextLine(); // Consumir o \n residual
		    
		    System.out.print("Digite o formato do documetário: ");
		    String formato = scanner.nextLine();
		    
		    System.out.print("Digite a resolução: ");
		    String resolucao = scanner.nextLine();

		    Documentario novoDocumentario = new Documentario(formato, tamanhoArquivo, duracao, titulo, autoria,
					tema, anoLancamento, diretor, paisOrigem, idioma, classificacaoIndicativa,resolucao);
		    
		    estoque.adicionarDocumentarioAoEstoque(novoDocumentario);


		    System.out.println("Documentário adicionado ao estoque com sucesso!");
		}

		public void listarDocumentarios(Estoque estoque) {
		    if (estoque == null) {
		        System.out.println("Erro: Estoque não pode ser nulo.");
		        return;
		    }

		    System.out.println("=== Lista de Documentários ===");
		    estoque.listarDocumentarios();
		}

		public void apagaDocumentario(Estoque estoque) {
		    if (estoque == null) {
		        System.out.println("Erro: Estoque não pode ser nulo.");
		        return;
		    }

		    System.out.println("=== Remover Documentário ===");
		    System.out.print("Digite o título do documentário a ser removido: ");
		    String titulo = scanner.nextLine();

		    if (estoque.removerDocumentarioDoEstoque(titulo)) {
		        System.out.println("Documentário removido do estoque com sucesso!");
		    } else {
		        System.out.println("Erro: Documentário não encontrado.");
		    }
		}
		
		public void addAudiolivro(Estoque estoque) {
		    if (estoque == null) {
		        System.out.println("Erro: Estoque não pode ser nulo.");
		        return;
		    }

		    System.out.println("=== Cadastro de Audiolivro ===");
		    System.out.print("Digite o título do audiolivro: ");
		    String titulo = scanner.nextLine();

		    System.out.print("Digite o autor do audiolivro: ");
		    String autoria = scanner.nextLine();
		    
		    System.out.print("Digite o autor do audiolivro: ");
		    String tema = scanner.nextLine();

		    System.out.print("Digite a duração (em minutos): ");
		    double duracao = scanner.nextInt();
		    scanner.nextLine(); // Consumir o \n
		    
		    System.out.print("Digite a duração (em minutos): ");
		    double tamanhoArquivo = scanner.nextInt();
		    scanner.nextLine(); // Consumir o \n
		    
		    System.out.print("Digite o narrador do audiolivro: ");
		    String formato = scanner.nextLine();

		    System.out.print("Digite o ano de publicação: ");
		    int quantidadeCapitulos = scanner.nextInt();
		    scanner.nextLine(); // Consumir o \n

		    AudioLivro novoAudiolivro = new AudioLivro(formato, tamanhoArquivo, duracao, titulo, autoria, tema, quantidadeCapitulos);
		    estoque.adicionarAudiolivroAoEstoque(novoAudiolivro);

		    System.out.println("Audiolivro adicionado ao estoque com sucesso!");
		}

		
		 public void apagaLivro(Estoque estoque) {
		        if (estoque == null) {
		            System.out.println("Erro: Estoque não pode ser nulo.");
		            return;
		        }
		        System.out.println("=== Remover Livro ===");
		        System.out.print("Digite o título do livro a ser removido: ");
		        String titulo = scanner.nextLine();

		        if (estoque.removerLivroDoEstoque(titulo)) {
		            System.out.println("Livro removido do estoque com sucesso!");
		        } else {
		            System.out.println("Erro: Livro não encontrado.");
		        }
		    }
		 
		 public void apagaJornal(Estoque estoque) {
		        if (estoque == null) {
		            System.out.println("Erro: Estoque não pode ser nulo.");
		            return;
		        }
		        System.out.println("=== Remover Jornal ===");
		        System.out.print("Digite o título do jornal a ser removido: ");
		        String titulo = scanner.nextLine();

		        if (estoque.removerJornalDoEstoque(titulo)) {
		            System.out.println("Jornal removido do estoque com sucesso!");
		        } else {
		            System.out.println("Erro: Jornal não encontrado.");
		        }
		    }
		 
		 public void apagaCD(Estoque estoque) {
		        if (estoque == null) {
		            System.out.println("Erro: Estoque não pode ser nulo.");
		            return;
		        }
		        System.out.println("=== Remover CD ===");
		        System.out.print("Digite o nome do CD a ser removido: ");
		        String titulo = scanner.nextLine();

		        if (estoque.removerCDDoEstoque(titulo)) {
		            System.out.println("CD removido do estoque com sucesso!");
		        } else {
		            System.out.println("Erro: CD não encontrado.");
		        }
		    }
		 
		 public void apagaDVD(Estoque estoque) {
		        if (estoque == null) {
		            System.out.println("Erro: Estoque não pode ser nulo.");
		            return;
		        }
		        System.out.println("=== Remover DVD ===");
		        System.out.print("Digite o nome do DVD a ser removido: ");
		        String titulo = scanner.nextLine();

		        if (estoque.removerDVDDoEstoque(titulo)) {
		            System.out.println("DVD removido do estoque com sucesso!");
		        } else {
		            System.out.println("Erro: DVD não encontrado.");
		        }
		    }
		 
		 public void apagaAudiolivro(Estoque estoque) {
			    if (estoque == null) {
			        System.out.println("Erro: Estoque não pode ser nulo.");
			        return;
			    }

			    System.out.println("=== Remover Audiolivro ===");
			    System.out.print("Digite o título do audiolivro a ser removido: ");
			    String titulo = scanner.nextLine();

			    if (estoque.removerAudiolivroDoEstoque(titulo)) {
			        System.out.println("Audiolivro removido do estoque com sucesso!");
			    } else {
			        System.out.println("Erro: Audiolivro não encontrado.");
			    }
			}
		 
		 public void addPodcast(Estoque estoque) {
			    if (estoque == null) {
			        System.out.println("Erro: Estoque não pode ser nulo.");
			        return;
			    }

			    System.out.println("=== Cadastro de Podcast ===");
			    System.out.print("Digite o título do podcast: ");
			    String titulo = scanner.nextLine();

			    System.out.print("Digite o autor do podcast: ");
			    String autoria = scanner.nextLine();

			    System.out.print("Digite o tema do podcast: ");
			    String tema = scanner.nextLine();

			    System.out.print("Digite a duração (em minutos): ");
			    double duracao = scanner.nextDouble();
			    scanner.nextLine(); // Consumir o \n

			    System.out.print("Digite o tamanho do arquivo (em MB): ");
			    double tamanhoArquivo = scanner.nextDouble();
			    scanner.nextLine(); // Consumir o \n

			    System.out.print("Digite o formato do podcast (ex: MP3, WAV): ");
			    String formato = scanner.nextLine();

			    System.out.print("Digite a quantidade de episódios: ");
			    int quantidadeEpisodios = scanner.nextInt();
			    scanner.nextLine(); // Consumir o \n

			    Podcast novoPodcast = new Podcast(formato, tamanhoArquivo, duracao, titulo, autoria, tema, quantidadeEpisodios);
			    estoque.adicionarPodcastAoEstoque(novoPodcast);

			    System.out.println("Podcast adicionado ao estoque com sucesso!");
			}

		 public void apagaPodcast(Estoque estoque) {
			    if (estoque == null) {
			        System.out.println("Erro: Estoque não pode ser nulo.");
			        return;
			    }

			    System.out.println("=== Remover Podcast ===");
			    System.out.print("Digite o título do podcast a ser removido: ");
			    String titulo = scanner.nextLine();

			    if (estoque.removerPodcastDoEstoque(titulo)) {
			        System.out.println("Podcast removido do estoque com sucesso!");
			    } else {
			        System.out.println("Erro: Podcast não encontrado.");
			    }
			}

		
		
	}

