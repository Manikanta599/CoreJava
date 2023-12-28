class Methods
{
    public static int max(int a,int b)
    {
        return a>b?a:b;
    }

    public double max(double a,double b)
    {
        return a>b?a:b;
    }
    public static int max(int a,int b,int c)
    {
        return a>b&&a>c?a:b>c?b:c;
    }
}

/**
 * Mat
 */
public class Mat {

    public static void main(String[] args)
    {
        System.out.println(Methods.max(9,2));
        Methods m=new Methods();
       System.out.println( m.max(3.4,9.9));
        System.out.println(Methods.max(1,3,9));
    }
}