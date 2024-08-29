public class TiposVariaveis {

    // Variavel: É uma área na memória, associada a um nome, qu epode armazenar valores de um determinado tipo.
    // Constantes: São valores armazenados em memória que não podem ser modificados depois de declarados. São representados pela palavra reservada (final) seguido do tipo
    //              Por convensão a constante sempre são escritas em caixa alta

    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto; // Conversão implicita (widening) de tipo sem perda de dados na atribuição
        short numeroCurto2 = (short) numeroNormal;// Conversão explicita (narrowing), estou forçando a conversão de int para short

        // Variavel: Consigo o valor da variavel armazenado na memória
        int numero = 5;
        numero = 10;

        // Constante exemplo
        final double VALOR_DE_PI = 3.14;
        // VALOR_DE_PI = 10.75; // erro:  cannot assign a value to final variable VALOR_DE_PI


    }
}
