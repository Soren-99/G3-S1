package esercizio3;

import java.util.Date;

public class main {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("S145", "Giacomo Rossi", "giacomo@example.com", new Date());
        Articolo articolo1 = new Articolo("F537", "Portatile", 459.99, 3);
        Articolo articolo2 = new Articolo("F456", "Cellulare", 298.05, 6);

        Carrello carrello = new Carrello(cliente1);
        carrello.aggiungiArticolo(articolo1);
        carrello.aggiungiArticolo(articolo2);

        System.out.println(carrello);
    }
}
