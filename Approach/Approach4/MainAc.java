class Ac
{
    public String brand;
    public int temp;
    public String mode;

    public Ac(String a,int b,String c)
    {
        brand=a;
        temp=b;
        mode=c;
    }
    public void printDetails()
    {
        System.out.println("brand "+brand);
        System.out.println("temperature "+temp);
        System.out.println("mode "+mode);
    }

    public void convert()
    {
        System.out.println("celcius to foreinheit "+(temp+(9/5)+32));
    }

    public void check()
    {
        if(temp>=24)
        {
            System.out.println("eectricity consumption is low");
        }
        else
        {
            System.out.println("eectricity consumption is high");
        }
    }

}

/**
 * MainAc
 */
class MainAc {

    public static void main(String[] args)
    {
        Ac a=new Ac("LG", 17, "cool");
        Ac b=new Ac("SAMSUNG", 25, "fan");
        
        a.printDetails();
        a.convert();
        a.check();

        
        b.printDetails();
        b.convert();
        b.check();


        


    }

    
}