package poo.construtores;


public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	// Método construtor: tem o mesmo nome da classe, não tem retorno
	public Pessoa(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;	
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
