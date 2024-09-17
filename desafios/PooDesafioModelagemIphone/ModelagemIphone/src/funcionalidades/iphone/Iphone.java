package funcionalidades.iphone;

import funcionalidades.aparelho.telefonico.AparelhoTelefonico;
import funcionalidades.navegando.internet.NavegadorInternet;
import funcionalidades.reprodutor.musical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

	// Interface ReprodutorMusical
	@Override
	public void tocar() {
		System.out.println("Tocando musica iphone");
	}
	@Override
	public void pausar() {
		System.out.println("Pausando musica iphone");
	}
	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando musica iphone");
	}
	
	// Interface NavegadorInternet
	@Override
	public void exibirPagina(String url) {
		System.out.println("https://github.com/KaikMarques/ - Iphone");
	}
	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba iphone");
	}
	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando nova pagina iphone");
	}

	// Interface ApareloTelefonico
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o número  (11) 9.5778-09091 no iphone");
	}
	@Override
	public void atender() {
		System.out.println("Atendendo ligação iphone");
	}
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz pelo iphone");
	}

}
