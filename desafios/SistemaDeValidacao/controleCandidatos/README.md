# Cases
### Vamos explorar alguns cenários com fluxos condicionais, repetições e excepcionais.

## Case 1
 Vamos imaginar que em um processo seletivo existe o valor base salarial de R$2.000,00 e o salário pretendido pelo candidato. Vamos elaborar um controle de fluxo onde:

  - Se o valor salario base for maior que valor salario pretendido, imprima: "**LIGAR PARA O CANDIDATO**" 
  - Senão Se o valor salario base for igual ao valor salario pretendido, imprima: "**LIGARA PARA O CANDIDATO COM CONTRA PROPOSTA**"
  - Senão imprima: "**AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS**" 

## Case 2
  Foi solicitado que nosso sistema garanta que diante das inúmeras candidaturas sejam selecionados apenas no máximo 5 candidatos para entrevista onde o salário pretendido seja menor ou igual ao salário base.

#### Arrays com os nomes dos candidatos
  String [] candidatos = {"FELIPE","MARCIA","JULIA","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE","SILAS","CRIS","JHON","ROMILDO","SILDINHO","VANIA"};

 #### Método para gerar valor aleatório
  	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2000); // Método que gera valor aleatório com base no parâmetro
	}  

  ## Case 3  
  Agora imprima a lista dos candidatos selecionados para disponibilizar para o RH entrar em contao.

  ## Case 4  
 O RH deverá realizar uma ligação com no máximo 03 tentativas para cada dandidato selecionado e caso o candidato atenda, deve-se imprimir:
  - "Conseguimos contato com [candidato] após [tentativas] tentativa(s)"
  - Do contrário imprima: "Não conseguimos contato com o [candidato]"






