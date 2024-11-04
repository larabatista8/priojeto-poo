package projetoModelo.main.java.br.edu.univasf.modelo.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;

public class Editora {
	private String id;
	private String nome;
	private LocalDate dataFundacao;
	private String telefone;
	private String email;
	private String webSite;
	private String endereco;
	private String cidade;
	private String pais;
	
	public Editora(String id, String nome, LocalDate dataFundacao, String telefone, String email, String webSite,
			String endereco, String cidade, String pais) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataFundacao = dataFundacao;
		this.telefone = telefone;
		this.email = email;
		this.webSite = webSite;
		this.endereco = endereco;
		this.cidade = cidade;
		this.pais = pais;
	}
	
	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Editora)) return false;
        Editora editora = (Editora) obj;
        return id == editora.id || nome.equals(editora.nome);
    }

    // atualizar informações
    public void atualizarInformacoes(String endereco, String telefone, String email, String website) {
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.webSite = website;
    }

    // Método para validar e-mail
    public boolean isEmailValido() {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return Pattern.matches(emailRegex, this.email);
    }

    // Método para calcular anos desde a fundação
    public int anosDeFundacao() {
        return Period.between(dataFundacao, LocalDate.now()).getYears();
    }

	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(LocalDate dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Editora [id=" + id + ", nome=" + nome + ", dataFundacao=" + dataFundacao + ", telefone=" + telefone
				+ ", email=" + email + ", webSite=" + webSite + ", endereco=" + endereco + ", cidade=" + cidade
				+ ", pais=" + pais + "]";
	}
	
	

}
