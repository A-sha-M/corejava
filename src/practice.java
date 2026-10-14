import java.util.Arrays;
import java.util.List;

public class practice {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2,3,4,5,6,7,8);
        int r=l1.stream().filter(i->i%2==0).map(i->i*2).reduce(0,( i,  j)-> i+j);
        //s1.forEach(System.out::println);
        System.out.println(r);
    }
}