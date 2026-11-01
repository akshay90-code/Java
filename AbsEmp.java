abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    void displayInfo() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}

public class AbsEmp extends Employee {
    double monthlySalary;

    AbsEmp(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }

    public static void main(String[] args) {
        AbsEmp emp = new AbsEmp("Rahul", 101, 45000.0);
        emp.displayInfo();
        System.out.println("Salary: " + emp.calculateSalary());
    }
}