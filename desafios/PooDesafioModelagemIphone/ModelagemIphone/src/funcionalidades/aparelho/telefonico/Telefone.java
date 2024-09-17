package funcionalidades.aparelho.telefonico;

public class Telefone implements AparelhoTelefonico {

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o número  (11) 9.5778-09091 no telefone");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação Telefone");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz pelo telefone");
	}
	
	
	

}
