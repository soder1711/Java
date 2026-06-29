public class ShapeMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        System.out.println("Area of Circle with radius 5.0: " + circle.calculateArea());
        System.out.println("Area of Rectangle with width 4.0 and height 6.0: " + rectangle.calculateArea());
        System.out.println("Area of Triangle with base 3.0 and height 8.0: " + triangle.calculateArea());
    }
}
