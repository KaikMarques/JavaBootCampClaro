package poo.visibilidade.pacote.lanchonete.atendimento.cozinha;


public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("Controlando a entrada dos itens");
	}
	private void controlarSaida() {
		System.out.println("Controlando saida dos itens");
	}
	void entregarIngredientes() {
		System.out.println("Entregando Ingredientes");
		controlarSaida();
	}
	void trocarGas() {
		System.out.println("Almoxarife trocando o gas");
	}

}
