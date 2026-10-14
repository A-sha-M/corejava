//NORMAL CLASS
/*interface as{
    int add(int a,int b);
}
class ha implements as
{
    public int add(int a,int b)
    {
        return a+b;
    }
}
public class asha {
    public static void main(String[] args) {
        ha a=new ha();
        System.out.println(a.add(12,14));
    }
}
*/

//ANONYMOUS CLASS
/*interface as{
    int add(int a,int b);
}

public class asha {
    public static void main(String[] args) {
        as a=new as()
        {
            public int add(int a,int b)
            {
                return a+b;
            }
        };
        System.out.println(a.add(7,4));
    }
}
*/

//LAMBDA
interface as{
    int add(int a,int b);
}

public class asha {
    public static void main(String[] args) {
        as as=(int a,int b)->a+b;
        System.out.println(as.add(20,22));
    }
}