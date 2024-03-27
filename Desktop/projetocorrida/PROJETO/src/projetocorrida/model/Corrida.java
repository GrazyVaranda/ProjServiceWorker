package projetocorrida.model;

import java.util.ArrayList;
import java.util.Date;

public class Corrida {

	public Date inicio;
	private Pista pistaEscolhida;
	private ArrayList<Automovel> automoveis =new ArrayList<Automovel>();

	public void adicionarAutomovel(Automovel a) {
		this.automoveis.add(a);
	}
	
	public void pistaEscolhida(Pista p) {
		this.setPistaEscolhida(p);
	}
	
	private void liguemSeusMotores() {
		for (Automovel a :this.automoveis) {
			System.out.println(a.acelerar());
		}
	}
	
	public void iniciarCorrida1() {
		this.liguemSeusMotores();
	}

	public Pista getPistaEscolhida() {
		return pistaEscolhida;
	}

	public void setPistaEscolhida(Pista pistaEscolhida) {
		this.pistaEscolhida = pistaEscolhida;
	}

	public void iniciarCorrida() {
		// TODO Auto-generated method stub
		
	}
}
