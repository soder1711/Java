public class CarDriver {
    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla", 60, 20);
        myCar.fillTank();
        myCar.setCruiseSpeed(80);
        if (myCar.cruiseOn()) {
            System.out.println("Cruise control is on");
            System.out.println("Target speed: " + myCar.getCruiseSpeed());
            System.out.println("Current speed: " + myCar.getSpeed());
        }
        else {
            System.out.println("Cruise control failed");
        }
        myCar.cruiseOff();
        System.out.println("Cruise control is off");
    }
}
