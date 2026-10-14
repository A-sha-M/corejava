import java.util.Scanner;
class machine{
    double balance=1000;
    void display(){
        System.out.println("The balance is:"+balance);
    }
    void deposit(double amt){
        balance=balance+amt;
        System.out.println("After deposit, the Balance is:"+balance);
    }
    void withdraw(double wd){
        if (wd>=balance){
            System.out.println("Insufficient balance, Please check");
        }
        else{
            System.out.println("The amt is processing");
        }
    }
}


public class atm {
    public static void main(String[] args) {
        machine m1=new machine();
        m1.display();
        m1.deposit(500);
        m1.withdraw(2000);
    }
}
