package poo.pilarespoo;

import java.util.Scanner;

public class Autodromo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Carro jeep = new Carro();
		jeep.setChasse("45789307");
		// jeep.ligar();
		
		
		Moto z400 = new Moto();
		z400.setChasse("9898898");
		// z400.ligar();
		
		Veiculo coringa = z400;
		
		coringa.ligar();
		
	}
}
