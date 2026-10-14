import java.util.Scanner;
public class larger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a b and c value");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a>b && a>c){
            System.out.println(a+ "is larger");
        }
        else if (b>a && b>c){
            System.out.println(b+ "is larger");
        }
        else{
            System.out.println(c+" is larger");
        }
    }
}