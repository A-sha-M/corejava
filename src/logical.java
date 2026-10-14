// ASHA
import java.util.Scanner;
public class logical {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a and b values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Logical AND operation:" +(a>0 && b>0));
        System.out.println("Logical OR operation:" +(a>0 || b>0));
        System.out.println("Logical Not Operation:" +(!(a>0)));
    }
}
