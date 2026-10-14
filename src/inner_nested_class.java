class A1{
    private class B1{
        void demo(){
            System.out.println("Inner class data");
        }
    }
    void demo2(){
        B1 b=new B1();
        b.demo();
        System.out.println("Outer class data");
    }
}

public class inner_nested_class {
    public static void main(String[] args) {
        A1 a=new A1();
        a.demo2();
    }
}
