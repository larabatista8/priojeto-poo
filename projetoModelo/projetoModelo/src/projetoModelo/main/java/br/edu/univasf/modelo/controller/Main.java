package projetoModelo.main.java.br.edu.univasf.modelo.controller;

import projetoModelo.main.java.br.edu.univasf.modelo.model.Adimin;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Estoque;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Livro;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Usuario;
import projetoModelo.main.java.br.edu.univasf.modelo.view.AppView;

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
