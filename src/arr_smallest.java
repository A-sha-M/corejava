import java.util.Scanner;

public class arr_smallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n]; //empty array will created
        System.out.println("Enter the array elements: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if (arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Smallest element is:"+min);
    }
}
