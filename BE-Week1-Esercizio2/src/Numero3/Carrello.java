package Numero3;

public class Carrello {
	
	String cliente;
	String elencoArticoli[];
	double totaleCosto;
	
	public Carrello(String cliente, String elencoArticoli[], double totaleCosto) {
		this.cliente = cliente;
		this.elencoArticoli = elencoArticoli;
		this.totaleCosto = totaleCosto;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String[] getElencoArticoli() {
		return elencoArticoli;
	}

	public void setElencoArticoli(String[] elencoArticoli) {
		this.elencoArticoli = elencoArticoli;
	}

	public double getTotaleCosto() {
		return totaleCosto;
	}

	public void setTotaleCosto(double totaleCosto) {
		this.totaleCosto = totaleCosto;
	}
	
}
