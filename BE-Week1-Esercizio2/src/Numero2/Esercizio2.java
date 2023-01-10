package Numero2;

public class Esercizio2 {

	public static void main(String[] args) {
		
		// Creo una nuova Sim
        Sim s1 = new Sim("+39 123456789");
        
        // Creo le ultime chiamate
        Chiamata chiamata1 = new Chiamata("+39 326159487", 13);
        s1.listaChiamate[0] = chiamata1;
        
        Chiamata chiamata2 = new Chiamata("+39 147258369", 3);
        s1.listaChiamate[1] = chiamata2;
        
        Chiamata chiamata3 = new Chiamata("+39 789456123", 20);
        s1.listaChiamate[2] = chiamata3;
        
        Chiamata chiamata4 = new Chiamata("+39 369258147", 22);
        s1.listaChiamate[3] = chiamata4;
        
        Chiamata chiamata5 = new Chiamata("+39 193045678", 5);
        s1.listaChiamate[4] = chiamata5;
        
        // Stampo i dati
        s1.stampaDati();

	}

}
