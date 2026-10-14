interface notifi{
    void message(String message);
}
class SMS implements notifi
{
    public void message(String message)
    {
        System.out.println("The otp is: "+message);
    }
}
class Whatsapp implements notifi
{
    public void message(String message)
    {
        System.out.println("Give the feedback: "+message);
    }
}
class Gmail implements notifi
{
    public void message(String message)
    {
        System.out.println("Your transaction is done "+message);
    }
}
public class notification {
    public static void main(String[] args) {
        SMS s=new SMS();
        s.message("8792");
        Whatsapp w=new Whatsapp();
        w.message("Good");
        Gmail g=new Gmail();
        g.message("50000");
    }
}
