class java{
    public void greet(){   //method declaration
        System.out.println("Hello developer");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
public class method_call {
    public static void main(String[] args) {
        java obj1=new java();   // method call
        obj1.greet();
        obj1.add(5,5);
    }

}
