package BikeSpeed;

public class BikeSpeedLevels {
    private boolean state;
    private int speed;

    public boolean checkstate() {
        return state;
    }

    public void turnOn() {
        this.state = true;
    }

    public void turnOff() {
        this.state = false;
    }

    public int checkSpeed() {
        return speed;
    }

    public void putIntoGear1AndIncreaseSpeed() {
        this.speed = speed + 1;
    }

    public void putIntoGear1AndDecreaseSpeed() {
        this.speed = speed - 1;
    }

    public void putIntoGear2AndIncreaseSpeed() {
        this.speed = speed + 2;
    }

    public void putIntoGear2AndReduceSpeed() {
        this.speed = speed - 2;
    }


    public void putIntoGear3AndIncreaseSpeed() {
        this.speed = speed + 3;
    }

    public void putIntoGear3AndReduceSpeed() {
        this.speed = speed - 3;
    }

    public void putIntoGear4AndIncreaseSpeed() {
        this.speed = speed + 4;
    }

    public void putIntoGear4AndReduceSpeed() {
        this.speed = speed - 4;
    }
}
