class car{
    String name;
    String color;
    String regno;
    car(String name,String color,String regno){
        this.name=name;
        this.color=color;
        this.regno=regno;
    }
    void display(){
        System.out.println("The car is "+name+" color "+color+" and the reg no is "+regno);
    }
}
public class constructor {
    public static void main(String[] args) {
        car c1=new car("Nexon","White","KA51AH3378");
        c1.display();
    }
}
