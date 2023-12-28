class C 
{
    public int i=10;
}
class D extends C
{
    public int j=20;
    i=30;
    public void display()
    {
        System.out.println("super class var i "+i);
        System.out.println("sub class var j "+j);
    }
}
class E extends D
{
    public int k=30;
    public void print()
    {
        System.out.println("super most var i "+i);
        System.out.println("sub class var k "+k);
    }
}

/**
 * MultiLevelInheretance
 */
class MultiLevelInheretance {

    public static void main(String[] args) {
        E e1=new E();
        e1.print();
        e1.display();
    }

   
    
    


    
}