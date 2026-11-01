abstract class Shape {
    abstract double area();
}

public class AbsShape extends Shape {
    double radius;

    AbsShape(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Shape circle = new AbsShape(5.0);
        System.out.println("Area of Circle: " + circle.area());
    }
}