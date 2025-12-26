package OCP;

public class OCP_apres {
    public interface Shape {
        double getArea();
    }
    public class Rectangle implements Shape {
        double width, height;
        public double getArea() { return width * height; }
    }

    public class Circle implements Shape {
        double radius;
        public double getArea() { return Math.PI * radius * radius; }
    }
    public class AreaCalculator {
        public double calculate(Shape shape) {
            return shape.getArea(); // Marche pour n'importe quelle forme future !
        }
    }
}
