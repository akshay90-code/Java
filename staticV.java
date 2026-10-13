class staticV{
    int roll;
    String name;
    static String college="DSU";
    staticV(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    void display(){
        System.out.println(roll+" "+name+" "+college);
    }
    public static void main(String[]args){
        staticV s1=new staticV(20,"abc");
        staticV s2=new staticV(30,"ak");
        s1.display();
        s2.display();
    }


}