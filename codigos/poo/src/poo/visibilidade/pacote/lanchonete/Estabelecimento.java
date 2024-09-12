package poo.visibilidade.pacote.lanchonete;

import poo.visibilidade.pacote.lanchonete.area.cliente.Cliente;
import poo.visibilidade.pacote.lanchonete.atendimento.Atendente;
import poo.visibilidade.pacote.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		
		Cozinheiro cozinheiro = new Cozinheiro();

		// Ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		
		Atendente atendente = new Atendente();
		atendente.servindoMesa();
		atendente.receberPagamento();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
	}	
}
