package br.com.qwasolucoes.mentoria.curso.HerancaMultipla.application.device;

public class ConcreteScanner extends Device implements Scanner{

	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: "+ doc);
	}
	@Override
	public String scan() {
		return "Scanned contente";
	}
}
