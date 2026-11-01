public class StaticStudent {
    int rollNo;
    String name;   
    static String college = "dsu"; 

    StaticStudent(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }

    public static void main(String args[]) {
        StaticStudent s1 = new StaticStudent(111, "Karan");
        StaticStudent s2 = new StaticStudent(222, "Aryan");

        s1.display();
        s2.display();
    }
}