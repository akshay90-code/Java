class Employee {
    String company;
    
    void displayCompany() {
        System.out.println(company);
    }
}

class Teacher extends Employee {
    void teach() {
        System.out.println("Teaching");
    }
}

class Developer extends Employee {
    void writeCode() {
        System.out.println("Writing code");
    }
}

class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.company = "School A";
        t.displayCompany(); 
        t.teach();         

        Developer d = new Developer();
        d.company = "Tech Inc";
        d.displayCompany(); 
        d.writeCode();      
    }
}