package at.ac.fhcampuswien.block09.exercises.exercise01;

import java.util.ArrayList;
import java.util.List;

public class Raum {
    private String name;
    private List<Geraet> geraete;
    private TemperaturRegler temperaturRegler;

    public Raum(String name, int anfangsTemperatur) {
        this.name = name;
        this.geraete = new ArrayList<>();
        this.temperaturRegler = new TemperaturRegler(anfangsTemperatur);
    }

    // Gerät hinzufügen
    public void geraetHinzufuegen(Geraet geraet) {
        this.geraete.add(geraet);
    }

    // Gerät steuern (ein- oder ausschalten)
    public void geraetSteuern(String geraetName, boolean einschalten) {
        for (Geraet g : this.geraete) {
            if (g.getName().equals(geraetName)) {
                if (einschalten) {
                    g.einschalten();
                } else {
                    g.ausschalten();
                }
                return;
            }
        }
        System.out.println("Gerät nicht gefunden.");
    }

    // Temperatur einstellen
    public void temperaturEinstellen(int temperatur) {
        this.temperaturRegler.temperaturSetzen(temperatur);
        System.out.println("Die Temperatur im " + this.name + " wurde auf " + temperatur + "°C eingestellt.");
    }

    // Alle Geräte und Temperatur anzeigen
    public void raumStatusAnzeigen() {
        System.out.println("Raum: " + this.name);
        temperaturRegler.temperaturAnzeigen();
        System.out.println("Geräte im Raum:");
        for (Geraet g : this.geraete) {
            System.out.println("- " + g.getName() + ": " + (g.istAn() ? "An" : "Aus"));
        }
    }
}