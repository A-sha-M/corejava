import java.util.Scanner;
public class bitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a and b values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Bitwise AND:" +(a&b));
        System.out.println("Bitwise OR:" +(a|b));
        System.out.println("Bitwise XOR:" +(a^b));
        System.out.println("Bitwise Right Shift:" +(a>>2));
        System.out.println("Bitwise Left Shift:" +(a<<2));
        System.out.println("Bitwise Compliment:" +(~a));
    }
}
