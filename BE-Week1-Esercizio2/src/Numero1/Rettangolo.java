package Numero1;

public class Rettangolo {
	
	int larghezza;
	int altezza;
	
	public Rettangolo(int larghezza, int altezza) {
		this.larghezza = larghezza;
		this.altezza = altezza;
	}
	
	public int calcolaPerimetro() {
		return (this.larghezza + this.altezza) * 2;
	}
	
	public int calcolaArea() {
		return this.larghezza * this.altezza;
	}
	
	public void stampaRettangolo() {
	    System.out.println("Il perimetro del rettangolo è: " + this.calcolaPerimetro());
		System.out.println("L'area del rettangolo è: " + this.calcolaArea());
	}
	
	public void stampaDueRettangoli(Rettangolo r2) {
		System.out.println("Il perimetro del primo rettangolo è: " + this.calcolaPerimetro());
		System.out.println("Il perimetro del secondo rettangolo è: " + r2.calcolaPerimetro());
		System.out.println("Il totale del perimetro è: " + (this.calcolaPerimetro() + r2.calcolaPerimetro()));
		
		System.out.println("L'area del primo rettangolo è: " + this.calcolaArea());
		System.out.println("L'area del secondo rettangolo è: " + r2.calcolaArea());
		System.out.println("L'area dei due rettangol1 è: " + (this.calcolaArea() + r2.calcolaArea()));
	}
	
}
