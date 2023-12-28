public class Third {

    public void firstNonStatic()
    {
        System.out.println("first non static");
        staticMethod();
    }
    public void SecondNonStatic()
    {
        System.out.println("second non static");
    }

    public static void staticMethod()
    {
        System.out.println("static method");
        Third t=new Third();
        t.SecondNonStatic();
    }

    public static void main(String[] args)
    {
        System.out.println("main starts");
        Third t=new Third();
        t.firstNonStatic();
        staticMethod();
        System.out.println("main ends..");

    }
    
}
