package candidatura;

import java.util.Scanner;

public class ProcessoSeletivo {
	
	// CASE 1
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Processo Seletivo ");
		
		// Solicitar os salários pretendidos para 3 candidatos
		for (int i = 1; i <=3; i++) { // irá solicitar 3 vezes para digirar o salário e será alocado 3 espaços na memória para cada valor digitado
			System.out.println("Digite o salário pretendido pelo candidato: " + i + ": ");
			double salarioPretendido = scanner.nextDouble();
			analisarCandidato(salarioPretendido);
		}
		scanner.close();

		
	}
	
	// Primeiro criei meu método
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


/*

A nível de hardware e alocação de memória, o código interage com a CPU e a memória RAM (principal) para armazenar e processar dados temporários durante a execução do programa. Vamos analisar o que ocorre em termos de memória e hardware durante a execução deste código.

### 1. **Inicialização e Execução do Programa**
   - Quando o método `main` começa a ser executado, a JVM (Java Virtual Machine) solicita espaço de memória para armazenar as variáveis e objetos que serão criados durante a execução do programa. 
   - O código começa instanciando o objeto `Scanner`. O comando `new Scanner(System.in)` aloca memória para esse objeto na **Heap Memory** (área da memória usada para objetos dinâmicos), onde o `Scanner` ficará disponível para ler entradas do teclado.

### 2. **Loop `for` e Alocação de Memória para Variáveis Locais**
   - O loop `for (int i = 1; i <= 3; i++)` vai ser executado três vezes, cada vez solicitando um valor de salário ao usuário.
   - A cada iteração, uma variável local `salarioPretendido` do tipo `double` é declarada e recebe o valor digitado pelo usuário. Esse valor é alocado na **Stack Memory**, onde as variáveis locais e os parâmetros dos métodos são armazenados temporariamente.
   - Quando o método `analisarCandidato` é chamado, a variável `salarioPretendido` é passada para esse método. O valor é copiado para a memória da stack onde o método `analisarCandidato` está sendo executado.
   - Após a execução de cada iteração do loop, a variável `salarioPretendido` da iteração anterior é descartada (desalocada da stack), e na próxima iteração, uma nova alocação de memória para `salarioPretendido` é feita na stack.

### 3. **Chamada do Método `analisarCandidato`**
   - A cada chamada de `analisarCandidato`, o método é empilhado na **Stack Memory** (chamado de "empilhamento de frame de execução"). 
   - Dentro do método, a variável `salarioBase` (com valor 2000.0) é criada e também armazenada na stack. Após a execução do método, as variáveis locais como `salarioBase` e o parâmetro `salarioPretendido` são desalocadas, liberando espaço na stack.
   - As instruções de comparação (`if`, `else if`, `else`) ocorrem diretamente na CPU, onde os valores de `salarioPretendido` e `salarioBase` são comparados. Com base no resultado da comparação, a CPU executa a operação correspondente e envia uma instrução de saída (ex: `System.out.println`), que interage com o sistema operacional para exibir o resultado no console.

### 4. **Fechamento do Scanner**
   - Após o término do loop, o método `scanner.close()` é chamado. Isso libera os recursos alocados pelo `Scanner`, incluindo a referência ao teclado (`System.in`) e a memória associada ao objeto `Scanner`, que é desalocada da heap, tornando o espaço livre para futuros objetos.

### 5. **Desempenho do Hardware**
   - A CPU realiza todas as operações de cálculo e comparação, como a execução do loop e as condições `if` dentro do método. Ela também faz a comunicação com a memória principal (RAM) para armazenar e buscar dados.
   - O gerenciamento de memória (alocação e desalocação de variáveis) é feito pela JVM, usando a **Stack Memory** para variáveis locais e chamadas de métodos, e a **Heap Memory** para objetos como o `Scanner`.
   - No nível de hardware, a **memória cache** da CPU pode armazenar temporariamente alguns dados e instruções frequentes para acelerar a execução.

### Resumo:
- **Heap Memory**: onde o objeto `Scanner` é alocado.
- **Stack Memory**: usada para armazenar variáveis locais (`salarioPretendido`, `salarioBase`) e parâmetros de métodos durante a execução.
- **CPU**: responsável por processar as instruções, realizar as comparações e controlar o fluxo do programa.
- A JVM gerencia o ciclo de vida dos objetos e variáveis, garantindo que a memória seja alocada e liberada conforme necessário.

*/
