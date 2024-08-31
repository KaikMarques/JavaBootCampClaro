public class SmartTv {
    boolean ligada = false; // definindo o stado da tv
    int canal = 1; // toda vez que a tv ligar vai começar no canal 1
    int volume = 25; // toda vez que a tv ligar vai começar no volume 25 
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    
    // Etapa 1 e 2 do desafio
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    // Etapa 3 do desafio
    public void aumentarVolume(){
        volume++; // utilizando operador unário para aumentar +1 sendo igual a volume+1
        System.out.println("Aumentando volume para " + volume);
    }
    public void diminuirVolume(){
        volume--; // igual a volume -1
        System.out.println("Diminuindo volume para " + volume);
    }

    // Etapa 4 do desafio
    public void mudarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }


}
