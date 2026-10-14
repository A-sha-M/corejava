public class break_continue {
    public static void main(String[] args) {
        int i=0;
        while(i<5){
            i++;
            if(i==3){
                System.out.println("A");
                //break;
                continue;
            }
            System.out.println(i);
        }
    }
}
