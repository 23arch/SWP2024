package Flieger;

public class Hangar {
    private String name;
    private Flugzeug flugzeug;
    private int maxCapacity;
    private int currentCapacity;
    private String location;
    private boolean isSecurityEnabled;
    private boolean isClimateControlled;

    public Hangar(String name, int maxCapacity, String location, boolean isSecurityEnabled, boolean isClimateControlled) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.currentCapacity = 0;
        this.location = location;
        this.isSecurityEnabled = isSecurityEnabled;
        this.isClimateControlled = isClimateControlled;
    }

    public Flugzeug getFlugzeug() {
        return flugzeug;
    }

    public void parkFlugzeug(Flugzeug flugzeug) {
        if (currentCapacity < maxCapacity) {
            this.flugzeug = flugzeug;
            currentCapacity++;
        } else {
            System.out.println("Hangar is full. Cannot park the aircraft.");
        }
    }

    public void releaseFlugzeug() {
        this.flugzeug = null;
        if (currentCapacity > 0) {
            currentCapacity--;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFlugzeug(Flugzeug flugzeug) {
        this.flugzeug = flugzeug;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isSecurityEnabled() {
        return isSecurityEnabled;
    }

    public void setSecurityEnabled(boolean securityEnabled) {
        isSecurityEnabled = securityEnabled;
    }

    public boolean isClimateControlled() {
        return isClimateControlled;
    }

    public void setClimateControlled(boolean climateControlled) {
        isClimateControlled = climateControlled;
    }

    public void addFlugzeug(Flugzeug flugzeug) {
        if (currentCapacity < maxCapacity) {
            this.flugzeug = flugzeug;
            currentCapacity++;
        } else {
            System.out.println("Hangar is full. Cannot add more aircraft.");
        }
    }
}
