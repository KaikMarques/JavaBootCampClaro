package poo.interfacee;

import poo.interfacee.equipamentos.copiadora.Copiadora;
import poo.interfacee.equipamentos.digitalizadora.Digitalizadora;
import poo.interfacee.equipamentos.digitalizadora.Scanner;
import poo.interfacee.equipamentos.impressora.Deskjet;
import poo.interfacee.equipamentos.impressora.Impressora;
import poo.interfacee.equipamentos.impressora.Laserjet;
import poo.interfacee.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Deskjet deskjet = new Deskjet();
		Scanner scanner = new Scanner();
		
		Impressora impressora = deskjet; // classe Deskjet implementa impressora, por isso consigo usar
		Digitalizadora digitalizadora = em;
		Digitalizadora 	digitalizadoraDois = scanner;
		Copiadora copiadora = em;
		
	}
}
