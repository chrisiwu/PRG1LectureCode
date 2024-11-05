package at.ac.fhcampuswien.block08.exercises.exercise02;

public class Rennspiel {
    public static void main(String[] args) {
        Strecke strecke = new Strecke("Formel-1-Strecke", 100); // 100 km Strecke
        Rennen rennen = new Rennen(strecke);

        // Fahrzeuge zum Rennen hinzufügen
        Fahrzeug auto1 = new Fahrzeug("Ferrari", 195); // Höchstgeschwindigkeit 195 km/h
        Fahrzeug auto2 = new Fahrzeug("Mercedes", 185); // Höchstgeschwindigkeit 185 km/h
        Fahrzeug auto3 = new Fahrzeug("Red Bull", 190); // Höchstgeschwindigkeit 190 km/h

        rennen.fahrzeugHinzufuegen(auto1);
        rennen.fahrzeugHinzufuegen(auto2);
        rennen.fahrzeugHinzufuegen(auto3);

        // Rennen starten
        rennen.rennenStarten();
    }
}