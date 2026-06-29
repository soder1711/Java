public class VehicleMain {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        car.start();
        car.stop();
        System.out.println(car.getInfo());
        System.out.println();
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());
        System.out.println();
        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());
    }
}
