package candidatura;

import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo3 {
	
	// CASE 3
	
	public static void main(String[] args) {
		
		String [] candidatos = {"FELIPE","MARCIA","JULIA","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE","SILAS"};
		
		int candidatosSelecionados = 0; //  Um contador para rastrear quantos candidatos já foram selecionados.
		int candidatosAtual  = 0; //  Um índice para controlar qual candidato está sendo processado.
		double salarioBase = 2000.0;
		
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) { // Isso significa que o loop continuará enquanto menos de 5 candidatos forem selecionados e enquanto houver candidatos no array. Ou seja, ele vai parar se 5 candidatos forem selecionados ou se todos os candidatos forem processados.
			String candidato = candidatos[candidatosAtual]; // Aqui ele pega o nome do candidato atual do array com base no índice candidatosAtual.
			double salarioPretendido = valorPretendido(); // Gera um valor aleatório de salário pretendido entre R$1800 e R$2000 usando a função valorPretendido().
			
			System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido );
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
		imprimirSelecionados();

	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE","MARCIA","JULIA","AUGUSTO","MONICA"};
		System.out.println();
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
		for(int indice=0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de nª" + (indice+1) + "é o " + candidatos[indice]);
		}
		
		System.out.println();
		System.out.println("Forma abreviada de interação sem o indice, for each");
		
		for(String candidato: candidatos) { // a minha variavel candidatos vai interagir sobre todos elementos do array, sem dar a posição do indice
			System.out.println("O candidato selecionado foi " + candidato);
		}
		
	}
 
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200); // Método que gera valor aleatório com base no parâmetro
	}

	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA CANDIDATO");
		}else if(salarioBase == salarioPretendido) {
			System.out.print("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		} else
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
	}


}
