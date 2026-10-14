class person{
    String name="Asha";
    int age=20;
}
class dog1{
    String name="Jai";
    String color="White";
}
public class class_object {
    public static void main(String[] args) {
        person p1=new person();
        person p2=new person();
        dog1 d1=new dog1();
        System.out.println("Person Name:"+p1.name);
        System.out.println("Age:"+p2.age);
        System.out.println("Dog name:"+d1.name);
        System.out.println("color:"+d1.color);
    }
}
