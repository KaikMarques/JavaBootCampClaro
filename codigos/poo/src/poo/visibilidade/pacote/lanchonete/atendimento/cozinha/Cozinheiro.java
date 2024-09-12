package poo.visibilidade.pacote.lanchonete.atendimento.cozinha;

public class Cozinheiro {
	// pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("Adicionando lanche natural hamburguer no balcão");
	}
	// pode ser default
	public void adicionarSucoNoBalcao() {
		System.out.println("Adicionando suco no balcão");
	}
	// pode ser default	
	public void	adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	private void prepararlanche() {
		System.out.println("Preparando lanche tipo hamburguer");
	}
	private void prepararVitamina() {
		System.out.println("Preparando Suco");
	}
	private void prepararCombo() {
		prepararlanche();
		prepararVitamina();
	}
	private void selecionarIngredientesLanche() {
		System.out.println("Selecionando o pão, salada, ovo e carne");
	}
	private void selecionarIngredientesVitamina() {
		System.out.println("Selecionando o fruta, leite e suco");
	}
	private void lavarIngredientes() {
		System.out.println("Lavando ingredientes");
	}
	private void baterVitaminaLiquidificador() {
		System.out.println("Batendo vitamina liquidificador");
	}
	private void fritarIngredientesLanche() {
		System.out.println("Fritando a carne e ovo para o hamburguer");
	}
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
