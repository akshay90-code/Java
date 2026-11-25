import java.util.Scanner;

public class SumOfDigitsRec {
    public static int digitSum(int n) {
        n = Math.abs(n);
        if (n == 0) {
            return 0;
        }
        return (n % 10) + digitSum(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        System.out.println("Sum of digits: " + digitSum(number));
        sc.close();
    }
}