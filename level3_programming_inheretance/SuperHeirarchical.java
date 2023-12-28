class SuperClass
{
    public SuperClass(String a)
    {
        System.out.println("a "+a);
    }
    public SuperClass()
    {
        System.out.println("super with out args");
    }
}

class Sub1 extends SuperClass
{
    public Sub1(int i)
    {
        super("hello");
        System.out.println("sub1 arg "+i);
    }
    
}

class Sub2 extends SuperClass{
    public Sub2(double d)
    {
        //super();
        System.out.println(" sub2 double arg"+d);
    }
}

/**
 * SuperHeirarchical
 */
class SuperHeirarchical {

    public static void main(String[] args) {
        Sub1 s1=new Sub1(99);
        Sub2 s2=new Sub2(9.8);
    }

    
}
