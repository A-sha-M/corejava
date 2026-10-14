class corejava{
    public void greet(){   //method declaration
        System.out.println("Hello developer");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public int sub(int a,int b){
        return a-b;
    }
}
public class return_stmt {
    public static void main(String[] args) {
        corejava obj1=new corejava();   // method call
        obj1.greet();
        obj1.add(5,5);
        System.out.println(obj1.sub(7,4));
    }

}
