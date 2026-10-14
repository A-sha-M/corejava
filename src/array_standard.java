/*public class array_standard {
    public static void main(String[] args) {
        int arr[]=new int[5];

    }
}
*/

import java.util.Scanner;

public class array_standard {
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
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}