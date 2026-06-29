public class Rectangle extends Shape {
    private final double width;
    private final double height;
    public Rectangle(String color) {
        super(color);
        width = 4;
        height = 6;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }
}
