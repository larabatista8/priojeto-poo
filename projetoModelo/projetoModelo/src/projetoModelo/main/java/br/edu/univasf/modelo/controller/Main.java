package projetoModelo.main.java.br.edu.univasf.modelo.controller;

import projetoModelo.main.java.br.edu.univasf.modelo.model.Adimin;
import projetoModelo.main.java.br.edu.univasf.modelo.model.AudioLivro;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Documentario;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Estoque;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Jornal;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Livro;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Podcast;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Usuario;
import projetoModelo.main.java.br.edu.univasf.modelo.model.VideoAula;
import projetoModelo.main.java.br.edu.univasf.modelo.view.AppView;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// Instâncias pré-criadas
		Estoque estoque = new Estoque();
        Adimin adimin = new Adimin("Administrador", "admin123", "admin@biblioteca.com");
        Usuario user = new Usuario("João Silva", "user456", "joao.silva@email.com");
        
        // adicionando livro no estoque
        Livro livro1 = new Livro("O pequeno principe", "Antoine de Saint-Exupéry", "subtitulo", "sinopse", "Literatura infantil", "7837isbn", 250, 1943, "sumario", "editora", true);
        estoque.adicionarLivroAoEstoque(livro1);
        
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", "subtitulo", "sinopse", "Romance", "2835isbn", 480, 1899, "sumario", "editora", true);
        estoque.adicionarLivroAoEstoque(livro2);
        Livro livro3 = new Livro("O cortiço", "Aluisio Azevedo", "subtitulo", "sinopse", "Ficção", "78942isbn", 354, 1890, "sumario", "editora", true);
        estoque.adicionarLivroAoEstoque(livro3);
        
        // adicionando jornal ao estoque
        Jornal jornal1 = new Jornal("Folha de Sao Paulo", "Folha de São Paulo", 2024, "02/12/2024", true);
        estoque.adicionarJornalAoEstoque(jornal1);
        Jornal jornal2 = new Jornal("Estadao", "O estadao", 2024, "30/11/2024", true);
        estoque.adicionarJornalAoEstoque(jornal2);
        Jornal jornal3 = new Jornal("O Globo", "O Globo", 2024, "02/12/2024", true);
        estoque.adicionarJornalAoEstoque(jornal3);
        
        // adicionando podcast ao estoque
         Podcast podcast1 = new Podcast("mp3", 343, 4.5, "Educacao Brasil", "Revista educacao", "educacao basica", 20);
         estoque.adicionarPodcastAoEstoque(podcast1);
         
         Podcast podcast2 = new Podcast("mp3", 300, 4.5, "Historia em meia hora", "Agencia de Podcast", "historia", 45);
         estoque.adicionarPodcastAoEstoque(podcast2);
         Podcast podcast3 = new Podcast("mp3", 300, 4.5, "Educacao financeira", "G1", "economia", 58);
         estoque.adicionarPodcastAoEstoque(podcast3);
         
        //adicionando audiolivro ao estoque
         ArrayList<AudioLivro> listaAudioLivro = new ArrayList<AudioLivro>();
         AudioLivro audioLivro1 = new AudioLivro("mp3", 150.8, 8.5,"Capitaes de areia", "Jorge Amado", "ficcao", 40);
         listaAudioLivro.add(audioLivro1);
         AudioLivro audioLivro2 = new AudioLivro("mp3", 150.8, 2.5,"A hora da estrela", "Clarice Lispector", "ficcao", 40);
         listaAudioLivro.add(audioLivro2);
         AudioLivro audioLivro3 = new AudioLivro("mp3", 150.8, 2.5,"Memorias postumas de bras cubas", "Machado de assis", "ficcao", 40);
         listaAudioLivro.add(audioLivro3);
         
         estoque.setEstoqueDeAudioLivro(listaAudioLivro);
         
        //adicionando documentario ao estoque
         ArrayList<Documentario> listaDocumentario = new ArrayList<Documentario>();
         Documentario documentario1 = new Documentario("mp4", 530, 2.5, "Sementes do Nosso Quintal", "Fernanda Heinz Figueiredo", "educacao", "720p", "2012", "Fernanda Heinz Figueiredo", "Brasil", "portuges", "Livre");
       listaDocumentario.add(documentario1);
       
       Documentario documentario2 = new Documentario("mp4", 530, 2.5, "Pro dia nascer feliz", "Fernanda Heinz Figueiredo", "educacao", "720p", "2012", "Fernanda Heinz Figueiredo", "Brasil", "portuges", "Livre");
       listaDocumentario.add(documentario2);
       Documentario documentario3 = new Documentario("mp4", 530, 2.5, "Quando sinto que já sei", "Fernanda Heinz Figueiredo", "educacao", "720p", "2012", "Fernanda Heinz Figueiredo", "Brasil", "portuges", "Livre");
       listaDocumentario.add(documentario3);
       estoque.setEstoqueDeDocumentario(listaDocumentario);
       
         //adicionando videoaula ao estoque
        ArrayList<VideoAula> listaVideoAula = new ArrayList<VideoAula>();
        VideoAula videoAula1 = new VideoAula("mp4", 58.4, 20, "Metodo de frobenius", "canal matematica", "calculo 4", true, "720p", "calculo");
        listaVideoAula.add(videoAula1);
        VideoAula videoAula2 = new VideoAula("mp4", 58.4, 20, "Teoria da evolucao", "canal biologia", "calculo 4", true, "720p", "calculo");
        listaVideoAula.add(videoAula2);
        VideoAula videoAula3 = new VideoAula("mp4", 58.4, 20, "Leis da termodinamica", "canal fisica", "calculo 4", true, "720p", "calculo");
        listaVideoAula.add(videoAula3);
        estoque.setEstoqueDeVideoAula(listaVideoAula);
        
        
        
        
        
        
        
        
        
        // Inicializando a View e o Controller
        AppView view = new AppView();
        AppController controller = new AppController(view, user, adimin, estoque);

        view.exibirMensagemBemVindo();

        boolean rodando = true;
        while (rodando) {
            int opcao = view.exibirMenuInicial();
            switch (opcao) {
                case 1:
                    controller.iniciarLogin();
                    break;
                case 2:
                    rodando = false;
                    view.exibirMensagem("Sistema encerrado. Até logo!");
                    break;
                default:
                    view.exibirMensagem("Opção inválida. Tente novamente.");
            }
        }
		
	}
}
