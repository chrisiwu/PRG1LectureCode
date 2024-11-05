package at.ac.fhcampuswien.block08.exercises.exercise02;

import java.util.ArrayList;
import java.util.List;

public class Rennen {
    private Strecke strecke;
    private List<Fahrzeug> fahrzeuge;

    public Rennen(Strecke strecke) {
        this.strecke = strecke;
        this.fahrzeuge = new ArrayList<>();
    }

    // Fahrzeug zum Rennen hinzufügen
    public void fahrzeugHinzufuegen(Fahrzeug fahrzeug) {
        this.fahrzeuge.add(fahrzeug);
    }

    // Rennen starten und alle Fahrzeuge fahren lassen
    public void rennenStarten() {
        System.out.println("Das Rennen auf der Strecke " + this.strecke.getName() + " beginnt!");

        for (Fahrzeug f : this.fahrzeuge) {
            System.out.println(f.getName() + " fährt eine Runde.");
            f.rundeFahren(this.strecke.getLaenge());
        }

        // Sieger ermitteln
        Fahrzeug sieger = null;
        int besteZeit = Integer.MAX_VALUE;
        for (Fahrzeug f : this.fahrzeuge) {
            System.out.println(f.getName() + " hat das Rennen in " + f.getGesamtZeit() + " Minuten abgeschlossen.");
            if (f.getGesamtZeit() < besteZeit) {
                besteZeit = f.getGesamtZeit();
                sieger = f;
            }
        }

        System.out.println("Der Sieger ist: " + sieger.getName() + " mit einer Zeit von " + besteZeit + " Minuten.");
    }
}