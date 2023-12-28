class SuperMost
{
    public SuperMost(char c)
    {
        System.out.println("char arg "+c);
    }
}
class SuperClass extends SuperMost
{
    public SuperClass()
    {
        super('m');
        System.out.println("super class with out args");
    }
}

class SubClass extends SuperClass
{
    public SubClass(boolean b)
    {
        
        System.out.println("subclass boolean arg"+b);
    }
}

/**
 * SuperMultilevel
 */
class SuperMultilevel {

    public static void main(String[] args) {
        SubClass s=new SubClass(true);
        
    }

    
}