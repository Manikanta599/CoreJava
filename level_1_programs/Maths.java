public class Maths {

    public static void sum(int a,int b)
    {
        int c=a+b;
        System.out.println(c+" addition");
    }
    public void answer()
    {
        System.out.println("answer");
        sum(2,3);
    }

    public static void main(String[] args)
    {
        System.out.println("main starts");
        Maths m=new Maths();
        m.answer();
        System.out.println("main ends..");
    }
    
}
