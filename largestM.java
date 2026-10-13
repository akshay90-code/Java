class largestM{
    static void largest(int a,int b,int c){
        
        if(a>b && a>c){
            System.out.println(a+" is largest");
        }
        else if(b>a && b>c){
            System.out.println(b +" is largest");

        }
        else{
            System.out.println(c+" is largest");
        }
    }
    public static void main(String[] args) {
        largestM.largest(1,2,5);
        largestM.largest(2,9,4);
    }
}