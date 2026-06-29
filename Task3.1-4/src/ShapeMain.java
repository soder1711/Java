public class ShapeMain {
    public static void main(String[] args) {
        Circle circle = new Circle("green");
        Triangle triangle = new Triangle("red");
        Rectangle rectangle = new Rectangle("blue");
        System.out.println("Area of Circle with radius 5.0: " + circle.calculateArea() + ". The color is " + circle.getColor());
        System.out.println("Area of Rectangle with width 4.0 and height 6.0: " + rectangle.calculateArea() + ". The color is " + rectangle.getColor());
        System.out.println("Area of Triangle with base 3.0 and height 8.0: " + triangle.calculateArea() + ". The color is " + triangle.getColor());
    }
}
