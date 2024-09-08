
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            e.printStackTrace();
            System.out.println("O segundo parâmetro deve ser maior do que o primeiro!");
            System.out.println();
        }

        scanner.close();

    }

    static void contar(int parametroUm, int paramentroDois) throws ParametrosInvalidosException {
        if (parametroUm > paramentroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = paramentroDois - parametroUm;

        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo número" + i);
        }

    }

}
