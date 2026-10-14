// Asha
import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a grade:");
        char grade=sc.next().charAt(0);
        switch (grade){
            case 'A':
                System.out.println("Outstanding");
                break;
            case 'B':
                System.out.println("Excellent");
                break;
            case 'C':
                System.out.println("Very Good");
                break;
            case 'D':
                System.out.println("Good");
                break;
            case 'E':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Enter a valid grade");
        }
    }
}
