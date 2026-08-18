import java.util.*;//very important for input
 class input {
    public static void main(String[]args)
    {
        Scanner  sc =new Scanner(System.in);/*syntax for prompting input-class name object name =new class name(System.in) */
        System.out.println("give the 2 number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        float c=(float)a/b;

        System.out.println((a+b));
           System.out.println((a*b));
              System.out.println((a-b));
                 System.out.println(c);
                 sc.close();

    }

    
}
