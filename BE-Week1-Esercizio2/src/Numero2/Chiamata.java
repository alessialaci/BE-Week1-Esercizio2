package Numero2;

public class Chiamata {

	private String numeroChiamato;
	private int durataMinuti;

	public Chiamata(String numeroChiamato, int durataMinuti) {
		this.setNumeroChiamato(numeroChiamato);
		this.durataMinuti = durataMinuti;
	}
	
	public String getNumeroChiamato() {
		return numeroChiamato;
	}

	public void setNumeroChiamato(String numeroChiamato) {
		this.numeroChiamato = numeroChiamato;
	}

	public int getDurataMinuti() {
		return durataMinuti;
	}

	public void setDurataMinuti(int durataMinuti) {
		this.durataMinuti = durataMinuti;
	}

}
