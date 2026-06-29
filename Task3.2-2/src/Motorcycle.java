public class Motorcycle extends VehicleAbstract {
    public Motorcycle(String color) {
        super("Gasoline", color, "Motorcycle");
    }
    public String getInfo() {
        return super.getInfo() + "\nColor: " + super.getColor();
    }
}
