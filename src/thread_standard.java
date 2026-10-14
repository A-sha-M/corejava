//class

class customer1 extends Thread
{
    String cname;
    String c_address;
    customer1 (String cname,String c_address)
    {
        this.cname=cname;
        this.c_address=c_address;
    }
    public void run()
    {
        try {
            sleep(5000);
            System.out.println(cname + " your order is confirmed and we will deliver in this address " + c_address);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class order extends Thread
{
    String o_id;
    String item;
    double price;
    order(String o_id,String item,double price)
    {
        this.o_id=o_id;
        this.item=item;
        this.price=price;
    }
    public void run()
    {
        try {
            sleep(10000);
            System.out.println("This is your order id: " + o_id + " item: " + item + " price: " + price);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
class delivery_person extends Thread
{
    String dperson;
    long ph_num;
    delivery_person(String dperson,long ph_num)
    {
        this.dperson=dperson;
        this.ph_num=ph_num;
    }
    public void run()
    {
        try{
            sleep(15000);
            System.out.println("Your order is on the way");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}

public class thread_standard {
    public static void main(String[] args) {
        customer1 c1=new customer1("Ajay","hebal");
        customer1 c2=new customer1("Vijay","anekal");
        c1.start();
        c2.start();
        order o1=new order("ABC123","Biryani",250);
        order o2=new order("Z12Y34","Pizza",400);
        o1.start();
        o2.start();
        delivery_person d1=new delivery_person("Ram",1234567890);
        delivery_person d2=new delivery_person("Shyam",879219506);
        d1.start();
        d2.start();
    }
}
