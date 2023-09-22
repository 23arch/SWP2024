package Flieger;

import java.util.ArrayList;
import java.util.List;

public abstract class Flugzeug {
    private String modell;
    private int baujahr;
    private int kapazitaet;
    private List<Engine> engines;
    private boolean isReady;
    private double weight;
    private String fuelType;

    public Flugzeug(String modell, int baujahr, int kapazitaet, boolean isReady, double weight, String fuelType) {
        this.modell = modell;
        this.baujahr = baujahr;
        this.kapazitaet = kapazitaet;
        this.engines = new ArrayList<>();
        this.isReady = isReady;
        this.weight = weight;
        this.fuelType = fuelType;
    }

    public abstract boolean isFlugbereit();

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public int getKapazitaet() {
        return kapazitaet;
    }

    public void setKapazitaet(int kapazitaet) {
        this.kapazitaet = kapazitaet;
    }

    public List<Engine> getEngines() {
        return engines;
    }

    public void addEngine(Engine engine) {
        this.engines.add(engine);
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getTotalThrust() {
        int totalThrust = 0;

        for (Engine engine : engines) {
            totalThrust += engine.getThrust();
        }

        return totalThrust;
    }

}
