package poo.pilarespoo.implementandoconceitospoo.apps;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	// somente os filhos conhecem este método, e classe do mesmo pacote. User não precisa enchergar
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}

}
