class bus{
    String p_name;
    String gender;
    String source;
    String destination;
    int days;
    String date;
    double price;
    bus(String p_name,String gender,String source,String destination,int days,String date,double price){
        this.p_name=p_name;
        this.gender=gender;
        this.source=source;
        this.destination=destination;
        this.days=days;
        this.date=date;
        this.price=price;
    }
    void display(){
        System.out.println("The passenger details:");
        System.out.println("Name: "+p_name+" Gender: "+gender+" Source: "+source+" Destination: "+destination+" total days: "+days+" Start date: "+date+" Price: "+price);
    }
    void offer(){
        if(days>=5){
            if (gender=="Female"){
                System.out.println("The price after discount: "+(price-(price*0.10)));
            }
            else{
                System.out.println("No discount");
            }
        }
        else{
            System.out.println("Visit next time");
        }
    }
}
public class busbooking {
    public static void main(String[] args) {
        bus b1=new bus("Asha","Female","Bangalore","AP",6,"22/july/2026",3000);
        bus b2=new bus("Krishna","Male","AP","TN",2,"12/august/2026",4000);
        b1.display();
        b1.offer();
        System.out.println();
        b2.display();
        b2.offer();
    }
}
