class SuperClass
{
    public void sMethod()
    {
        System.out.println("super class");
    }
}

class Sub1 extends SuperClass
{
    public int i=99;
    public void subMehod()
    {
        System.out.println("sub1 var"+i);
        sMethod();

    }
}

class Sub2 extends SuperClass
{
    public void s2Method1()
    {
        System.out.println("sub2 method1");
    }
    public void s2Method2()
    {
        System.out.println("sub2 method2..");
        s2Method1();
        sMethod();

    }
}

/**
 * HeirarchicalMain
 */
class HeirarchicalMain {

    public static void main(String[] args) {
        Sub1 s1=new Sub1();
        s1.subMehod();
        Sub2 s2=new Sub2();   
        s2.s2Method2();


    }

    
}