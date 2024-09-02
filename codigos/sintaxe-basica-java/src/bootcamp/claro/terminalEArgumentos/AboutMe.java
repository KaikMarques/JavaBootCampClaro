package bootcamp.claro.terminalEArgumentos;

public class AboutMe {

        public static void main(String[] args) {
            
            // Por convenção, os argumentos começam com indice 0
            String nome = args[0];
            String sobrenome = args[1];
            int idade = Integer.parseInt(args[2]);
            double altura = Double.valueOf(args[3]);

            System.out.println("Ola, me chamdo" + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + "anos");
            System.out.println("Minha altura é " + altura + "cm");
        }
}
