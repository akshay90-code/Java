class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    int employeeId;
    double salary;

    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + employeeId + ", Salary: $" + salary);
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, int age, int employeeId, double salary, String department) {
        super(name, age, employeeId, salary);
        this.department = department;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }
}

 class Main {
    public static void main(String[] args) {
        // Creating a Manager object
        Manager mgr = new Manager("Sarah Connor", 40, 101, 85000.0, "Cyberdyne Systems");
        
        // Calling the displayManager method (which also invokes displayEmployee and displayPerson)
        mgr.displayManager();
    }
}