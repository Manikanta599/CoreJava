class SuperMost
{
    public int i=99;

    public void smMethod()
    {
        System.out.println("super most i "+i);
    }


}

class SuperClass extends SuperMost
{
    public void sMethod()
    {
        smMethod();
    }
}

/**
 * MultilevelMain
 */
class SubClass extends SuperClass
{
    public void subMehod()
    {
        sMethod();
    }
}

/**
 * MultilevelMain
 */
class MultilevelMain {
   public static void main(String[] args) {
    SubClass s=new SubClass();
    s.subMehod();
   }

    
}