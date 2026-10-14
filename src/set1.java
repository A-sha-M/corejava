import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
public class set1 {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>();
        s1.add(10);
        s1.add(5);
        s1.add(20);
        s1.add(12);
        System.out.println(s1);
        s1.add(5);
        System.out.println(s1);
        System.out.println(s1.equals(5));
        System.out.println(s1.isEmpty());
        s1.remove(10);
        System.out.println(s1);
        System.out.println(s1.contains(12));
    }
}


 */
public class set1 {
    public static void main(String[] args) {
        Set<Integer> s1 = new TreeSet<>();
        Set<Integer> s2 = new TreeSet<>();
        s1.add(10);
        s1.add(5);
        s1.add(20);
        s1.add(12);
        s2.add(20);
        s2.add(3);
        System.out.println("Set 1: "+s1);
        System.out.println("Set 2: "+s2);
        s1.remove(5);
        System.out.println("After removing, the set 1: "+s1);
        System.out.println(s1.size());
        System.out.println(s1.equals(10));
        System.out.println(s1.equals(s2));
    }
}
