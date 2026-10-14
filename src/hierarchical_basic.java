class A{
    void a_display(){
        System.out.println("Parent class");
    }
}
class B extends A{
    void b_display(){
        System.out.println("First child class");
    }
}
class C extends A{
    void c_display(){
        System.out.println("Second child class");
    }
}
public class hierarchical_basic {
    public static void main(String[] args) {
        A o1=new A();
        o1.a_display();
        B o2=new B();
        o2.b_display();
        C o3=new C();
        o3.c_display();
        o2.a_display();
        o3.a_display();
    }
}
