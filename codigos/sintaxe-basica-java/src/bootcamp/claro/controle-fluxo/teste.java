public class teste {
  public static void main(String[] args) {

    // Estruturas Condicionais

    double saldo = 25.0;
    double valorSolicitado = 17.0;

    /* IF Simples
     *  if(valorSolicitado < saldo)
     *  saldo = saldo - valorSolicitado;
     * System.out.println(saldo);
     */

    if(valorSolicitado < saldo) { // No java, se dentro do if ou else eu tenho mais de uma instrução eu preciso criar o bloco {} para coloca outras instruções
      saldo -= valorSolicitado;
      System.out.println("Novo Saldo: " + saldo);
    }else
      System.out.println("Saldo Insuficiente");
  }

}
