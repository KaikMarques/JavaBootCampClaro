public class Usuario {
    public static void main(String[] args) {
    // Preciso fazer a instancia da minha classe para eu poder usa-la em usuario
    SmartTv smartTv = new SmartTv();

    /* Definindo o que eu quero com esta classe
     *  1. Quero primeiro ligar a TV
     *  2. Depois, quero aumentar o volume
     *  3. Depois, quero mudar de canal
     *  4. E por fim, quero definir qual canal eu quero ir
     */            

     System.out.println("......SmartTV......");

     smartTv.ligar();
     System.out.println("Televisão ligada: " + smartTv.ligada); // passei o atributo porque quero saber o status do atriburo com a chamada do método

    smartTv.aumentarVolume();
    System.out.println("Volume da televisão aumentado para: " + smartTv.volume);
    
    smartTv.restaurarVolumeDefault();
    System.out.println("Restaurado volume padrão da tv: " + smartTv.volume);

    smartTv.aumentarVolume();
    System.out.println("Volume da televisão aumentado para: " + smartTv.volume);

    smartTv.mudarCanal();
    System.out.println("Canal alterado para: " + smartTv.canal);

    smartTv.mudarCanal(12);
    System.out.println("Digitei que minha tv vai para o canal: " + smartTv.canal);


    }

}
