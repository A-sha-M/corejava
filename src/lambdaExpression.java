interface lambda{
    void demo();
}

public class lambdaExpression {
    public static void main(String[] args) {
        lambda l= ()-> System.out.println("Lambda Expression");
        l.demo();
    }
}
