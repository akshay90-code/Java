import java.util.*;
public class string1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int upper=0;
        int lower=0;
        int digit=0;
        int space=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(Character.isUpperCase(c)){
                upper++;

            }
            else if(Character.isLowerCase(c))
                lower++;
            else if(Character.isDigit(c))
                digit++;
            else if(Character.isSpaceChar(c))
                space++;
            
             
        }
        System.out.println("Upper"+upper);
                System.out.println("lower"+lower);
        System.out.println("digit"+digit);
        System.out.println("space"+space);
        sc.close();


    }
    
}
