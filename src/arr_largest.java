import java.util.Scanner;

public class arr_largest {
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

        //Largest number
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Largest element is:"+max);


        //Second largest number
        int lar=arr[0];
        int s_lar=arr[0];
        for (int i=2;i<arr.length;i++)
        {
            if(arr[i]>lar)
            {
                s_lar=lar;
                lar=arr[i];
            }
        }
        System.out.println("Second largest element is:"+s_lar);


        //Smallest number
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
