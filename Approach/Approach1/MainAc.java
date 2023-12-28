class Ac
{
    public String brand;
    public int temp;
    public String mode;

    /* public double convert(int t)
    {
        return t*(9/5)+32;
    } */

}

/**
 * MainAc
 */
class MainAc {

    public static void main(String[] args)
    {
        Ac a=new Ac();
        a.brand="samsung";
        a.temp=-10;
        a.mode="cool";
 
        System.out.println("brand "+a.brand+"\ntemp "+a.temp+"\nmode "+a.mode);
        //System.out.println("celcius to foreinheit "+a.convert(a.temp));

        if((a.temp*(9/5)+32)>=24)
        {
            System.out.println("eectricity consumption is low");
        }
        else
        {
            System.out.println("eectricity consumption is high");
        }


    }

    
}