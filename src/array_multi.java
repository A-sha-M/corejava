import java.util.Scanner;
public class array_multi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and columns:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] array1=new int[r][c];
        int[][] array2=new int[r][c];
        int[][] array3=new int[r][c];
        System.out.println("Enter the elements of array 1:");
        for (int i=0;i< r;i++)
        {
            for(int j=0;j<c;j++)
            {
                array1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of array 2:");
        for (int i=0;i< r;i++)
        {
            for(int j=0;j<c;j++)
            {
                array2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Multiplication of 2 matrix:");
        for (int i=0;i< r;i++)
        {
            for(int j=0;j<c;j++)
            {
                array3[i][j]=array1[i][j]*array2[i][j];
                System.out.print(" "+array3[i][j]);
            }
            System.out.println(" ");
        }
    }
}
