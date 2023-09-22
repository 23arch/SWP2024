package Flieger;

public class Jet extends Flugzeug {
    private int numDuesen;
    private int maxGeschwindigkeit;

    public Jet(String modell, int baujahr, int kapazitaet, boolean isReady, double weight, String fuelType, int numDuesen, int maxGeschwindigkeit) {
        super(modell, baujahr, kapazitaet, isReady, weight, fuelType);
        this.numDuesen = numDuesen;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
    }

    @Override
    public boolean isFlugbereit() {

        return isReady();
    }

    public int getNumDuesen() {
        return numDuesen;
    }

    public void setNumDuesen(int numDuesen) {
        this.numDuesen = numDuesen;
    }

    public int getMaxGeschwindigkeit() {
        return maxGeschwindigkeit;
    }

    public void setMaxGeschwindigkeit(int maxGeschwindigkeit) {
        this.maxGeschwindigkeit = maxGeschwindigkeit;
    }
}
