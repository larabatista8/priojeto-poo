package projetoModelo.main.java.br.edu.univasf.modelo.model;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Estoque;
import projetoModelo.main.java.br.edu.univasf.modelo.model.Livro;
import java.util.ArrayList;
	public class Usuario  {
		private String nome;
		private String matricula;
		private String email;
		private ArrayList<Livro> livrosEmprestados = new ArrayList<Livro>();
		ArrayList<Jornal> jornaisEmprestados = new ArrayList<Jornal>();
		ArrayList<Podcast> podcastsEmprestados = new ArrayList<Podcast>();
		ArrayList<AudioLivro> audioLivroEmprestados = new ArrayList<AudioLivro>();
		ArrayList<Documentario> documentariosEmprestados = new ArrayList<Documentario>(); 
		ArrayList<VideoAula> videoAulaEmprestados = new ArrayList<VideoAula>();
		private int diasDeSuspensao;
		
		public Usuario(String nome, String matricula, String email) {
			super();
			this.nome = nome;
			this.matricula = matricula;
			this.email = email;
			this.diasDeSuspensao=0; // dias de suspensao começa com 0
		}
		
		public ArrayList<Livro> getLivrosEmprestados() {
			return livrosEmprestados;
		}

		public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados) {
			this.livrosEmprestados = livrosEmprestados;
		}

		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public void fazerEmprestimo() {}
		
		public void renovarEmprestimo() {}
		
		public void devolverEmprestimo() {}

		public int getDiasDeSuspensao() {
			return diasDeSuspensao;
		}

		public void setDiasDeSuspensao(int diasDeSuspensao) {
			this.diasDeSuspensao = diasDeSuspensao;
		}

		public void addLivrosEmprestados(Livro livro) {
			this.livrosEmprestados.add(livro);
		}
		public void devolverLivroEmprestado(Livro livro) {
			this.livrosEmprestados.remove(livro);
		}
		
		
		public void addJonaisEmprestados(Jornal jornal) {
			this.jornaisEmprestados.add(jornal);
		}
		public void devolverJornalEmprestado(Jornal jornal) {
			this.jornaisEmprestados.remove(jornal);
		}
		
		
		public void addPodcastsEmprestados(Podcast podcast) {
			this.podcastsEmprestados.add(podcast);
		}
		public void devolverPOdcastEmprestado(Podcast podcast) {
			this.podcastsEmprestados.remove(podcast);
		}
		
		
		public void addAudioLivrosEmprestados(AudioLivro audiolivro) {
			this.audioLivroEmprestados.add(audiolivro);
		}
		public void devolverAudioLivroEmprestado(AudioLivro audiolivro) {
			this.audioLivroEmprestados.remove(audiolivro);
		}
		
		
		public void addDocumentariosEmprestados(Documentario documentario) {
			this.documentariosEmprestados.add(documentario);
		}
		public void devolverDocumentariosEmprestados(Documentario documentario) {
			this.documentariosEmprestados.remove(documentario);
		}
		
		public void addVideoAulasEmprestados(VideoAula videoaula) {
			this.videoAulaEmprestados.add(videoaula);
		}
		public void devolverVideoAulasEmprestado(VideoAula videoaula) {
			this.livrosEmprestados.remove(videoaula);
		}


		public ArrayList<Jornal> getJornaisEmprestados() {
			return jornaisEmprestados;
		}

		public void setJornaisEmprestados(ArrayList<Jornal> jornaisEmprestados) {
			this.jornaisEmprestados = jornaisEmprestados;
		}

		public ArrayList<Podcast> getPodcastsEmprestados() {
			return podcastsEmprestados;
		}

		public void setPodcastsEmprestados(ArrayList<Podcast> podcastsEmprestados) {
			this.podcastsEmprestados = podcastsEmprestados;
		}

		public ArrayList<AudioLivro> getAudioLivroEmprestados() {
			return audioLivroEmprestados;
		}

		public void setAudioLivroEmprestados(ArrayList<AudioLivro> audioLivroEmprestados) {
			this.audioLivroEmprestados = audioLivroEmprestados;
		}

		public ArrayList<Documentario> getDocumentariosEmprestados() {
			return documentariosEmprestados;
		}

		public void setDocumentariosEmprestados(ArrayList<Documentario> documentariosEmprestados) {
			this.documentariosEmprestados = documentariosEmprestados;
		}

		public ArrayList<VideoAula> getVideoAulaEmprestados() {
			return videoAulaEmprestados;
		}

		public void setVideoAulaEmprestados(ArrayList<VideoAula> videoAulaEmprestados) {
			this.videoAulaEmprestados = videoAulaEmprestados;
		}
		
		

	}
		



