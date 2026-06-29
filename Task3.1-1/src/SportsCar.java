public class SportsCar extends Car {
    public SportsCar (String typeName, double gasolineTankCapacity, double speed) {
        super(typeName, gasolineTankCapacity, speed);
    }
    @Override
    public void accelerate() {
        super.accelerate();
        super.accelerate();
    }
    @Override
    public void decelerate(int amount) {
        super.decelerate(amount * 2);
        super.decelerate(amount * 2);
    }
}
