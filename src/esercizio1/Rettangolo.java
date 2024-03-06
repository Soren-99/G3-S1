package esercizio1;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double calcolaArea() {
        return altezza * larghezza;
    }

    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }

    public void stampaRettangolo() {
        System.out.println("Area del rettangolo: " + calcolaArea());
        System.out.println("Perimetro del rettangolo: " + calcolaPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        System.out.println("Area del primo rettangolo: " + rettangolo1.calcolaArea());
        System.out.println("Perimetro del primo rettangolo " + rettangolo1.calcolaPerimetro());
        System.out.println("Area del secondo rettangolo: " + rettangolo2.calcolaArea());
        System.out.println("Perimetro del secondo rettangolo: " + rettangolo2.calcolaPerimetro());

        double sommaAree = rettangolo1.calcolaArea() + rettangolo2.calcolaArea();
        double sommaPerimetri = rettangolo2.calcolaPerimetro() + rettangolo2.calcolaPerimetro();

        System.out.println("Somma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }
}
