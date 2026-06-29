public class BusMain {
    public static void main(String[] args) {
        Bus myCar = new Bus("something", 60, 50, 5);
        myCar.fillTank();
        System.out.println("There are " + myCar.getNumberOfPassengers() + " passengers on board");
        myCar.accelerate();
        myCar.passengerEnter();
        System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h. The gasoline tank capacity is: " + myCar.getGasolineTankCapacity() + ". There are " + myCar.getNumberOfPassengers() + " passengers on board");


        myCar.decelerate(15);
        myCar.passengerExit();
        System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h. The gasoline tank capacity is: " + myCar.getGasolineTankCapacity() + ". There are " + myCar.getNumberOfPassengers() + " passengers on board");

    }
}
