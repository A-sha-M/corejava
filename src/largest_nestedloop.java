import java.util.Scanner;
public class largest_nestedloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a b and c value");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a>b ){
            if (a>c){
                System.out.println(a+ " a is larger");}
            else{
                System.out.println(c+ " c is larger");
        }
        }
        else{
            if (b>c){
                System.out.println(b+" b is larger");
            }
            else {
                System.out.println(c + " c is larger");
            }
        }
    }
}