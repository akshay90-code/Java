public class Employee2 {
   
    String name;
    int age;
    String role;
    Employee2(String name,int age,String role){
        this.name=name;
        this.age=age;
        this.role=role;
    }
    void display(){
        System.out.println("name :"+name);
        System.out.println("age :"+age);
        System.out.println("role:"+role);

    }
    public static void main(String[]args){
        Employee2 HR =new Employee2("a",40,"__");
        Employee2 IT=new Employee2("b",30,"_|_");
        Employee2 Accounts=new Employee2("c",25,"Accounts");

        HR.display();
        IT.display();
        Accounts.display();

    }
    
}
