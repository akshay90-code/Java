public class Employee {
    String name;
    int age;
    String role;
    void display(){
        System.out.println("name :"+name);
        System.out.println("age :"+age);
        System.out.println("role:"+role);

    }
    public static void main(String[]args){
        Employee HR =new Employee();
        Employee IT=new Employee();
        Employee Accounts=new Employee();

        HR.name="a";
        HR.age=40;
        HR.role="__";
        IT.name="b";
        IT.age=30;
        IT.role="_|_";
        Accounts.name="c";
        Accounts.age=40;
        Accounts.role="__";
        HR.display();
        IT.display();
        Accounts.display();

    }
    
}
