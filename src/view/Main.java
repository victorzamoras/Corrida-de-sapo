package view;

import controller.ThreadSapo;

public class Main {
	public static int podio = 0;
	public static void main(String[] args) {
		int tamcorrida;
		int tampulo ;
		
		for (int i = 0; i < 5; i++) {
			Thread t = new ThreadSapo(3, 50);
			t.start();
		}
	}
}
