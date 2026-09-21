public class Car2 {
    double m;
    String name;
    String type;
    Car2(double m,String name, String type ){
        this.m=m;
        this.name=name;
        this.type=type;
    }

    void display(){
        System.out.println("mileage:"+m);
        System.out.println("name:"+name);
        System.out.println("type:"+type);


    }
    public static void main(String[]args){
        Car2 c1=new Car2(25,"bmw","SUV");
        Car2 c2=new Car2(20,"tata","SUV");

        c1.display();
        c2.display();
    }

    
}
