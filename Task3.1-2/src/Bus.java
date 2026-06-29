public class Bus extends Car {
    private int numberOfPassengers;
    public Bus(String typeName, double gasolineTankCapacity, double speed, int numberOfPassengers) {
        super(typeName, gasolineTankCapacity, speed);
        this.numberOfPassengers = numberOfPassengers;
    }
    public void passengerEnter() {
        numberOfPassengers += (int) (Math.random() * 4) + 1;
    }
    public void passengerExit() {
        int exiting = (int) (Math.random() * 4) + 1;
        numberOfPassengers = Math.max(0, numberOfPassengers - exiting);
    }
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
}
