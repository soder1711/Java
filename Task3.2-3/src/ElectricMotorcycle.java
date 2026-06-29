public class ElectricMotorcycle extends VehicleAbstract {
    public ElectricMotorcycle(String color) {
        super("Electricity", color, "Motorcycle");
    }
    @Override
    public void charge() {
        System.out.println("Electric Motorcycle is charging...");
    }
}
