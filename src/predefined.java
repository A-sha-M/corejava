import java.util.Scanner;
public class predefined {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 2 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Maximum number is:"+Math.max(a,b));
        System.out.println("Minimum number is:"+Math.min(a,b));
        System.out.println("Abs number is:"+Math.abs(b));
        System.out.println("Square root of number is:"+Math.sqrt(a));
    }
}
