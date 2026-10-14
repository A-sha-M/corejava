import java.util.Scanner;
public class pos_neg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a value");
        int a=sc.nextInt();
        if (a>0){
            if (a%2==0){
                System.out.println(a+ " a is positive even number");
            }
            else{
                System.out.println(a+ " a is positive odd number");
            }
        }
        else{
            if (a%2==0){
                System.out.println(a+ " a is negative even number");
            }
            else{
                System.out.println(a+ " a is negative odd number");
            }
        }
    }
}
