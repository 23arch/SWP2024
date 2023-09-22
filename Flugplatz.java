package Flieger;

import java.util.ArrayList;
import java.util.List;

public class Flugplatz {
    private List<Hangar> hangars;
    private String location;
    private int numRunways;
    private boolean hasControlTower;
    private int altitude;
    private boolean hasFuelStation;

    public Flugplatz(String location, int numRunways, boolean hasControlTower, int altitude, boolean hasFuelStation) {
        this.hangars = new ArrayList<>();
        this.location = location;
        this.numRunways = numRunways;
        this.hasControlTower = hasControlTower;
        this.altitude = altitude;
        this.hasFuelStation = hasFuelStation;
    }

    public void addHangar(Hangar hangar) {
        hangars.add(hangar);
    }

    public List<Hangar> getHangars() {
        return hangars;
    }

    public void setHangars(List<Hangar> hangars) {
        this.hangars = hangars;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumRunways() {
        return numRunways;
    }

    public void setNumRunways(int numRunways) {
        this.numRunways = numRunways;
    }

    public boolean isHasControlTower() {
        return hasControlTower;
    }

    public void setHasControlTower(boolean hasControlTower) {
        this.hasControlTower = hasControlTower;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public boolean isHasFuelStation() {
        return hasFuelStation;
    }

    public void setHasFuelStation(boolean hasFuelStation) {
        this.hasFuelStation = hasFuelStation;
    }
}
