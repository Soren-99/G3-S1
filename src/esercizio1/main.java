package esercizio1;

public class main {

    public static void main(String[] args){

        Rettangolo rettangolo1 = new Rettangolo(5, 10);
        Rettangolo rettangolo2 = new Rettangolo(3,7);

        System.out.println("Primo rettangolo: ");
        rettangolo1.stampaRettangolo();
        System.out.println();


        System.out.println("Secondo rettangolo: ");
        rettangolo2.stampaRettangolo();
        System.out.println();


        System.out.println("Stampa dei due rettangoli: ");
        Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);
    }
}
