public interface Figure {
    double calculatePerimeter();
    double calculateArea();
}
public class Rectangle implements Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
public class Trapezium implements Figure {
    private double base1;
    private double base2;
    private double side1;
    private double side2;
    private double height;

    public Trapezium(double base1, double base2, double side1, double side2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return base1 + base2 + side1 + side2;
    }

    @Override
    public double calculateArea() {
        return ((base1 + base2) / 2) * height;
    }
}
public class Main {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        
        Figure circle = new Circle(7);
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        System.out.println("Circle Area: " + circle.calculateArea());
        
        Figure trapezium = new Trapezium(5, 7, 3, 4, 6);
        System.out.println("Trapezium Perimeter: " + trapezium.calculatePerimeter());
        System.out.println("Trapezium Area: " + trapezium.calculateArea());
    }
}
