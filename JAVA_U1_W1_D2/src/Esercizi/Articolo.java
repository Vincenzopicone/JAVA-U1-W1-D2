package Esercizi;

public class Articolo {
	
		String codice;
		String descrizioneArticolo;
		double prezzo;
		int disponibili;
		static double iva = 0.24;
		static int prodottiCreati = 0;
		public static Articolo [] listaArticoli = new Articolo[5];
		
public Articolo(String descrizione, double prezzo) {
		
	this.descrizioneArticolo = descrizione;	
	this.prezzo = prezzo + (prezzo * iva);	
	this.disponibili = 10 ;
	Articolo.prodottiCreati += 1;
	System.out.println("Prodotto Creato");
	String codice = "PR";
	codice += Articolo.prodottiCreati;
};


};

