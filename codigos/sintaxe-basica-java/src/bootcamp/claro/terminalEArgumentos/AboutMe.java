package bootcamp.claro.terminalEArgumentos;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            /* O método useLocale(Locale.US) define a localização padrão para o Scanner, neste caso, o idioma inglês (Estados Unidos). 
             * Isso é importante para garantir que as informações lidas pelo Scanner sejam interpretadas corretamente, especialmente quando se trata de números e datas. 
             */



            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();


            /* 
            // Por convenção, os argumentos começam com indice 0
            String nome = args[0];
            String sobrenome = args[1];
            int idade = Integer.parseInt(args[2]);
            double altura = Double.valueOf(args[3]);
             */
            
            System.out.println("Ola, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "cm");
        }
}
