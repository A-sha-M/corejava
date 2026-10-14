public class exception_unchecked {
    public static void main(String[] args) {
        int a=8;
        int b=2;
        try
        {
            int c=a/b;
            System.out.println(c);
        }
        catch (Exception e)
        {
            System.out.println("Denominator number should not be zero "+e);
        }
        finally //optional
        {
            System.out.println("The code is executed successfully");
        }
    }
}
