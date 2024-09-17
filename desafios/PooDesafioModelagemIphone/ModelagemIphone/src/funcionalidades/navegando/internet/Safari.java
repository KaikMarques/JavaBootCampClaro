package funcionalidades.navegando.internet;

public class Safari implements NavegadorInternet {

	@Override
	public void exibirPagina(String url) {
		System.out.println("https://github.com/KaikMarques/ - Safari");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba Safari");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando nova pagina Safari");
		
	}

}
