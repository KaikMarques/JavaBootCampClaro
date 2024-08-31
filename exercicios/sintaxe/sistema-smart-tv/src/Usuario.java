

public class Usuario {
    public static void main(String[] args) throws Exception {

        // esta é a forma de criar uma nova classe para ilustrar a interação dos métodos e atributos
        SmartTv smartTv = new SmartTv(); 

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual..: " + smartTv.canal);

        smartTv.mudarCanal(13);
        
        System.out.println("Canal Atual..: " + smartTv.canal);

        System.out.println("Volume atual : " + smartTv.volume);

        // Fazendo a chamada dos atributos/variaveis que criei na minha classe smartTv
        System.out.println("TV Ligada....? " + smartTv.ligada);

        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);
        
    }
}
