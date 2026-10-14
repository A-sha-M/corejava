import java.util.Scanner;
public class arr_reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int s=sc.nextInt();
        int arr1[]=new int[s];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Reversed array");
        for(int i=arr1.length-1;i>=0;i--)
        {
            System.out.print(arr1[i]+" ");
        }

    }
}
