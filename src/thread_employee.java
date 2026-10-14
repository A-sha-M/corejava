import jdk.jfr.Experimental;

class employee1 extends Thread
{
    String e_name;
    String qualification;
    int poy;
    employee1(String e_name,String qualification,int poy)
    {
        this.e_name=e_name;
        this.qualification=qualification;
        this.poy=poy;
    }
    public void run()
    {
        try {
            sleep(5000);
            System.out.println("The employee name "+e_name+" qualification "+qualification+" and pass out year "+poy);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class application extends Thread
{
    String role;
    String resume;
    String location;
    String CTC;
    application(String role,String resume,String location,String CTC)
    {
        this.role=role;
        this.resume=resume;
        this.location=location;
        this.CTC=CTC;
    }
    public void run()
    {
        try {
            sleep(6000);
            System.out.println("Role is "+role+" located in "+location+" and CTC is "+CTC);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class company extends Thread
{
    String co_name;
    String job_type;
    String bond;
    company(String co_name,String job_type,String bond)
    {
        this.co_name=co_name;
        this.job_type=job_type;
        this.bond=bond;
    }
    public void run()
    {
        try {
            sleep(8000);
            System.out.println("The company name is "+co_name+" job type "+job_type+" and the bond will be "+bond);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

public class thread_employee {
    public static void main(String[] args) {
        employee1 e1=new employee1("Ramu","BE",2025);
        employee1 e2=new employee1("Raju","MCA",2026);
        e1.start();
        e2.start();
        application a1=new application("Java developer","Ok","Bangalore","5 LPA");
        application a2=new application("Java Debugger","Ok","Mumbai","6 LPA");
        a1.start();
        a2.start();
        company c1=new company("TCS","Full-Time","2 years");
        company c2=new company("Infosys","Remote","3 years");
        c1.start();
        c2.start();
    }
}
