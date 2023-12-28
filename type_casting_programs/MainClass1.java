class SuperClass
{
    public void met()
    {
        System.out.println("super class method");
    }
}

class Sub1 extends SuperClass
{
    public void s1Method()
    {
        System.out.println("sub class1 method");
    }
}

class Sub2 extends SuperClass
{
    public void s2Method()
    {
        System.out.println("sub class2 method");
    }
}

/**
 * MainClass1
 */
class MainClass1 {

    public static void main(String[] args) {
   SuperClass s1=(SuperClass) new Sub1();
   s1.met();
   Sub1 d1=(Sub1) s1;
   d1.s1Method();
   SuperClass s2=(SuperClass) new Sub2();
   s2.met();
   Sub2 d2=(Sub2) s2;
   d2.s2Method();
   
   
    
    }

    
}