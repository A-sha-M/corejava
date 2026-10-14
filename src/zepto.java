import java.util.Scanner;
class product{
    String name;
    double price;
    int quantity;
    double total_price;

    void display(){
        System.out.println("The product name is "+name+" price "+price+" and quantity "+quantity);
    }

    void totalprice(){
        total_price=price*quantity;
        System.out.println("Total price is:"+total_price);
    }
    void offer(){
        if(total_price>=500){
            System.out.println("Total price after discounting:"+(total_price-100));
        }
        else{
            System.out.println("Total price after discounting:"+(total_price-50));
        }
    }
}
public class zepto {
    public static void main(String[] args) {
        product p1=new product();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the product name:");
        p1.name=sc.nextLine();
        System.out.println("Enter the product price:");
        p1.price=sc.nextDouble();
        System.out.println("Enter the product quality:");
        p1.quantity=sc.nextInt();
        p1.display();
        p1.totalprice();
        p1.offer();
    }
}
