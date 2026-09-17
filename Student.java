class Student{
    String name;
    int age;
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
    

    public static void main(String[]args){
        Student s1=new Student();

        Student s2=new Student();
        Student s3=new Student();
        s1.name="ak";
        s1.age=34;
        s2.name="b";
        s2.age=50;
        s3.name="c";
        s3.age=56;
        s1.display();
                s2.display();
        s3.display();


    }
    
    
}
