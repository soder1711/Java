public class Car extends VehicleAbstract {
    public Car(String color) {
        super("Petrol", color, "Car");
    }
    public String getInfo() {
        return super.getInfo() + "\nColor: " + super.getColor();
    }
}
