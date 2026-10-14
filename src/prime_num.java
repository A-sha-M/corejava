import java.util.Scanner;
public class prime_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        boolean num=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                num=false;
                break;
            }
    }
        if(num){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a Prime number");

        }
}
}