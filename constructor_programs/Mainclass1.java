class Sample
{
    public Sample(int a,int b)
    {
        System.out.println("a "+a);
        System.out.println("b "+b);
    }
    public Sample()
    {
        
    }
}



/**
 * Mainclass1
 */
class Mainclass1 {

    public static void main(String[] args)
    {
        Sample s1=new Sample(2, 3);
        Sample s2=new Sample(4, 3);
        Sample s3=new Sample(5, 7);
    }
    

    
}