public class Vehicle {
    String model;
    int year;

    Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Vehicle Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Honda City", 2023);
        v.display();
    }
}