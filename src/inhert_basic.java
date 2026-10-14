class parent{
    void par(){
        System.out.println("Parent class");
    }
}
class child extends parent{
    void chi(){
        System.out.println("Child class");
    }

}
public class inhert_basic {
    public static void main(String[] args) {
        parent p1=new parent();
        child c1=new child();
        //p1.par();
        c1.chi();
        c1.par();
    }
}
