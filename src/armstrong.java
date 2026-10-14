import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int original=n;
        int a=0;
        while(n>0){
            int num=n%10;
            a=a+(num*num*num);
            n=n/10;
        }
        if (original==a){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not armstrong");
        }
    }
}
