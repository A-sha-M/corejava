class payment{
    String IFSC;
    String bankName;
    payment(String IFSC,String bankName){
        this.IFSC=IFSC;
        this.bankName=bankName;
    }
    void p_display(){
        System.out.println("The payment details: "+IFSC+" "+bankName);
    }
}
class UPI extends payment{
    String id;
    String appName;
    UPI(String IFSC,String bankName,String id,String appName){
        super(IFSC,bankName);
        this.id=id;
        this.appName=appName;
    }
    void u_display(){
        System.out.println("The UPI details: "+IFSC+" "+bankName+" "+id+" "+appName);
    }
}
class card extends payment{
    String card_no;
    card(String IFSC,String bankName,String card_no){
        super(IFSC,bankName);
        this.card_no=card_no;
    }
    void c_details(){
        System.out.println("The card details: "+IFSC+" "+bankName+" "+card_no);
    }
}
public class hierarchical_inhe {
    public static void main(String[] args) {
        payment p1=new payment("123ABC","Canara Bank");
        p1.p_display();
        UPI u1=new UPI("456ZYX","Bank of India","0987Z","Phone Pay");
        u1.u_display();
        card c1=new card("879ASH","RBI","HXZ990");
        c1.c_details();
    }
}
