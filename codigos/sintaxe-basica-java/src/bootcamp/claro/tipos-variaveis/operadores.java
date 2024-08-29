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

    public static void operadorRelacional (String [] args) {

        // Verificando se os valores são iguais com operador relacional em Strings
        String nomeUm = "Kaik";
        String nomeDoi = "Kaik";

        // Aqui não retorna erro, mas é importante entender o comportamento.
        // O operador == está comparando as referências dos objetos na memória.
        System.out.println(nomeUm == nomeDoi); // retorna true, pois as duas variáveis referenciam o mesmo objeto no pool de strings.

        String nomeUmnovo = "Kaik";
        String nomeDoisnovo = new String("Kaik");

        // Aqui, as referências são diferentes, pois new String() cria um novo objeto na memória heap.
        System.out.println(nomeUmnovo == nomeDoisnovo); // retorna false, pois as referências são diferentes.

        System.out.println(nomeUmnovo.equals(nomeDoisnovo)); // retorna true, pois o método equals compara o conteúdo dos objetos.

        // Entendendo melhor o comportamento do Java ao comparar strings e objetos
        
        // Explicação adicional:
       /*
        * Comparar nomeUm com a instância criada com new String() não gera erro, 
        * mas retorna false ao usar == porque as referências de memória são diferentes.
        * Quando usamos o operador ==, comparamos se as variáveis apontam para o mesmo local na memória.
        * Em contrapartida, o método equals() compara o conteúdo dos objetos.
        * O pool de strings é uma área especial da memória onde strings literais iguais são reutilizadas.
        * Para entender melhor isso, mais adiante no curso você aprenderá sobre a diferença entre stack e heap.
        */

        // Compreendendo mais a fundo objeto na memoria
        /*   
         *   Pool de Strings: Em Java, quando você cria uma string literal (como "Kaik"), ela é armazenada no pool de strings, que é uma área especial da memória 
         *                    que reutiliza strings iguais. Por isso, nomeUm == nomeDoi retorna true, porque ambas as variáveis apontam para o mesmo objeto no pool de strings.
         *   Heap e Stack: Quando você usa new String("Kaik"), um novo objeto é criado na memória heap, mesmo que o conteúdo seja o mesmo. Assim, nomeUmnovo == nomeDoisnovo retorna false, 
         *                 porque as variáveis referenciam objetos diferentes na memória.
         *   Método equals(): Esse método compara o conteúdo dos objetos e, nesse caso, retorna true porque as strings têm o mesmo conteúdo, mesmo que estejam em diferentes áreas da memória.
         */


        // Verificando se os valores são iguais com operador relacional em Numeros
        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }
        
        System.out.println("numeroUm é igual a numeroDois? " + simNao); // resultado será false

        simNao = numero1 == numero2 ? true : false;
        System.out.println("utilizando o operador ternario, numero1 é diferente de numero2" + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente de numeroDois? " + simNao); // retorna true

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que numeroDois? " + simNao); // retorna false

    }

    public static void operadorLogico (String [] args) {
        
    }

}
