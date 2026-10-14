interface anony{
    void demo();
}

public class anonymousIC {
    public static void main(String[] args) {
        anony a=new anony()
        {
            public void demo()
            {
                System.out.println("Anonymous Inner Class");
            }
        };
        a.demo();
    }
}
