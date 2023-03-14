package Esercizi;

import java.util.ArrayList;

public class SIM {

	private static int simNumber = 0;
	private static double credito = 0.0;
	private static ArrayList<Integer> chiamate = new ArrayList<Integer>();
	private static ArrayList<Double> durata = new ArrayList<Double>();
		

	public void setCartaSim(int n, double s) {
		simNumber = n;
		credito = s;
	};

	public void setChiamata(int call, double duration) {
		chiamate.add(call);
		durata.add(duration);
		
	};

	public static void mostraSim() {
		System.out.println("Per il numero: " + simNumber + " il credito è :" + credito + "€");
		System.out.println("Numeri chiamati" + chiamate);
		System.out.println("Durata" + durata + "minuti");
	};

}
