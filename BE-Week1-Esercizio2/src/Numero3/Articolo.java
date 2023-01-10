package Numero3;

public class Articolo {
	
	private int codiceArticolo;
	private String descrizioneArticolo;
	private double prezzo;
	private int numeroPezzi;
	
	public Articolo(int codiceArticolo, String descrizioneArticolo, double prezzo, int numeroPezzi) {
		this.codiceArticolo = codiceArticolo;
		this.descrizioneArticolo = descrizioneArticolo;
		this.prezzo = prezzo;
		this.numeroPezzi = numeroPezzi;
	}

	public int getCodiceArticolo() {
		return codiceArticolo;
	}

	public void setCodiceArticolo(int codiceArticolo) {
		this.codiceArticolo = codiceArticolo;
	}

	public String getDescrizioneArticolo() {
		return descrizioneArticolo;
	}

	public void setDescrizioneArticolo(String descrizioneArticolo) {
		this.descrizioneArticolo = descrizioneArticolo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getNumeroPezzi() {
		return numeroPezzi;
	}

	public void setNumeroPezzi(int numeroPezzi) {
		this.numeroPezzi = numeroPezzi;
	}
	
}
