import funcionalidades.aparelho.telefonico.AparelhoTelefonico;
import funcionalidades.aparelho.telefonico.Telefone;
import funcionalidades.iphone.Iphone;
import funcionalidades.navegando.internet.NavegadorInternet;
import funcionalidades.navegando.internet.Safari;
import funcionalidades.reprodutor.musical.Ipod;
import funcionalidades.reprodutor.musical.ReprodutorMusical;

public class Usuario {
	public static void main(String [] args) {
		Iphone iphone = new Iphone();
		AparelhoTelefonico aparelhoTelefonico = new Telefone();
		Ipod ipod = new Ipod();
		ReprodutorMusical ipodDois = new Ipod();
		NavegadorInternet safari = new Safari();
		
		iphone.tocar();
		aparelhoTelefonico.ligar("");
		ipod.tocar();
		ipodDois.tocar();
		safari.exibirPagina("");
		
	}

}
