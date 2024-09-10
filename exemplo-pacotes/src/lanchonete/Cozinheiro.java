package lanchonete;

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
	public void prepararlanche() {
		System.out.println("Preparando lanche tipo hamburguer");
	}
	public void prepararVitamina() {
		System.out.println("Preparando Suco");
	}
	public void prepararCombo() {
		prepararlanche();
		prepararVitamina();
	}
	public void selecionarIngredientesLanche() {
		System.out.println("Selecionando o pão, salada, ovo e carne");
	}
	public void selecionarIngredientesVitamina() {
		System.out.println("Selecionando o fruta, leite e suco");
	}
	public void lavarIngredientes() {
		System.out.println("Lavando ingredientes");
	}
	public void baterVitaminaLiquidificador() {
		System.out.println("Batendo vitamina liquidificador");
	}
	public void fritarIngredientesLanche() {
		System.out.println("Fritando a carne e ovo para o hamburguer");
	}
	public void pedirParaTrocarGas(Atendente meuAmigo) {
		meuAmigo.trocarGas();
	}
	public void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	public void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
	
	
	
	
	
	
	
	
	
	
}
