package fr.fortytwo.avaj.launcher.aircrafts;

abstract public class AircraftFactory {
    public Flyable newAircaft(String type, String name, int longitude, int latitude, int height) {
        switch (type) {
            case "Helicopter" -> {
                return new Helicopter(name, new Aircraft.Coordinates(longitude, latitude, height));
            }
            case "JetPlane" -> {
                return new JetPlane(name, new Aircraft.Coordinates(longitude, latitude, height));
            }
            case "Baloon" -> {
                return new Baloon(name, new Aircraft.Coordinates(longitude, latitude, height));
            }
        }
        return null;
    }
}
