package Numero2;

public class Sim {
	
	private String numeroTelefono;
	private double credito;
	Chiamata[] listaChiamate;
	
	public Sim(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
		this.credito = 0;
		this.listaChiamate = new Chiamata[5];
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public Chiamata[] getListaChiamate() {
		return this.listaChiamate;
	}

	public void setListaChiamate(Chiamata[] listaChiamate) {
		this.listaChiamate = listaChiamate;
	}
	
    public void stampaDati() {
        System.out.println("Numero sim: " + this.getNumeroTelefono());
        System.out.println("Credito residuo: " + this.getCredito());
        
        System.out.println("Lista chiamate");

        // Ciclo for per stampare la lista delle chiamate
        for (int i = 0; i < this.listaChiamate.length; i++) {
            Chiamata chiamata = this.listaChiamate[i];
            System.out.println("Numero chiamato: " + chiamata.getNumeroChiamato() + ", durata: " + chiamata.getDurataMinuti() + " minuti");
        }    
    }

}
