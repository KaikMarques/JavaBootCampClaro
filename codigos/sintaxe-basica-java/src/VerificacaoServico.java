
import java.util.Scanner;

public class VerificacaoServico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;

        // Verificando se o serviço está na lista de serviços contratados
        for (int i = 1; i < partes.length; i++) {
            if (partes[i].equalsIgnoreCase(servico)) {
                contratado = true;
                break;
            }
        }

        // Exibe "Sim" ou "Nao" dependendo da verificação
        if (contratado) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }

        scanner.close();
    }
}

/* 


### Explicação das modificações:

1. O `for` começa em `1` porque o índice `0` corresponde ao nome do cliente, que não nos interessa na verificação.
2. Usei `equalsIgnoreCase()` para fazer a comparação de forma case-insensitive (ignora maiúsculas e minúsculas).
3. Se o serviço for encontrado na lista de serviços contratados, a variável `contratado` é alterada para `true`, e o laço é interrompido com `break`.
4. A saída é "Sim" se o serviço foi encontrado e "Nao" caso contrário.

Agora o código está completo e pronto para verificar os serviços contratados pelo cliente!
 */
 /* 
        Descrição
        Uma concessionária de telecomunicações oferece quatro tipos de serviços: telefonia móvel, telefonia fixa, banda larga e TV por assinatura. Para facilitar o atendimento ao cliente, é necessário implementar um programa que verifique se um cliente específico contratou um determinado serviço. Por exemplo, quando um cliente liga para a central de atendimento e menciona um serviço, o atendente deve ser capaz de rapidamente verificar se esse serviço está contratado pelo cliente.
        
        Entrada
        A entrada deve receber duas linhas. A primeira linha contém o nome do serviço a ser verificado (por exemplo, "movel", "fixa", "banda larga", "tv"). A segunda linha contém o nome do cliente seguido pelos serviços que ele contratou, todos separados por vírgulas (por exemplo, "Alice,movel,fixa").
        
        Saída
        Deverá retornar "Sim" se o cliente contratou o serviço e "Nao" caso contrário.
        
        Exemplos
        A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.
        
        Entrada	Saída
        movel
        Alice,movel,fixa....Sim

        fixa
        Bob,movel,tv........Nao
        
        tv
        Carol,movel,fixa,tv.Sim
 */
