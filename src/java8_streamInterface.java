import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
//Normal
/*
class demo1 implements Predicate<Integer>
{

    @Override
    public boolean test(Integer i) {
        return i%2==0;
    }
}
public class java8_streamInterface {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2,3,4,5,6,7);
        Predicate<Integer> p=new demo1();
        Stream s1=l1.stream().filter(p); //only once we can use. Not more than once
        s1.forEach(System.out::println);
    }
}
*/

//Anonymous
/*
public class java8_streamInterface {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2,3,4,5,6,7);
        Predicate<Integer> p=new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i % 2 == 0;
            }
            }    ;
        Stream s1=l1.stream().filter(p); //only once we can use. Not more than once
        s1.forEach(System.out::println);
    }
}
*/

//lambda
public class java8_streamInterface {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2,3,4,5,6,7);
        int r=l1.stream().filter(i->i%2==0).map(i->i*2).reduce(0,( i,  j)-> i+j); //only once we can use. Not more than once
        //s1.forEach(System.out::println);
        System.out.println(r);
    }
}