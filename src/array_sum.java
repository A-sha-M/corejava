public class array_sum {
    public static void main(String[] args) {
        int num[]={8,7,9,2,1};
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        System.out.println("Sum of array elements: "+sum);
        int avg=sum/num.length;
        System.out.println("Avg is: "+avg);
    }
}
