class Details
{
    private double height;
    private char in;
    private int age;
    private String name;
    
    public Details(double d)
    {
        height=d;
        System.out.println(height);
    }
    
    public Details(char n,int a)
    {
        in=n;
        age=n;
        System.out.println("initial "+in+"\nage "+age);
    }

    public Details(String s)
    {
        name=s;
        System.out.println(name);
    }
}
/**
 * ConstMain3
 */
class ConstOverLoading {

    public static void main(String[] args) {
        
        Details d1=new Details(6.1);
        Details d2=new Details('m',22);
        Details d3=new Details("siva");
        Details d4=new Details(6.1);
        Details d5=new Details('m',22);
        Details d6=new Details("siva");
    }
}