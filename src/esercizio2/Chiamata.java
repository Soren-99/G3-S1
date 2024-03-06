package esercizio2;

import  java.util.ArrayList;
class Chiamata {
    private  int durata;
    private String numeroChiamato;

    public Chiamata(int durata, String numeroChiamato){
        this.durata = durata;
        this.numeroChiamato = numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }

    public String getNumeroChiamato(){
        return numeroChiamato;
    }
}

class SIM{
    private String numeroTelefono;
    private double credito;
    private ArrayList<Chiamata> listaChiamate;

    public SIM(String numeroTelefono){
        this.numeroTelefono = numeroTelefono;
        this.credito = 0.0;
        this.listaChiamate = new ArrayList<>();
    }

    public void stampaDatiSIM(){
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + "euro");
        System.out.println("Ultime 5 chiamate effettuate: ");
        for (Chiamata chiamata : listaChiamate) {
            System.out.println("Durata: " + chiamata.getDurata() + " minuti, Numero chiamato: " + chiamata.getNumeroChiamato());

        }
    }

    public void effettuaChiamata(int durata, String numeroChiamato){
        Chiamata nuovaChiamata = new Chiamata(durata, numeroChiamato);
        listaChiamate.add(0, nuovaChiamata);
        if (listaChiamate.size() > 5) {
            listaChiamate.remove(5);
        }

    }
}
