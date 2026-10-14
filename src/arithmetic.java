// ASHA
import java.util.Scanner;
public class arithmetic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a and b values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Addition of a and b:"+(a+b));
        System.out.println("Substraction of a and b:"+(a-b));
        System.out.println("Multiplication of a and b:"+(a*b));
        System.out.println("Division of a and b:"+(a/b));
        System.out.println("Modules of a and b:"+(a%b));

    }
}
