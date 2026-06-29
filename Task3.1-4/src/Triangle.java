public class Triangle extends Shape {
    private final double height;
    private final double base;
    public Triangle(String color) {
        super(color);
        height = 8;
        base = 3;
    }
    @Override
    public double calculateArea() {
        return (height * base) / 2;
    }
}
