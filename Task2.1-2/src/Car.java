public class Car {
    private double speed;
    private double gasolineLevel;
    private String typeName;
    private double gasolineTankCapacity;

    public Car(String typeName, double gasolineTankCapacity, double speed) {
        this.speed = speed;
        gasolineLevel = 0;
        this.typeName = typeName;
        this.gasolineTankCapacity = gasolineTankCapacity;
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
}
