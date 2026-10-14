import java.util.Arrays;
import java.util.List;
//Noraml Class using consumer
/*
class demo implements Consumer<Integer>     //consumer is functional interface
{
    public void accept(Integer i)
    {
        System.out.println(i);
    }
}
public class java8_246 {
    public static void main(String[] args) {
    Consumer<Integer> obj=new demo();
            obj.accept(1);

    }
}
*/
//Anonymous class
/*
public class java8_246 {
    public static void main(String[] args) {
        Consumer<Integer> obj=new Consumer<Integer >() {
            @Override
            public void accept(Integer i) {
               System.out.println(i);
            }
        };
        obj.accept(1);

    }
}
*/


public class java8_246 {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2,3,4,5,6,7);
        //System.out.println(l1);  //Normal expression
        //for(int i=0;i<l1.size();i++)   //Normal for loop
        //{
        //    System.out.println(l1.get(i));
        //}
        //for(Integer i:l1)  //Normal enhanced for loop
        //{
        //    System.out.println(i);
        //}
        l1.forEach(i->System.out.println(i));
    }
}
