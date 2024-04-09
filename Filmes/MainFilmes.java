
public class MainFilmes {

	public static void main(String[] args) {
		ClasseFilme filme1 = new ClasseFilme();
		ClasseFilme filme2 = new ClasseFilme();
		ClasseFilme filme3 = new ClasseFilme();
		ClasseFilme filme4 = new ClasseFilme();
		ClasseFilme filme5 = new ClasseFilme();
		ClasseFilme filme6 = new ClasseFilme();
		ClasseFilme filme7 = new ClasseFilme();
		ClasseFilme filme8 = new ClasseFilme();
		ClasseFilme filme9 = new ClasseFilme();
		ClasseFilme filme10 = new ClasseFilme();
		ClasseFilme filme11 = new ClasseFilme();
		ClasseFilme filme12 = new ClasseFilme();
		
		System.out.println("Filmes em Cartaz:");
		
		
		filme1.setTitulo("Os Vingadores");
		filme1.setDuracaoMin(142);
		System.out.println(filme1.exibirDuracaoHoras(filme1.getDuracaoMin()));
		
		filme2.setTitulo("Hotel Transilvânia");
		filme2.setDuracaoMin(93);
		System.out.println(filme2.exibirDuracaoHoras(filme2.getDuracaoMin()));
		
		filme3.setTitulo("Ele é Demais");
		filme3.setDuracaoMin(91);
		System.out.println(filme3.exibirDuracaoHoras(filme3.getDuracaoMin()));
		
		filme4.setTitulo("O Retorno dos Thundermans");
		filme4.setDuracaoMin(70);
		System.out.println(filme4.exibirDuracaoHoras(filme4.getDuracaoMin()));

		
		filme5.setTitulo("A Bela e a Fera");
		filme5.setDuracaoMin(139);
		System.out.println(filme5.exibirDuracaoHoras(filme5.getDuracaoMin()));
		
		
		filme6.setTitulo("Cruella");
		filme6.setDuracaoMin(141);
		System.out.println(filme6.exibirDuracaoHoras(filme6.getDuracaoMin()));
		
		
		filme7.setTitulo("Até Que a Sorte nos Separe");
		filme7.setDuracaoMin(104);
		System.out.println(filme7.exibirDuracaoHoras(filme7.getDuracaoMin()));
		
		
		filme8.setTitulo("Maze Runner:Correr ou Morrer");
		filme8.setDuracaoMin(113);
		System.out.println(filme8.exibirDuracaoHoras(filme8.getDuracaoMin()));
		
		
		filme9.setTitulo("Vermelho, Branco e Sangue Azul");
		filme9.setDuracaoMin(118);
		System.out.println(filme9.exibirDuracaoHoras(filme9.getDuracaoMin()));
		
		
		filme10.setTitulo("Venom");
		filme10.setDuracaoMin(112);
		System.out.println(filme10.exibirDuracaoHoras(filme10.getDuracaoMin()));
		
		
		filme11.setTitulo("Frozen");
		filme11.setDuracaoMin(102);
		System.out.println(filme11.exibirDuracaoHoras(filme11.getDuracaoMin()));
		
		
		filme12.setTitulo("Soul");
		filme12.setDuracaoMin(100);
		System.out.println(filme12.exibirDuracaoHoras(filme12.getDuracaoMin()));
		
		
		
	}

}
