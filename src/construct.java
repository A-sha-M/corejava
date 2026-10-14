class rental{
    String c_name;
    String proof;
    int days;
    double price_per_day;
    double totalprice;
    rental(String c_name,String proof,int days,double price_per_day){
        this.c_name=c_name;
        this.proof=proof;
        this.days=days;
        this.price_per_day=price_per_day;
    }
    void display(){
        System.out.println("Customer name is "+c_name+" and proof is  "+proof);
        System.out.println("The total days are "+days+" and the price per day is "+price_per_day);
    }
    void total_price(){
        totalprice=days*price_per_day;
        System.out.println("The total cost for "+days+" days is "+(days*price_per_day));
        if (days>=5){
            double result=totalprice-(totalprice*0.10);
            System.out.println("After discount the total price is "+result);
        }
        else{
            System.out.println("Total price is the final price");
        }
    }
}

public class construct {
    public static void main(String[] args) {
        rental r1=new rental("Asha","Pan card",7,500);
        rental r2=new rental("Krishna","Aadhaar card",3,500);
        r1.display();
        r1.total_price();
        System.out.println();
        r2.display();
        r2.total_price();
    }
}
