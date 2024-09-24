
public class Serie extends Conteudo {
	private int duracao;
	private int quantEpisodios;
	private int quantTemps;
	
	//SET e GET 
	void setDuracao(int duracao) {
		this.duracao = duracao;
	}
			
	int getDuracao() {
		return this.duracao;
	}
	
	void setQuantEpisodios(int quantEpisodios) {
		this.quantEpisodios = quantEpisodios;
	}
			
	int getQuantEpisodios() {
		return this.quantEpisodios;
	}
	
	void setQuantTemps(int quantTemps) {
		this.quantTemps = quantTemps;
	}
			
	int getQuantTemps() {
		return this.quantTemps;
	}
	
	
	// Metodo
	

	void serie (String categoria, String titulo, int duracao, int quantEpisodios, int quantTemps) {
		super.setCategoria(categoria);
		super.setTitulo(titulo);
		this.duracao = duracao;
		this.quantEpisodios = quantEpisodios;
		this.quantTemps = quantTemps;
	}
	
	
	@Override
	String descricao() {
		System.out.println("Categoria: " + super.getCategoria());
		System.out.println("Titulo: " + super.getTitulo());
		System.out.println("Dura��o m�dia dos epis�dios: " + getDuracao() + " minutos");
		System.out.println("Quantidade de epis�dios: " + getQuantEpisodios()+ " epis�dios no total");
		return "Quantidade de temporadas: " + getQuantTemps();
	}
	
	
}