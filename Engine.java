package Flieger;

public class Engine {
    private String type;
    private int thrust;

    public Engine(String type, int thrust) {
        this.type = type;
        this.thrust = thrust;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getThrust() {
        return thrust;
    }

    public void setThrust(int thrust) {
        this.thrust = thrust;
    }
}
