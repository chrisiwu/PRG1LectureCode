package at.ac.fhcampuswien.block09.exercises.exercise01;

public class SmartHome {
    public static void main(String[] args) {
        Raum wohnzimmer = new Raum("Wohnzimmer", 22); // Starttemperatur 22°C
        Geraet lampe = new Geraet("Lampe");
        Geraet fernseher = new Geraet("Fernseher");

        wohnzimmer.geraetHinzufuegen(lampe);
        wohnzimmer.geraetHinzufuegen(fernseher);

        wohnzimmer.raumStatusAnzeigen();

        wohnzimmer.geraetSteuern("Lampe", true); // Lampe einschalten
        wohnzimmer.temperaturEinstellen(24); // Temperatur erhöhen

        wohnzimmer.raumStatusAnzeigen(); // Status nach Änderungen anzeigen
    }
}