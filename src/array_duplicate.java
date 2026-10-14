import java.util.Scanner;

public class array_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n]; //empty array will created
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    count++;
                    System.out.println("Repeated element is: "+arr[i]);
                }
            }
        }
        System.out.println("Number of Duplicates count:"+count);
    }
}
