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

    public static void operadorUnario (String [] args) {

        int numero = 5; // iniciei a variavel com valor 5

        numero = - numero; // desta forma, eu falo para o interpretador que o valor da variavel foi alterado em todo o código

        // System.out.println(- numero); // passa a ser um valor negativo somente neste trecho

        System.out.println(numero); // volta o valor positivo original da variavel

        // numero = + numero; // desta forma não seria convertido para + 5, porque deste jeito o + é sobre operador aritmetico soma

        numero = numero * -1; // 
        System.out.println(numero);
    }

    public static void operadorUnarioIncremento (String [] args) {

        int numero = 5;

        //x repeticao
        numero ++; // é a mesma coisa de numero = numero + 1;
        System.out.println(numero); // resultado será o valor 6
        System.out.println(numero ++); // resultado será 5, porque o interpretador irá imprimir o valor da variavel primeiro
        System.out.println(numero); // se ele executar o numero++ vai ser 5, se executar essa linha debaixo será 6 porque ele vai fazer o incremento
        System.out.println(++ numero); //  resultado será 6, porque usei o operador de incremento e depois vai atribuir o incremento na variavel 5

        // A mesma regra é aplicada quando eu quiiser decrementar/diminuir

        System.out.println(numero); // resultado será 5
        System.out.println(numero --); // resultado será 4
    }
    
    public static void negandoValoresBooleanos (String [] args) {

        boolean variavel = true;

        //caso eu queria negar esse valor de true
        //System.out.println(!variavel); // resultado será false, este é um valor temporário na memória

        // Reatribuindo o valor da variavel / alterando o valor na memória da variavel
        variavel = !variavel;
        System.out.println(variavel); // resultado sera false
    }

    public static void operadorTernario (String [] args) {
        int a, b;

        a = 5;
        b = 6;


        /* String resultado = ""; // defini o tipo da variavel para que eu possa usar ela no código
        *  if(a==b)
        *      resultado = "verdadeiro";
        *  else
        *      resultado = "falso";
        *
        *  System.out.println(resultado); // resultado será "falso"
         */

        // Mesmo exemplo, porém com operador ternario

        String resultado = a==b ?"verdadeiro" : "falso"; // resultado será falso

        int resultado2 = a==b ?1:2; // neste exemplo o operador ternario esperado que retorne um tipo inteiro


    }


}
