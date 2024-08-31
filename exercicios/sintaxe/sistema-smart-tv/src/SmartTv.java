public class SmartTv {
    // Definindo atributos//var da minha classe como global
   boolean ligada = false; // tv sempre começa desligada
    int canal = 1; // meu canal ao ser ligado vai estar no canal 1
    private int VOLUME_PADRAO = 25; // Valor padrão (constante)
    int volume = VOLUME_PADRAO; // Inicializa com o valor padrão
    
    // Criando métodos

    // Tarefa 1 e 2
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    // tarefa 3
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    // Bonus tarefa 3, enquanto desenvolvia a solução eu quis saber como voltar para o valor original
    // já que agora, toda vez que chamar o método o valor na classe usuário fica com o valor novo alterado
    // Para isso irei criar outro método para resolver este problema
    public void restaurarVolumeDefault(){
        volume = VOLUME_PADRAO;
    }

    // tarefa 4
    public void mudarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

}
