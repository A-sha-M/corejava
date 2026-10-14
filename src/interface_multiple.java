interface zepto1{
    default void demo(String product, double price)
    {
        System.out.println("The product details from Zepto: product name is "+product+" price "+price);
    }
}
interface instaMart{
    static void demo1(String product, double price)
    {
        System.out.println("The product details from insta mart: product name is "+product+" price "+price);

    }
}
class onlineShopping implements zepto1,instaMart{

}
public class interface_multiple {
    public static void main(String[] args) {
        zepto1 os=new onlineShopping();
        os.demo("Milk",50);
        instaMart.demo1("Biryani",400);
    }
}
