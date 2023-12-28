class Emp
{
    private int emp_Id;
    private String emp_Name;
    private double emp_Sal;
    private double emp_exp;
    private double ret_Age;

    public Emp(int emp_Id,String emp_Name,double emp_Sal)
    {

        if(emp_Id>=100 && emp_Id<=300)
        {
            this.emp_Id=emp_Id;
        }
        else
        {
            System.out.println("invalid empid");
        }
        int c=0;
        for(int i=0;i<=emp_Name.length()-1;i++)
        {
            char ch=emp_Name.charAt(i);
            if(Character.isAlphabetic(ch))
            {
                c++;
            }
        }
        if(c==emp_Name.length())
        {
            this.emp_Name=emp_Name;
        }
        else
        {
            System.out.println("invalid name");
        }

        if(emp_Sal<=1.8 && emp_Sal>=7.6)
        {
            this.emp_Sal=emp_Sal;
        }
        else
        {
            System.out.println("invalid salary");
        }
        
    }
    public Emp(int emp_Id,String emp_Name,double emp_Sal,double emp_exp,double ret_Age)
    {
        this.ret_Age=ret_Age;

        if(emp_Id>=100 && emp_Id<=300)
        {
            this.emp_Id=emp_Id;
        }
        else
        {
            System.out.println("invalid empid");
        }
        if(emp_Sal<=1.8 && emp_Sal>=7.6)
        {
            this.emp_Sal=emp_Sal;
        }
        else
        {
            System.out.println("invalid salary");
        }

        int c=0;
        for(int i=0;i<=emp_Name.length()-1;i++)
        {
            char ch=emp_Name.charAt(i);
            if(Character.isAlphabetic(ch))
            {
                c++;
            }
        }
        if(c==emp_Name.length())
        {
            this.emp_Name=emp_Name;
        }
        else
        {
            System.out.println("invalid name");
        }
        if(emp_exp>=1)
        {
            this.emp_exp=emp_exp;
        }
        else
        {
            System.out.println("invalid exp");
        }
    }
    public void display()
    {
        System.out.println("emp_id "+emp_Id);
        System.out.println("emp_sal "+emp_Sal);
        System.out.println("emp name "+emp_Name);
        if(emp_exp!=0)
        {
        System.out.println("emp exp "+emp_exp);
        }
        if(ret_Age>=45.5)
        {
            System.out.println("retaired age ");
        }
    }

    public void cal_Sal()
    {
        double monthly_sal=emp_Sal/12;
        System.out.println("Monthly sal "+monthly_sal);
    }
}

/**
 * EmpMain
 */
class EmpMain {

    public static void main(String[] args) {

        Emp emp1=new Emp(101,"siva",3.5);
        emp1.display();
        emp1.cal_Sal();
        System.out.println("-------------------------------------------------");
        Emp emp2=new Emp(103,"sai",6.5,7.5,45.5);
        emp2.display();
        emp2.cal_Sal();
        
    }

    
}