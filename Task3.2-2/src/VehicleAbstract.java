public abstract class VehicleAbstract implements Vehicle {
    private String type;
    private String fuel;
    private String color;
    public VehicleAbstract(String fuel, String color, String type) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
    }
    public String getType() {
        return type;
    }
    public String getFuel() {
        return fuel;
    }
    public String getColor() {
        return color;
    }
    @Override
    public void start() {
        System.out.println(type + " is starting...");
    }
    @Override
    public void stop() {
        System.out.println(type + " is stopping...");
    }
    @Override
    public String getInfo() {
        return type + " Information: \nType: " + type + "\nFuel: " + fuel;
    }
}
