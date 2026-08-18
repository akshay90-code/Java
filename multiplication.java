import java.util.*;
public class multiplication {
    public static void main(String[]args){
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(a+"*"+i+"="+(a*i));
        }
        sc.close();
    }


    
}
