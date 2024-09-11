package lanchonete.area.cliente;

public class Cliente {
	public void escolherLanche() {
		System.out.println("Escolhendo o lanche");
	}
	public void fazerPedido() {
		System.out.println("Fazendo o pedido");
	}
	public void pagarConta() {
		consultarSaldoAplicativo(); // consultar saldo antes de pagar
		System.out.println("Pagando a conta");
	}
	private void consultarSaldoAplicativo() {
		System.out.println("Consultando saldo no aplicativo");
	}
	/* 
	 * este método não deve existir, quem leva até o cliente é o atendente
	 * public void pegarBebidaBalcao() {
	 *	System.out.println("Pegando o pedido de bebida no balcao");
	 * }
	 */

}
