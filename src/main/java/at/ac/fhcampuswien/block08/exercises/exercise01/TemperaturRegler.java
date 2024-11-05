package at.ac.fhcampuswien.block08.exercises.exercise01;

public class TemperaturRegler {
    private int temperatur;

    public TemperaturRegler(int temperatur) {
        this.temperatur = temperatur;
    }

    public void temperaturSetzen(int temperatur) {
        this.temperatur = temperatur;
    }

    public void temperaturAnzeigen() {
        System.out.println("Aktuelle Temperatur: " + this.temperatur + "°C");
    }
}