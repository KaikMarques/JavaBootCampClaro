public class PlanoOperadora {

  public static void main(String[] args) {

    /* 
     * - **`break`**: Interrompe a execução do `switch` após um caso ser executado, evitando o comportamento de **fall-through** (continuação 
     * para os próximos casos).
     *
     * - **`continue`**: Não é comumente usado diretamente em um `switch-case`, mas em loops; se usado dentro de um `switch` dentro de um loop,
     * ele faz o loop passar para a próxima iteração, ignorando o código restante.
     *
     * - **`default`**: Caso opcional que é executado se nenhum dos casos especificados for correspondente ao valor da variável do `switch`.
     */    

    String plano = "M";
  
    // O problema neste código é que estou usando frases repetidas no método de saida
    if(plano == "B") {
      System.out.println("100min de ligação");
    }else if(plano == "M") {
      System.out.println("100min de ligação");
      System.out.println("Whats e Instagram ilimitado");
    }else if(plano == "T") {
      System.out.println("100min de ligação");
      System.out.println("Whats e Instagram ilimitado");
      System.out.println("5GB de Youtube");
    }

    /* Resolvendo problema de frases repetidas com Switch-Case sem o break
     *
     * Sem o uso do break o comportamento será o "fall-through". Isso significa que, assim que um 
     * caso for correspondido, o código continuará executando todos os casos subsequentes, 
     * independentemente de suas condições.
     * 
     * Assim que entrar na primeira condição verdadeira posso manipular até onde quero que seja
     * impresso e depois é só colocar o break
     * 
     */

    switch(plano) {
      case "T": {
        System.out.println("5GB Youtube");
      }
      case "M": {
        System.out.println("Whatsapp e Instragram ilimitado");
      }
      case "B": {
        System.out.println("100min de ligação.");
      }
    }
  }

}
