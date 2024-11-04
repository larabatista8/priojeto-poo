package projetoModelo.main.java.br.edu.univasf.modelo.model;

public class Livro extends Publicacao{



	private String subTitulo;
	private String sinopse;
	private String genero;
	private String isbn;
	private int numeroDePaginas;
	private String sumario;
	private String nomeEditora;
	private boolean disponivel;
	
	
	public Livro(String titulo, String autor, String subTitulo, String sinopse, String genero,
			String isbn, int numeroDePaginas,int anoPublicacao, String sumario, String nomeEditora, boolean disponivel) {
		super(titulo, autor, anoPublicacao);
		this.subTitulo = subTitulo;
		this.sinopse = sinopse;
		this.genero = genero;
		this.isbn = isbn;
		this.numeroDePaginas = numeroDePaginas;
		this.sumario = sumario;
		this.nomeEditora = nomeEditora;
		this.disponivel = disponivel;
	}


	

	public String getSubTitulo() {
		return subTitulo;
	}



	public void setSubTitulo(String subTitulo) {
		this.subTitulo = subTitulo;
	}



	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public String getSumario() {
		return sumario;
	}

	public void setSumario(String sumario) {
		this.sumario = sumario;
	}

	public String getNomeEditora() {
		return nomeEditora;
	}

	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;
	}


	public boolean isDisponivel() {
		return disponivel;
	}


	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public void atualizarInformacoesDoLivro(String tituloDoLivro, String subTitulo, String autorDoLivro, String sinopse, String genero, String isbn,
			int anoPublicacao, int numeroDePaginas, String sumario, String nomeEditora, boolean disponivel) {
		setTitulo(tituloDoLivro);
		this.subTitulo = subTitulo;
		setAutor(autorDoLivro);
		this.sinopse = sinopse;
		this.genero = genero;
		this.isbn = isbn;
		setAnoPublicacao(anoPublicacao);
		this.numeroDePaginas = numeroDePaginas;
		this.sumario = sumario;
		this.nomeEditora = nomeEditora;
		this.disponivel = disponivel;
	}
	
	@Override
	public void exibirDetalhes() {
		System.out.println("Titulo: " + getTitulo());
		System.out.println("Subtítulo: " + this.subTitulo);
		System.out.println("Autor: " + getAutor());
		System.out.println("Sinopse: " + this.sinopse);
		System.out.println("Gênero: " + this.genero);
		System.out.println("ISBN: " + this.isbn);
		System.out.println("Ano de publicação: " + getAnoPublicacao());
		System.out.println("Numero de páginas: " + this.numeroDePaginas);
		System.out.println("Nome da Editora: " + this.nomeEditora);
		System.out.println("Disponivel: " + (this.disponivel?"sim":"não"));
		
	}





	
	
}