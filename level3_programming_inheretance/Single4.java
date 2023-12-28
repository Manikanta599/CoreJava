import java.util.Scanner;
class A 
{
    public int i;
    public int j;
    public A(int i,int j)
    {
        if(i>0 && j>0)
        {
            this.i=i;
            this.j=j;
        }
    }
}

class B extends A
{
    public B()
    {
        super(0,0);
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        super.i=a;
        super.j=b;

    }

    public void add()
    {
        System.out.println(i+j);
    }
    
}

/**
 * Single4
 */
public class Single4 {

    public static void main(String[] args) {
        B b1=new B();
        b1.add();
    }
}