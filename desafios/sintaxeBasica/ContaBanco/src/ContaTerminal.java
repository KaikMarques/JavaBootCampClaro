import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("........... Bem vindo a sua conta! ...........");
        
        System.out.println("Digite seu número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o número de sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome: ");
        String nomeCliente =  scanner.next();

        System.out.println("Digite o número do seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println();
        System.out.println(" Obrigado pelas confirmações! ");
        System.out.println("..............................");

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, ");
        System.out.println("sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + 
                            " já está disponivel para saque");
        
    }
}
