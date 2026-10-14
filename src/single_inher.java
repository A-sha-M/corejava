class vehicle{
    String fuel_type;
    int noOfSeats;

    vehicle(String fuel_type,int noOfSeats){
        this.fuel_type=fuel_type;
        this.noOfSeats=noOfSeats;
    }
    void vdetails(){
        System.out.println("Vehicle details are: "+fuel_type+" "+noOfSeats);
    }
}
class Car extends vehicle{
    String model_name;
    String color;
    double price;
    Car(String fuel_type,int noOfSeats,String model_name,String color,double price){
        super(fuel_type,noOfSeats);
        this.model_name=model_name;
        this.color=color;
        this.price=price;
    }
    void cdeatils(){
        System.out.println("The car details are: "+fuel_type+" "+noOfSeats+" "+model_name+" "+" "+color+" "+" "+price);
    }
}
public class single_inher {
    public static void main(String[] args) {
        vehicle v1=new vehicle("petrol",5);
        //v1.vdetails();
        Car c1=new Car("Cng",6,"ABC","Black",123986);
        c1.cdeatils();
        v1.vdetails();
    }
}
