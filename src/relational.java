// ASHA
import java.util.Scanner;

public class relational {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a and b values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Equal to:" +(a==b));
        System.out.println("Not equal to:" +(a!=b));
        System.out.println("Greater than:" +(a>b));
        System.out.println("Less than:" +(a<b));
        System.out.println("Greater than or equal to:" +(a>=b));
        System.out.println("Less than or equal to:" +(a<=b));
    }
}
