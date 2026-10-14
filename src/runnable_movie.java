
class customer implements Runnable
{
    String name;
    int age;
    customer(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void run()
    {
        try {
            System.out.println("The customer name is "+name+" age "+age);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class theater implements Runnable
{
    String t_name;
    String location;
    String t_type;
    theater(String t_name,String location,String t_type)
    {
        this.t_name=t_name;
        this.location=location;
        this.t_type=t_type;
    }
    public void run()
    {
        try {
            System.out.println("The theater name is "+t_name+" location "+location+" and the type of theater is "+t_type);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class movie implements Runnable
{
    String m_name;
    String language;
    int duration;
    double price;
    movie(String m_name,String language,int duration,double price)
    {
        this.m_name=m_name;
        this.language=language;
        this.duration=duration;
        this.price=price;
    }
    public void run()
    {
        try {
            System.out.println("The movie name "+m_name+","+language+" language, duration is "+duration+" hours and the ticket cost is "+price);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
class snacks implements Runnable
{
    String s_name;
    int quantity;
    double s_price;
    snacks(String s_name,int quantity,double s_price)
    {
        this.s_name=s_name;
        this.quantity=quantity;
        this.s_price=s_price;
    }
    public void run()
    {
        try {
            System.out.println("The Snacks details are-> name: "+s_name+" quantity: "+quantity+" price: "+s_price);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}

public class runnable_movie {
    public static void main(String[] args) {
        customer c1=new customer("Ajay",23);
        Thread obj1=new Thread(c1);
        obj1.start();
        theater t1=new theater("ABC","Hebbal","AC");
        Thread obj2=new Thread(t1);
        obj2.start();
        movie m1=new movie("KGF","Kannada",5,500);
        Thread obj3=new Thread(m1);
        obj3.start();
        snacks s1=new snacks("Popcorn",3,200);
        Thread obj4=new Thread(s1);
        obj4.start();
    }
}
