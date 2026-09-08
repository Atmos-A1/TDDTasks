package AirConditoner;

public class AirConditioner {

    private boolean state = false;
    private int temperature;

    public boolean checkState() {
        return state;
    }

    public void turnOn() {
        this.state = true;
        temperature = 16;
    }

    public void turnOff() {
        this.state = false;
        temperature = 0;
    }

    public int checkTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if(temperature < 30)
            this.temperature = temperature + 1;
    }

    public void decreaseTemperature() {
        if(temperature > 16)
            this.temperature = temperature - 1;
    }
}
