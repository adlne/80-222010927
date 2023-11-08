// Define an interface for shapes
interface ShapeS {
    double calculateArea();
}

// Create a Circle class that implements the Shape interface
class Circle implements ShapeS {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Create a Rectangle class that implements the Shape interface
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double calculateArea() {
        return width * height;
    }
}

// Create a Triangle class that implements the Shape interface
class Triangle implements ShapeS {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Create a ShapeCalculator class to test the shapes
public class ShapeCalculator {
    public static void main(String[] args) {
        // Create objects of different shapes
        ShapeS circle = new Circle(5.0);
        ShapeS rectangle = new Rectangle(4.0, 6.0);
        ShapeS triangle = new Triangle(3.0, 4.0);

        // Calculate and print the area of each shape
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Triangle Area: " + triangle.calculateArea());
    }
}
//THIS IS THE OUT PUT
PS C:\Users\USER> javac --version
javac 21.0.1
PS C:\Users\USER> Circle Area: 78.53981633974483
>> Rectangle Area: 24.0
>> Triangle Area: 6.0
