package fr.fortytwo.avaj.launcher.aircrafts;

abstract public class Aircraft {
    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private long idCounter;

    protected Aircraft(String name, Coordinates coordinates) {
        this.id = this.nextId();
        this.name = name;
        this.coordinates = coordinates;
    }

    private long nextId() {
        return this.idCounter++;
    }

    public static class Coordinates {
        private final int longitude;
        private final int latitude;
        private final int height;

        Coordinates(int longitude, int latitude, int height) {
            this.longitude = longitude;
            this.latitude = latitude;
            this.height = height;
        }
        public int getLongitude() {
            return this.longitude;
        }

        public int getLatitude() {
            return this.latitude;
        }

        public int getHeight() {
            return this.height;
        }
    }

}
