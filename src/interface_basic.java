 interface animal{
    void demo();
 }
 interface birds{
    public void bird();
 }
class Dog implements animal,birds
{
    @Override
    public void demo() {
        System.out.println("The dog");
    }
    public void bird(){
        System.out.println("The birds");
    }
}
public class interface_basic {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.demo();
        d1.bird();
    }

}
