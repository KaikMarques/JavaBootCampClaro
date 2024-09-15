package poo.pilarespoo;

public class Carro extends Veiculo {
	

	
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("Carro ligado");
	}
	
	// Fazendo Encapsulamento do método
	// esses métodos quero que o usuário não precisse verificar tudo isso, más que ocorra somente na classe
	// quando eu chamar o método main, sem precisar chamar o método direto na classe principal
	@SuppressWarnings("unused")
	private void confereCombustivel() {
		System.out.println("conferindo combustivel");
	}
	@SuppressWarnings("unused")
	private void confereCambio() {
		System.out.println("conferindo cambio");
	}

}
