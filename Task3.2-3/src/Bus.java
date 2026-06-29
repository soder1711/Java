public class Bus extends VehicleAbstract {
    private int capacity;
    public Bus(int capacity) {
        super("Diesel", "nothing", "Bus");
        this.capacity = capacity;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + "\nCapacity: " + capacity + " passengers";
    }
}
