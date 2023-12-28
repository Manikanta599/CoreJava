class Ex
{
    public Ex(char c)
    {
        System.out.println("constructor with char arg "+c);
    }
    public Ex(int n)
    {
        System.out.println("constructor with int arg "+n);
    }

    public Ex(double a,double b)
    {
        this(99);
        this('m');
        
        System.out.println("constructor with 2 double  args "+a+"  "+b);
    }
}

/**
 * ConstCalling3                                        
 */
class ConstCalling3 {
    public static void main(String[] args) {
        Ex e1=new Ex(3.2,4.5);
    }

    
}