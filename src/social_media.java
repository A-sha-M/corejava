interface social{
    void user(String name,String password);
}
class gmail1 implements social
{

    @Override
    public void user(String name, String password) {
        System.out.println("The user name is "+name+" password "+password);
    }

}
class snapChat implements social
{
    public void user(String name, String password)
    {
        System.out.println("The user name is "+name+" password "+password);
    }
}
class faceBook implements social
{
    public void user(String name, String password)
    {
        System.out.println("The user name is "+name+" password "+password);
    }
}
public class social_media {
    public static void main(String[] args) {
        gmail1 g=new gmail1();
        g.user("ASHA","ABC123");
        snapChat s=new snapChat();
        s.user("Krishna","118RK");
        faceBook f=new faceBook();
        f.user("Radha","XYZ");
    }
}
