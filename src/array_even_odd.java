/*
public class array_even_odd {
    public static void main(String[] args) {
        int num[]={9,1,4,8,7,7,2,0};
        int e_count=0;
        int o_count=0;
        for (int i=0;i<num.length;i++){
            int even=num[i];
            if (even%2==0){
                e_count+=1;
            }
            else {
                o_count+=1;
            }
        }
        System.out.println("Count of Even numbers: "+e_count);
        System.out.println("Count of Even numbers: "+o_count);
    }
}
*/

//enhanced for loop

import java.util.Scanner;

public class array_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n]; //empty array will created
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int even=0;
        int odd=0;
        for(int i:arr)
        {
            if(i%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Even count: "+even);
        System.out.println("Odd count:"+odd);
    }
}
