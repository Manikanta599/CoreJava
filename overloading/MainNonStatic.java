class Sample
{
    public void main(String s,int n)
    {
        System.out.println(s);
        System.out.println(n);
    }
    
}

public class MainNonStatic {

    public static void main(String[] args)
    {
        Sample s1=new Sample();
        s1.main("manikanta", 99);
    }
    
}


