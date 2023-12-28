class F
{
    public int i=10;
}

class G extends F
{
    public int j=20;
    

    public void display()
    {
        System.out.println("super class var i "+i);
        System.out.println("sub class var j "+j);

    }
}

class H extends F
{
    public int k=30;
    public void print()
    {
        System.out.println("super class var i "+i);
        System.out.println("sub class var k "+k);

    }

}

/**
 * HeirarchicalInheretance
 */
class HeirarchicalInheretance {
    public static void main(String[] args) {
        G g1=new G();
        g1.display();
        H h1=new H();
        h1.print();
    }

    
}