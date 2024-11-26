package projetoModelo.main.java.br.edu.univasf.modelo.controller;

import projetoModelo.main.java.br.edu.univasf.modelo.model.Adimin;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Estoque;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Usuario;
import projetoModelo.main.java.br.edu.univasf.modelo.view.AppView;

public class AppController {
	private AppView view;
    private Usuario usuarioAtual;
    private Usuario user;
    private Adimin adimin;
    private Estoque estoque;

    public AppController(AppView view, Usuario user, Adimin adimin, Estoque estoque) {
        this.view = view;
        this.user = user;
        this.adimin = adimin;
        this.estoque = estoque;
    }

    public void iniciarLogin() {
        Usuario usuario = view.obterDadosLogin();
        if (validarUsuario(usuario)) {
            if (usuarioAtual instanceof Adimin) {
                exibirMenuAdmin();
            } else {
                exibirMenuUsuario();
            }
        } else {
            view.exibirMensagem("Login inválido. Tente novamente.");
        }
    }

    private boolean validarUsuario(Usuario usuario) {
        if (usuario.getMatricula().equals(adimin.getMatricula()) &&
            usuario.getEmail().equals(adimin.getEmail())) {
            usuarioAtual = adimin;
            return true;
        }

        if (usuario.getMatricula().equals(user.getMatricula()) &&
            usuario.getEmail().equals(user.getEmail())) {
            usuarioAtual = user;
            return true;
        }

        return false;
    }

    private void exibirMenuAdmin() {
        boolean rodando = true;
        while (rodando) {
            int opcao = view.exibirMenuAdmin();
            switch (opcao) {
                case 1:
                    view.exibirMensagem("Adicionando livro... (a ser implementado)");
                    adimin.addLivro(estoque);
                    break;
                case 2:
                    view.exibirMensagem("Adicionando jornal... (a ser implementado)");
                    break;
                case 3:
                    view.exibirMensagem("Visualizando empréstimos... (a ser implementado)");
                    break;
                case 4:
                    rodando = false;
                    view.exibirMensagem("Saindo do menu do administrador.");
                    break;
                default:
                    view.exibirMensagem("Opção inválida. Tente novamente.");
            }
        }
    }

    private void exibirMenuUsuario() {
        boolean rodando = true;
        while (rodando) {
            int opcao = view.exibirMenuUsuario();
            switch (opcao) {
                case 1:
                    view.exibirMensagem("Consultando livros disponíveis... (a ser implementado)");
                    break;
                case 2:
                    view.exibirMensagem("Fazendo empréstimo... (a ser implementado)");
                    break;
                case 3:
                    view.exibirMensagem("Renovando empréstimo... (a ser implementado)");
                    break;
                case 4:
                    view.exibirMensagem("Devolvendo empréstimo... (a ser implementado)");
                    break;
                case 5:
                    view.exibirMensagem("Consultando multas... (a ser implementado)");
                    break;
                case 6:
                    rodando = false;
                    view.exibirMensagem("Saindo do menu do usuário.");
                    break;
                default:
                    view.exibirMensagem("Opção inválida. Tente novamente.");
            }
        }
    }
}
