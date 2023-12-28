public class Second {

    public void firstNonStatic()
    {
        System.out.println("first non static");
    }
    public void SecondNonStatic()
    {
        System.out.println("second non static");

    }

    public static void firstStatic()
    {
        System.out.println("first static");
        Second s1=new Second();
        s1.firstNonStatic();
    }
    public static void secondStatic()
    {
        System.out.println("second static");
        Second s2=new Second();
        s2.SecondNonStatic();
    }

    public static void main(String[] args)
    {
        Second s=new Second();
    
        firstStatic();
        secondStatic();
        s.firstNonStatic();
        s.SecondNonStatic();

    }
}
