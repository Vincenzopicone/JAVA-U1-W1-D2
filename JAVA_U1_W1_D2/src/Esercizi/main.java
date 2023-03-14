package Esercizi;

public class main {


	public static void main(String[] args) {
		/// ESERCIZIO 1
		Rettangolo R1 = new Rettangolo();
		Rettangolo R2 = new Rettangolo();
		
		R1.setAltezza(5);
		R1.setLarghezza(10);
		
		Rettangolo.stampaRettangolo();
		
		R2.setAltezza(15);
		R2.setLarghezza(20);
		
		Rettangolo.stampaRettangolo();
		
		System.out.println("La somma di tutto è : " + Rettangolo.stampaDueRettangoli(R1, R2));
		
		///ESERCIZIO 2
		
		SIM sim1 = new SIM();
		SIM sim2 = new SIM();
		SIM sim3 = new SIM();
		
		sim1.setCartaSim(345123456, 2.50);
		sim1.setChiamata(11111111, 1.25);
		sim1.setChiamata(22222222, 2.55);
		sim1.setChiamata(44444444, 2.45);
		sim1.setChiamata(55555555, 1.35);
		SIM.mostraSim();
		sim2.setCartaSim(123456789, 10.50);
		sim2.setChiamata(11111111, 3.20);
		sim2.setChiamata(22222222, 3.23);
		sim2.setChiamata(46684484, 3.22);
		sim2.setChiamata(55555555, 3.23);
		SIM.mostraSim();
		sim3.setCartaSim(798462154, 6.45);
		sim3.setChiamata(10000001, 3.25);
		sim3.setChiamata(99999999, 3.25);
		sim3.setChiamata(77777777, 3.25);
		sim3.setChiamata(66666666, 3.25);
		SIM.mostraSim();
		
		
		
		
		
		
		
		
		
			
		

	};	
	
	


}