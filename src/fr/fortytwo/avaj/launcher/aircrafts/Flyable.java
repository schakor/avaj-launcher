package fr.fortytwo.avaj.launcher.aircrafts;

public interface Flyable {

    public void updateConditions();
    public void registerTower(WeatherTower weatherTower);
}
