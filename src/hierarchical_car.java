class car1{

}
class BMW extends car1{
    String color;
    double price;
    BMW(String color,double price){
        this.color=color;
        this.price=price;
    }
    void b_details(){
        System.out.println("BMW car details are: "+color+" "+price);
    }
}
class AUDI extends car1 {
    String color;
    double price;

    AUDI(String color, double price) {
        this.color = color;
        this.price = price;
    }

    void a_details() {
        System.out.println("AUDI car details are: " + color + " " + price);
    }
}
public class hierarchical_car {
    public static void main(String[] args) {
        BMW b1=new BMW("White",1500000);
        b1.b_details();
        AUDI a1=new AUDI("Black",250000);
        a1.a_details();
    }
}
