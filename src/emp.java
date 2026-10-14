class employee{
    String emp_name="Asha";
    int emp_id=2026123;
    double emp_salary=500000;
}
class department{
    int dep_id=12345;
    String dep_name="Java";
}
public class emp {
    public static void main(String[] args) {
        employee e1=new employee();
        department d1=new department();
        System.out.println("Employee Name:"+e1.emp_name);
        System.out.println("Employee id:"+e1.emp_id);
        System.out.println("Employee salary:"+e1.emp_salary);
        System.out.println("Department name:"+d1.dep_name);
        System.out.println("Department id:"+d1.dep_id);

    }
}
