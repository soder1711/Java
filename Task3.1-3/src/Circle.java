public class Circle extends Shape {
    private final double radius;
    public Circle() {
        radius = 5;
    }
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
