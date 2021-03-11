package controller;
import view.Main;
public class ThreadSapo extends Thread {
	
	private int tamcorrida;
	private int tampulo;
	
	public ThreadSapo(int tampulo, int tamcorrida ) {
		this.tampulo = tampulo;
		this.tamcorrida = tamcorrida;
		
	}
	@Override
	public void run() {
		pular();
	}
	public void pular() {
		int pulo;
		int distancia = 0;
		do {
			pulo = (int) (Math.random() * tampulo +1);
			distancia += pulo;
			System.out.println("Sapo" + getId()+ " pulou " + pulo + " e já pulou " + distancia+ " metros ");
			
		}while(distancia < tamcorrida);
		System.out.println("Sapo" + getId() + "chegou em " +(++Main.podio));
			
	}
		
	
}
