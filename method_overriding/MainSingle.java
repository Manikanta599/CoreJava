class S 
{
    public void operation(int a,int b)
    {
        System.out.println("addition "+(a+b));
    }
}

class Sub extends S
{
    public void operation(double a,double b)
    {
        System.out.println("addition "+(a+b));
    }
    public void operation(int a,int b)
    {
        System.out.println("multiplication "+(a*b));
    }

    public void call()
    {
        operation(4, 5);
        operation(3.4, 5.9);

    }
}

/**
 * MainSingle
 */
public class MainSingle {

    public static void main(String[] args) {

        Sub s1=new Sub();
        s1.call();
        
     }
}