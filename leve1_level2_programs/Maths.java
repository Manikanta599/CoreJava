class Sum
{
    public int sumOfDigits(int n)
    {
        int s=0;
        while(n>0)
        {
            int r=n%10;
            s+=r;
            n=n/10;
        }
        return s;
    }
}

class EvenOROdd
{

    

    public static void sCheck(int j)
    {
        if(j%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
    public static void check()
    {
        Sum s=new Sum();
        
        sCheck(s.sumOfDigits(45));
    
    }
}

class Maths
{
    public static void main(String[] args)
    {
        EvenOROdd.check();
    }
}