import java.util.Stack;

public class stack_methods {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.add(40);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.search(20));
        s.addFirst(100);
        System.out.println(s);
        s.addLast(200);
        System.out.println(s);
        System.out.println(s.capacity());
        System.out.println(s.get(4));
        System.out.println(s.contains(10));
        System.out.println(s.isEmpty());
    }
}
