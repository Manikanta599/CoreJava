class SmostClass
{
    public void add()
    {
        System.out.println("addition...");
    }
    public void subtraction()
    {
        System.out.println("subtraction..");
    }
}

class Sclass extends SmostClass

{
    public void mul()
    {
        System.out.println("multiplication..");
    }
}
class SubClass extends Sclass
{
    public void subtraction()
    {
        System.out.println("subtraction overrided..");
    }
     public void mul()
    {
        System.out.println("multiplication overrided ..");
    }

    public void call()
    {
        System.out.println("call method..");
        subtraction();
        mul();
        add();
        
    }

}

/**
 * MainClass1
 */
class MainClass1 {

    public static void main(String[] args)
    {
        SubClass s1=new SubClass();
        s1.call();
    }

    
}