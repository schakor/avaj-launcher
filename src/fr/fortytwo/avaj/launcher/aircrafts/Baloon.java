package fr.fortytwo.avaj.launcher.aircrafts;

public class Baloon extends Aircraft implements Flyable {
    private WeatherTower weatherTower;
    Baloon(String name, Coordinates coordinates) {
        super(name, coordinates);
    }
    public void updateConditions() {

    }
    public void registerTower(WeatherTower weatherTower) {

    }
}
