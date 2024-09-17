package funcionalidades.reprodutor.musical;

public class Ipod implements ReprodutorMusical{

	@Override
	public void tocar() {
		System.out.println("Tocando musica ipod");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica ipod");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando musica ipod");
	}
	


}
