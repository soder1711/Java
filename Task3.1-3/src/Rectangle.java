public class Rectangle extends Shape {
    private final double width;
    private final double height;
    public Rectangle() {
        width = 4;
        height = 6;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }
}
