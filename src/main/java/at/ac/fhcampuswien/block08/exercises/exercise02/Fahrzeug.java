package at.ac.fhcampuswien.block08.exercises.exercise02;

import java.util.Random;

public class Fahrzeug {
    private String name;
    private int maxGeschwindigkeit; // Höchstgeschwindigkeit
    private int gesamtZeit; // Gesamte Rennzeit in Sekunden
    private boolean hatDefekt; // Gibt an, ob das Fahrzeug einen Defekt hat
    private boolean hatteUnfall; // Gibt an, ob das Fahrzeug einen Unfall hatte

    public Fahrzeug(String name, int maxGeschwindigkeit) {
        this.name = name;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
        this.gesamtZeit = 0;
        this.hatDefekt = false;
        this.hatteUnfall = false;
    }

    public String getName() {
        return this.name;
    }

    public int getMaxGeschwindigkeit() {
        return this.maxGeschwindigkeit;
    }

    // Methode, um die Zeit für eine Runde zu berechnen (mit Zufallseinfluss und unerwarteten Ereignissen)
    public void rundeFahren(int streckenlaenge) {
        Random rand = new Random();
        // Zufällige Geschwindigkeit zwischen 90% und 110% der Maximalgeschwindigkeit
        int aktuelleGeschwindigkeit = (int) (this.maxGeschwindigkeit * (0.9 + 0.2 * rand.nextDouble()));

        // Unerwartetes Ereignis: Technischer Defekt (10% Wahrscheinlichkeit)
        if (rand.nextInt(100) < 10) {
            this.hatDefekt = true;
            aktuelleGeschwindigkeit *= 0.7; // Geschwindigkeit sinkt um 30% bei Defekt
            System.out.println(this.name + " hat einen technischen Defekt! Geschwindigkeit reduziert.");
        }

        // Unerwartetes Ereignis: Unfall (5% Wahrscheinlichkeit)
        if (rand.nextInt(100) < 5) {
            this.hatteUnfall = true;
            this.gesamtZeit += 5; // 5 Minuten Verzögerung durch Unfall
            System.out.println(this.name + " hatte einen Unfall! Verzögerung von 5 Minuten.");
        }

        // Unerwartetes Ereignis: Wetterbedingungen (Regen) (15% Wahrscheinlichkeit)
        if (rand.nextInt(100) < 15) {
            aktuelleGeschwindigkeit *= 0.8; // Geschwindigkeit sinkt um 20% bei Regen
            System.out.println(this.name + " fährt im Regen! Geschwindigkeit reduziert.");
        }

        // Zeit berechnet sich durch Streckenlänge geteilt durch die aktuelle Geschwindigkeit
        this.gesamtZeit += 60 * streckenlaenge / aktuelleGeschwindigkeit;
    }

    public int getGesamtZeit() {
        return this.gesamtZeit;
    }

    public boolean hatDefekt() {
        return this.hatDefekt;
    }

    public boolean hatteUnfall() {
        return this.hatteUnfall;
    }
}