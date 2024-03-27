package projetocorrida;

import projetocorrida.model.Carro;
import projetocorrida.model.Corrida;
import projetocorrida.model.Moto;
import projetocorrida.model.Pista;

public class App {
	public static void main (String []args) {
		
		Pista p = new Pista();
		Moto moto1= new Moto();
		Moto moto2= new Moto();
		Moto moto3= new Moto();
		Carro carro1 = new Carro();
		Carro carro2= new Carro();
		Carro carro3 = new Carro();
		
		Corrida corrida = new Corrida ();
		corrida.setPistaEscolhida(p);
		corrida.adicionarAutomovel(moto1);
		corrida.adicionarAutomovel(moto2);
		corrida.adicionarAutomovel(moto3);
		corrida.adicionarAutomovel(carro1);
		corrida.adicionarAutomovel(carro2);
		corrida.adicionarAutomovel(carro3);
		
		corrida.iniciarCorrida();

	}
}
