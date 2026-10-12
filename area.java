class area {
    public void area(double a) {
        System.out.println("Area (single double): " + (a * a));
    }

    public void area(double l, double b) {
        System.out.println("Area (rectangle): " + (l * b));
    }

    public void area(int r) {
        System.out.println("Area (circle): " + (3.14 * r * r));
    }

    public static void main(String[] args) {
        area a = new area();
        a.area(2.3);
        a.area(2, 3);
        a.area(3);
    }
}