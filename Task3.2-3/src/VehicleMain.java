public class VehicleMain {
    public static void main(String[] args) {
        Bus bus = new Bus(40);
        Car car = new Car("Red");
        Motorcycle motorcycle = new Motorcycle("Black");
        ElectricCar electricCar = new ElectricCar ("Blue");
        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle("Green");

        car.start();
        car.stop();
        System.out.println(car.getInfo());
        car.charge();

        System.out.println();

        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());
        motorcycle.charge();

        System.out.println();

        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());
        bus.charge();

        System.out.println();

        electricCar.start();
        electricCar.stop();
        System.out.println(electricCar.getInfo());
        electricCar.charge();

        System.out.println();

        electricMotorcycle.start();
        electricMotorcycle.stop();
        System.out.println(electricMotorcycle.getInfo());
        electricMotorcycle.charge();
    }
}
