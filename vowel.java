import java.util.*;
public class vowel {
    public static void main(String[]args){
        int count=0;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u'){
                count++;
            }
        }
        System.out.println(count);
        sc.close();



    }
    
}
