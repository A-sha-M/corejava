import java.util.ArrayList;
import java.util.List;

public class list_colle {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();   //empty array list
        l1.add(10);
        l1.add(40);
        l1.add(30);
        System.out.println(l1);
        l1.add(1,50);
        System.out.println(l1);
        l1.addFirst(100);
        System.out.println(l1);
        l1.addLast(20);
        System.out.println(l1);
        l1.remove(1);
        System.out.println(l1);
        l1.removeLast();
        System.out.println(l1);
        l1.removeFirst();
        System.out.println(l1);
        System.out.println(l1.get(1));
        System.out.println(l1.size());
        l1.set(1,100);
        System.out.println(l1);
        System.out.println(l1.contains(100));
        System.out.println(l1.reversed());
        System.out.println(l1.isEmpty());
        //System.out.println(l1.toArray());
    }
}
