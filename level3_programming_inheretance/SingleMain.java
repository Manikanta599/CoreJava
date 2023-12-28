class SuperClass
{
    public SuperClass(int a,int b)
    {
        System.out.println("addition "+(a+b));
    }
}

class SubClass extends SuperClass
{
    public SubClass()
    {
        super(4, 5);
        System.out.println("subclass constructor");
    }
}

/**
 * SingleMain
 */
class SingleMain {

    public static void main(String[] args) {
        
        SubClass s=new SubClass();
        
    }

    

}