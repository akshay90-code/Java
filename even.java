class even{
    static void check(int n){
       if(n%2==0){
        System.out.println(n+" is even");
       }
       else
        System.out.println(n+" is odd");
    }
    public static void main(String[] args) {
        even.check(3);
        even.check(5);


    }

}