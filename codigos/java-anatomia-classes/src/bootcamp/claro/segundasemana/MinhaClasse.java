package bootcamp.claro.primeirasemana;
public class MinhaClasse {

    public static void main (String [] args) {

        String primeiroNome = "Kaik";
        String segundoNome = "Marques";

        // o primeiro nomeCompleto é variavel, e o segundo é do método. Sei a diferença porque o segundo passo parametro
        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome); 

        System.out.print(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome); // Essa string com a frase é para testar se está me retornando apartir deste método
    }

}
