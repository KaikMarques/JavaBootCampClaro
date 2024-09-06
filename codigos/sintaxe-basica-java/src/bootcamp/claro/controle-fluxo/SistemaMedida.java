public class SistemaMedida {
  public static void main(String[] args) {
    String sigla = "M";

   /*Exemplo com If - Else if
    *if(sigla == "P")
    *  System.out.println("Pequeno");
    *else if(sigla == "M")
    *  System.out.println("Medio");
    *else if(sigla == "G")
    *  System.out.println("Grande");
    *else
    *  System.out.println("Indefinido");
    */

    // Exemplo com Switch Case do mesmo código
    switch(sigla) {
      case "P":{
        System.out.println("Pequeno");
        break;
      }
      case "M":{
        System.out.println("Medio");
        break;
      }
      case "G":{
        System.out.println("Grande");
        break;
      }
      default "Indefinido":{
        System.out.println("Indefinido");
        break;
      }
    }


  }
}
