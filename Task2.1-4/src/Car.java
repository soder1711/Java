public class Car {
    private double speed;
    private double gasolineLevel;
    private String typeName;
    private double gasolineTankCapacity;
    private boolean cruiseControl;
    private double targetSpeed;
    private double maxSpeed;
    private double minSpeed;

    public Car(String typeName, double gasolineTankCapacity, double speed) {
        this.speed = speed;
        gasolineLevel = 0;
        this.typeName = typeName;
        this.gasolineTankCapacity = gasolineTankCapacity;
        cruiseControl = false;
        minSpeed = 40;
        maxSpeed = 120;
    }
    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    double getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = gasolineTankCapacity;
    }
    double getGasolineLevel() {
        return gasolineLevel;
    }
    double getGasolineTankCapacity() {
        return gasolineTankCapacity;
    }
    public double getCruiseSpeed() {
        return targetSpeed;
    }
    public void setCruiseSpeed(double speed) {
        if (speed >= minSpeed && speed <= maxSpeed) {
            targetSpeed = speed;
        }
    }
    public boolean cruiseOn() {
        if (targetSpeed == 0) {
            return false;
        }
        cruiseControl = true;
        while (speed < targetSpeed) {
            accelerate();
            if (gasolineLevel <= 0) {
                cruiseControl = false;
                return false;
            }
        }
        while (speed > targetSpeed) {
            decelerate(10);
        }
        return true;
    }
    public boolean cruiseOff() {
        return cruiseControl = false;
    }
    public boolean isOn() {
        return cruiseControl;
    }
}
