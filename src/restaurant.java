class res{
    String r_name;
    String category;
    String dish_name;
    double price;
    String p_mode;
    String address;
    int quantity;
    double total_price;
    res(String r_name,String category,String dish_name,double price,String p_mode,String address,int quantity){
        this.r_name=r_name;
        this.category=category;
        this.dish_name=dish_name;
        this.price=price;
        this.p_mode=p_mode;
        this.address=address;
        this.quantity=quantity;
    }
    void display(){
        System.out.println("The restaurant details are:");
        System.out.println("Restaurant name: "+r_name+" \nCategory: "+category+" \nDish name: "+dish_name+" \nPrice: "+price+" \nPayment mode: "+p_mode+" \nAddress: "+address+" \nQuantity: "+quantity);
    }
    void totalprice(){
        total_price=price*quantity;
        System.out.println("The total price is:"+total_price);
    }
    void discount(){
         if(total_price>=1000){
             double discount=total_price-(total_price*0.10);
             System.out.println("After the discount the total price is:"+discount);
         }
         else{
             System.out.println("There is no discount, try for next time");
         }
    }
}

public class restaurant {
    public static void main(String[] args) {
        res r1=new res("SLV restaurant","Veg","Dose",200,"phone pay","Anekal",2);
        res r2=new res("Vishnu restaurant","Non-veg","Biryani",400,"phone pay","E-city",3);
        r1.display();
        r1.totalprice();
        r1.discount();
        System.out.println();
        r2.display();
        r2.totalprice();
        r2.discount();
    }
}
