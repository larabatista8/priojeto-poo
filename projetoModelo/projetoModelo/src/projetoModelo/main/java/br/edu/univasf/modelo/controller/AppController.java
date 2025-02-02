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
                    adimin.addLivro(estoque);
                    break;
                case 2:
                    adimin.addJornal(estoque);
                    break;
                case 3:
                    adimin.addCD(estoque);
                    break;
                case 4:
                	adimin.addDVD(estoque);
                	break;
                case 5:
                	adimin.addDocumentario(estoque);
                	break;
                case 6:
                	adimin.addAudiolivro(estoque);
                	break;
                case 7:
                	adimin.addPodcast(estoque);
                	break;
                case 8:
                	estoque.listarLivros();
                	break;
                case 9:
                	estoque.listarJornais();
                	break;
                case 10:
                	estoque.listarCDs();
                	break;
                case 11:
                	estoque.listarDVDs();
                	break;
                case 12:
                	estoque.listarDocumentarios();
                	break;
                case 13:
                	estoque.listarAudioLivros();
                	break;
                case 14:
                	estoque.listarPodcasts();
                	break;
                case 15:
                	adimin.apagaLivro(estoque);
                	break;
                case 16:
                	adimin.apagaJornal(estoque);
                	break;
                case 17:
                	adimin.apagaCD(estoque);
                	break;
                case 18:
                	adimin.apagaDVD(estoque);
                	break;
                case 19:
                	adimin.apagaDocumentario(estoque);
                	break;
                case 20:
                	adimin.apagaAudiolivro(estoque);
                	break;
                case 21:
                	adimin.apagaPodcast(estoque);
                	break;
                case 0:
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
                    view.exibirMensagem("Consultando obras disponíveis...\n");
                    estoque.listarObrasDisponiveis();
                    break;
                case 2:
                    view.exibirMensagem("Fazendo empréstimo...");
                    estoque.menuFazerEmprestimo(user);
                    break;
                case 3:
                    view.exibirMensagem("Renovando empréstimo...");
                    estoque.renovarEmprestimo(user);
                    break;
                case 4:
                    view.exibirMensagem("Devolvendo empréstimo...");
                    estoque.menuDevolucao(user);
                    break;
                case 5:
                    view.exibirMensagem("Consultando multas...");
                   System.out.println("Dias de suspensao: " + estoque.consultarSuspensao(user));
                    break;
                case 6:
                	view.exibirMensagem("Consultar emprestimos atuais");
                	estoque.consultarEmprestimosAtuais(user);
                	break;
                case 7:
                    rodando = false;
                    view.exibirMensagem("Saindo do menu do usuário.");
                    break;
                default:
                    view.exibirMensagem("Opção inválida. Tente novamente.");
            }
        }
    }
}