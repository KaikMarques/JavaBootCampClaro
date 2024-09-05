public class ResultadoEscolar {
  public static void main(String[] args) {

    // Estruturas Condicionais

    int nota = 6;

    if(nota >= 7)
      System.out.println("Aprovado" );
    
    else if (nota >= 5 && nota < 7)
      System.out.println("Prova de recuperação");

    else
    System.out.println("Reprovado");

    // Usando operador ternario

    // Exemplo 1
    // String resultado = nota >= 7 ? "aprovado" : "reprovado";
    // System.out.println(resultado);

    // Exemplo 2
    // String resultado = nota >= 7 ? "aprovado" : nota >= 5 && nota < 7 ? "recuperação" : "recuperação"; 
    // System.out.println(resultado);

  }

}
