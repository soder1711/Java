public class VehicleMain {
    public static void main(String[] args) {
        Bus bus = new Bus(40);
        Car car = new Car("Red");
        Motorcycle motorcycle = new Motorcycle("Black");

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
