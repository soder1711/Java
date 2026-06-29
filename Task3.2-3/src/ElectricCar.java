public class ElectricCar extends VehicleAbstract{
    public ElectricCar(String color) {
        super("Electricity", color, "Car");
    }
    @Override
    public void charge() {
        System.out.println("Electric Car is charging...");
    }
}
