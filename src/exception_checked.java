import java.io.FileNotFoundException;
import java.io.FileReader;

public class exception_checked {
    public static void main(String[] args) /*throws Exception*/ {
        // Exception obj1=new Exception  //normal stmt-no issues
        //FileReader obj=new FileReader("demo.txt");
        try
        {
                FileReader obj=new FileReader("demo.txt");   //FileReader is an inbuilt class //critical stmt-handle carefully  // handle using try-catch or throws(keyword) method

        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found "+e);
        }
        catch (Exception e)
        {
            System.out.println("Developer "+e);
        }
    }
}
