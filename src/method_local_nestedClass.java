class outer_class{
    void demo(){
        class inner_class{
            void demo1(){
                System.out.println("Inner class");
            }
        }
        inner_class i=new inner_class();
        i.demo1();
    }
}

public class method_local_nestedClass {
    public static void main(String[] args) {
        outer_class o=new outer_class();
        o.demo();
    }
}
