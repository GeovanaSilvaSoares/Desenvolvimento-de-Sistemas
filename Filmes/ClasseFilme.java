
public class ClasseFilme {
	private String titulo;
	private int duracaoMin;
	
	
	//titulo
	
	void setTitulo (String titulo) {
		this.titulo = titulo;
	}
	
	String getTitulo() {
		return this.titulo;
	}
	
	
	//duracao minutos
	
	void setDuracaoMin(int duracaoMin) {
		this.duracaoMin = duracaoMin;
	}
	
	int getDuracaoMin() {
		return this.duracaoMin;
	}
		
	
	//função exibir em horas
	
	String exibirDuracaoHoras(int getDuracaoMin) {
		 int duracaoHrs = getDuracaoMin/60;
		 int restanteMinutos = getDuracaoMin - (duracaoHrs * 60);
		 
		 System.out.println();
		 System.out.println("Nome do Filme: " + titulo);
		 
		 if (duracaoHrs != 1) {
			 return (duracaoHrs + " horas e " + restanteMinutos + " minutos");
		 } else {
			 return (duracaoHrs + " hora e " + restanteMinutos + " minutos");
		 }
		 
	}
	
	
		
	
}
