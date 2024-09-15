package poo.interfacee.equipamentos.multifuncional;

import poo.interfacee.equipamentos.copiadora.Copiadora;
import poo.interfacee.equipamentos.digitalizadora.Digitalizadora;
import poo.interfacee.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{
	
	public void copiar() {
		System.out.println("Copiando via equipamento multifuncional");
	}
	public void digitalizar() {
		System.out.println("Digitando via equipamento multifuncional");
	}
	public void imprimir() {
		System.out.println("Imprimindo via equipamento multifuncional");
	}
	
}
