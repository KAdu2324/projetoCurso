package br.com.qwasolucoes.mentoria.curso.HerancaMultipla.application.device;

public class ComboDevice extends Device implements Scanner, Printer {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo priting: " + doc);
	}

	@Override
	public String scan() {
		// TODO Auto-generated method stub
		return "Combo Scan result";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Combo process: " + doc);
	}

}
