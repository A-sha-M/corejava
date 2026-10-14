import java.util.Scanner;
public class role {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the role:");
        String role=sc.nextLine();
        System.out.println("Enter the username:");
        String username=sc.nextLine();
        System.out.println("Enter the password:");
        String password=sc.nextLine();
        if (role.equals("admin")){
            if (username.equals("abc")){
                if (password.equals("123")){
                    System.out.println("You can access the entire office");
                }
                else{
                    System.out.println("You are restricted to this place");
                }
            }
            else{
                System.out.println("Restricted");
            }
        }
        else if (role.equals("developer")){
            if (username.equals("abc")){
                if (password.equals("123")){
                    System.out.println("You can access the entire office");
                }
                else{
                    System.out.println("You are restricted to this place");
                }
            }
            else{
                System.out.println("Restricted");
            }
        }
        else {
            System.out.println("Not access");
        }
        }
    }

