package projetoModelo.main.java.br.edu.univasf.modelo.controller;

import projetoModelo.main.java.br.edu.univasf.modelo.model.Adimin;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Estoque;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Usuario;
import projetoModelo.main.java.br.edu.univasf.modelo.view.AppView;

public class Main {

	public static void main(String[] args) {
		
		// Instâncias pré-criadas
		Estoque estoque = new Estoque();
        Adimin adimin = new Adimin("Administrador", "admin123", "admin@biblioteca.com");
        Usuario user = new Usuario("João Silva", "user456", "joao.silva@email.com");

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
