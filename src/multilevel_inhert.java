class Animal{
    String type;
    String name;
    Animal(String type,String name){
        this.type=type;
        this.name=name;
    }
    void adetails(){
        System.out.println("Animal details: "+type+" "+name);
    }
}
class dog extends Animal{
    String breed;
    dog(String type,String name,String breed){
        super(type,name);
        this.breed=breed;
    }
    void d_details(){
        System.out.println("Dog details are: "+type+" "+name+" "+breed);
    }
}
class Puppy extends dog{
    String color;
    Puppy(String type,String name,String breed,String color){
        super(type, name, breed);
        this.color=color;
    }
    void p_details(){
        System.out.println("Puppy details are: "+type+" "+name+" "+breed+" "+color);
    }
}

public class multilevel_inhert {
    public static void main(String[] args) {
        Animal a1=new Animal("dog","charli");
        a1.adetails();
        dog d1=new dog("car","ABC","lab");
        d1.d_details();
        Puppy p1=new Puppy("abc","zyx","mno","black");
        p1.p_details();
    }
}
