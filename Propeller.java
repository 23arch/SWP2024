package Flieger;

public class Propeller extends Flugzeug {
    private int numPropeller;
    private int maxGeschwindigkeit;

    public Propeller(String modell, int baujahr, int kapazitaet, boolean isReady, double weight, String fuelType, int numPropeller, int maxGeschwindigkeit) {
        super(modell, baujahr, kapazitaet, isReady, weight, fuelType);
        this.numPropeller = numPropeller;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
    }

    @Override
    public boolean isFlugbereit() {
        // Implementierung für Propeller-Flugzeug-Flugbereitschaft
        return isReady();
    }

    public int getNumPropeller() {
        return numPropeller;
    }

    public void setNumPropeller(int numPropeller) {
        this.numPropeller = numPropeller;
    }

    public int getMaxGeschwindigkeit() {
        return maxGeschwindigkeit;
    }

    public void setMaxGeschwindigkeit(int maxGeschwindigkeit) {
        this.maxGeschwindigkeit = maxGeschwindigkeit;
    }
}
