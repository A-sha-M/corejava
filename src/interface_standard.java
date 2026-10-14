interface Animal1{
    default void demo()
    {

        System.out.println("Default method");
    }
    static void demo1(){

        System.out.println("Static method");
    }
}
class Cat implements Animal1{

}
public class interface_standard {
    public static void main(String[] args) {
        Animal1 obj1=new Cat();
        obj1.demo();
        Animal1.demo1();
    }
}
