package esercizio3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
class Articolo{
    private String codice;
    private String descrizione;
    private double prezzo;
    private int disponibilita;

    public Articolo(String codice, String descrizione, double prezzo, int disponibilita){
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.disponibilita = disponibilita;
    }

    public String getCodice(){
        return codice;
    }

    public void setCodice(String codice){
        this.codice = codice;
    }

    public String getDescrizione(){
        return descrizione;
    }

    public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }

    public double getPrezzo(){
        return prezzo;
    }

    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }

    public int getDisponibilita(){
        return disponibilita;
    }

    public void setDisponibilita(int disponibilita){
        this.disponibilita = disponibilita;
    }

    public String toString(){
        return "Articolo: " + descrizione + " (Codice: " + codice + ", Prezzo: " + prezzo + ", Disponibilità: " + disponibilita + ")";
    }
}

class Cliente {
    private String codice;
    private String nomeCognome;
    private String email;
    private Date dataIscrizione;

    public Cliente(String codice, String nomeCognome, String email, Date dataIscrizione){
        this.codice = codice;
        this.nomeCognome= nomeCognome;
        this.email= email;
        this.dataIscrizione = dataIscrizione;
    }

    public String getCodice(){
        return codice;
    }

    public void setCodice(String codice){
        this.codice = codice;
    }

    public String getNomeCognome(){
        return nomeCognome;
    }

    public void setNomeCognome(String nomeCognome){
        this.nomeCognome = nomeCognome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public Date getDataIscrizione(){
        return dataIscrizione;
    }

    public void setDataIscrizione(Date dataIscrizione){
        this.dataIscrizione = dataIscrizione;
    }

    public String toString() {
        return "Cliente: " + nomeCognome + " (Codice: " + codice + ", Email: " + email + ", Data Iscrizione: " + dataIscrizione + ")";
    }
}

class Carrello {
    private Cliente cliente;
    private List<Articolo> articoli;
    private double totaleCosto;

    public Carrello(Cliente cliente){
        this.cliente = cliente;
        this.articoli = new ArrayList<>();
        this.totaleCosto = 0.0;
    }

    public void aggiungiArticolo(Articolo articolo) {
        articoli.add(articolo);
        totaleCosto += articolo.getPrezzo();
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public List<Articolo> getArticoli(){
        return articoli;
    }

    public void setArticoli(List<Articolo> articoli){
        this.articoli = articoli;
    }

    public double getTotaleCosto(){
        return totaleCosto;
    }


    public void setTotaleCosto(double totaleCosto) {
        this.totaleCosto = totaleCosto;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Carrello del Cliente: ").append(cliente.getNomeCognome()).append("\n");
        for (Articolo articolo: articoli) {
            sb.append(articolo).append("\n");
        }
        sb.append("Totale Costo: ").append(totaleCosto);
        return sb.toString();
    }
}


