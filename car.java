public class car {
    double m;
    String name;
    String type;

    void display(){
        System.out.println("mileage:"+m);
                System.out.println("name:"+name);
                        System.out.println("type:"+type);


    }
    public static void main(String[]args){
        car c1=new car();
        car c2=new car();
        c1.m=30;
        c2.m=40;
        c1.name="tata";
        c2.name="toyota";
        c1.type="SUV";
        c2.type="SUV";
        c1.display();
        c2.display();
    }

    
}
