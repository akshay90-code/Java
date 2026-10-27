class person{
    String name;
    void name(){
        System.out.println(name);
    }}

class student extends person{
    int marks;
    void marks(){
        System.out.println(marks);
    }
}
class Main{
public static void main(String[]args){
    student p1=new student();
    student p2=new student();
    p1.name="a";
    p1.marks=90;
    p2.name="b";
    p2.marks=80;
    p1.name();
    p1.marks();
    p2.name();
    p2.marks();
}
}

