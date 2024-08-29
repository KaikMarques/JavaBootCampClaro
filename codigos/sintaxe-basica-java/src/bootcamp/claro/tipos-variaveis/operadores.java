public class operadores {
    public static void main (String [] args) {
        String concatenacao = "?";

        // O resultado será 31, porque enquanto o próximo valor for numerico ele serve com operador de atribuição soma, depois que o compilador vê que é texto ele concatena
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao); 

        // O resultado será 1111, o compilador verificou o primeiro valor 1 e o atribuidor de soma, más como o valor seguinte era string ele passou a concatenar todos os outros valores
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        
        // Resultado será 1111
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        // Resultado será 1111
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        
         // Resultado será 13, porque o compilador vai pegar o valor 1 de string e concatenar com o resultado que está dentro do parênteses e depois a concatenação
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
    }
}
