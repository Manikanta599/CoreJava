class Add
{
    public int add(int a,int b)
    {
        return a+b;
    }
}
class Sub
{
    public static int sub(int a,int b)
    {
        return a-b;
    }
}
class Mul
{
    public double mul(double a,double b)
    {
        return a*b;
    }
}

class Ass3
{
    public static void main(String[] args)
    {
        Add a=new Add();
        Mul m=new Mul();
        System.out.println("Addition "+a.add(5, 4));
        System.out.println("Subtration "+Sub.sub(18, 9));
        System.out.println("Multiplication "+m.mul(2.1, 3.3));
        
        
    }
}












