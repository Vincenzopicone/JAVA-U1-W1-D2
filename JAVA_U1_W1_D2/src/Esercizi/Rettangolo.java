package Esercizi;

public class Rettangolo {	
	
	private static int altezza = 0;
	private static int larghezza = 0;	
	
	public void setAltezza (int a) {
		altezza = a;
	};	
	public void setLarghezza (int l) {
		larghezza = l;
	};	
	public static int calcoloArea (int a, int l) {
		return a * l;
	};
	public static int calcoloPerimetro (int a, int l) {
		return 2 * (a + l);
	};	
	public static void stampaRettangolo () {
		System.out.println("Area:" + calcoloArea(altezza, larghezza)); 
		System.out.println("Perimetro" + calcoloPerimetro(altezza, larghezza));	
	};	
	
	public static int stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
		// TODO Auto-generated method stub
		return 	Rettangolo.altezza + Rettangolo.altezza + Rettangolo.larghezza + Rettangolo.larghezza;
	};
	
}


