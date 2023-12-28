class A
{
    public int i=10;

}
class B extends A
{
    public int j=20;
    public void display()
    {
       
        System.out.println("super class variable i "+i);
    }
}

/**
 * SingleInheretance
 */
class SingleInheretance {

    public static void main(String[] args)
    {
        B b1=new B();
        b1.display();

    }

    
}