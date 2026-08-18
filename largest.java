import java.util.*;

public class largest {
    public static void main(String[]args){
        System.out.println("enter 3 number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println(a+" is largest");
        }
        else if(b>a && b>c){
            System.out.println(b +" is largest");

        }
        else{
            System.out.println(c+" is largest");
        }
        sc.close();


    }
    
}
