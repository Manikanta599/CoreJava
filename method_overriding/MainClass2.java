class SuperClass
{
    public void operation()
    {
        System.out.println("arithmatic operations");
    }
}

class S1 extends SuperClass
{
    public void operation()
    {
        System.out.println("arithmatic operation additon");
    }
}

class S2 extends SuperClass
{
    
}
class S3 extends SuperClass
{
    public void operation()
    {
        System.out.println("arithmatic operation Subtraction");
    }
}

/**
 * MainClass2
 */
class MainClass2 {

    public static void main(String[] args) {
        S1 s1=new S1();
        s1.operation();
        S2 s2=new S2();
        s2.operation();
        S3 s3=new S3();
        s3.operation();
    }

    
}