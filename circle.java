class Circle {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate and display area
    void area() {
        System.out.println("Area: " + (3.14 * radius * radius));
    }

    // Method to calculate and display circumference
    void circumference() {
        System.out.println("Circumference: " + (2 * 3.14 * radius));
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(30);
        Circle c2 = new Circle(20);

        c1.area();
        c2.area();
        c1.circumference();
        c2.circumference();
    }
}